package java8.streams.collectors_prac;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//https://www.geeksforgeeks.org/java-collectors/?ref=gcse
//https://docs.oracle.com/javase/8/docs/api/java/util/stream/Collectors.html
//Collectors.groupingBy
//Collectors.partitioningBy
public class CollectorPracWithCity {
    public static void main(String[] args) {
//        groupByOneParameterFn();
//        groupBytwoParameterFn();
        partioningByParameterFn();
    }

    private static void groupByOneParameterFn(){
        List<City> cities = prepareTemperature();
        System.out.println("*****Original stream*****");
        cities.stream().forEach(city -> System.out.println(city));

        System.out.println("*****groupBy Structure*****");
        Map<String, List<City>> collect = cities.stream().collect(Collectors.groupingBy(City::getName));
        collect.keySet().stream().forEach(key -> System.out.println(key +" --> "+collect.get(key.toString())));

        System.out.println("*****Flattened Structure*****");
        List<City> flattedCityMap = collect.values().stream().flatMap(list -> list.stream()).collect(Collectors.toList());
        flattedCityMap.stream().forEach(key -> System.out.println(key));
    }

    private static void groupBytwoParameterFn(){
        List<City> cities = prepareTemperature();
        System.out.println("*****Original stream*****");
        cities.stream().forEach(city -> System.out.println(city));

        System.out.println("*****groupBy Structure*****");
        Map<String, Long> collect = cities.stream().collect(Collectors.groupingBy(city-> city.getName() ,Collectors.counting()));
        collect.keySet().stream().forEach(key -> System.out.println(key +" --> "+collect.get(key.toString())));
    }
    private static void partioningByParameterFn(){
        List<City> cities = prepareTemperature();
        System.out.println("*****Original stream*****");
        cities.stream().forEach(city -> System.out.println(city));

        System.out.println("*****partionedBy Structure*****");
        Map<Boolean, List<City>> collect = cities.stream().collect(Collectors.partitioningBy(city -> city.getTemperature() > 15d, Collectors.toList()));

        collect.keySet().stream().forEach(key -> {
            System.out.println(key +" : ");
            collect.get(key).forEach(city-> System.out.println(city.getName()));
        });
    }

    private static List<City> prepareTemperature()
    {
        List<City> cities = new ArrayList<>();
        cities.add(new City("New Delhi", 33.5));
        cities.add(new City("New York", 13));
        cities.add(new City("London", 15));
        cities.add(new City("Alaska", 1));
        cities.add(new City("Kolkata", 30));
        cities.add(new City("Sydney", 11));

        cities.add(new City("Mexico", 14));
        cities.add(new City("Mexico", 14));

        cities.add(new City("Dubai", 43));
        cities.add(new City("Dubai", 43));
        return cities;
    }
}
