package java8.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

//https://www.java67.com/2014/04/java-8-stream-examples-and-tutorial.html

public class Java_Stream_prac {
    public static void main(String[] args) {
        countEmptyString();
        countStrLenMoreThan3();
        removeEmptyStr();
        toUppercaseJoinStr();
        stats();
        autoboxing_Unboxing_IntStream();
    }
    //Counting Empty String
    private static void  countEmptyString(){
        List<String> strings = asList("Geeks", "for", "", "Geeks", "");
        long count = strings.stream().filter(str -> str.isEmpty()).count();
        System.out.println("Count of empty string is "+count);
    }

    //Count String whose length is more than three
    private static void  countStrLenMoreThan3(){
        Stream<String> strings = Stream.of("Geeks", "for", "", "Geeks", "");
        long count = strings.filter(str -> str.length()>3).count();
        System.out.println("Count String whose length is more than three is "+count);
    }

    //Remove all empty Strings from List
    private static void  removeEmptyStr(){
        Stream<String> strings = Stream.of("Geeks", "for", "", "Geeks", "");
        List<String> nonEmptyStrings = strings.filter(str -> !str.isEmpty()).collect(Collectors.toList());
        nonEmptyStrings.stream().forEach(str-> System.out.println(str));
    }

    //Convert String to uppercase and Join them with coma
    private static void  toUppercaseJoinStr(){
        Stream<String> strings = Stream.of("Geeks", "for", "", "Geeks", "");
        String resultStr = strings.map(str -> str.toUpperCase()).reduce("", (ele, result) -> ele.concat(result).concat(", "));
        System.out.println("Concated String is "+resultStr);
    }

    //Get count, min, max, sum, and the average for numbers
    private static void  stats(){
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = primes.stream() .mapToInt((x) -> x) .summaryStatistics();
        System.out.println("Max num is "+stats.getMax());
        System.out.println("Min num  is "+stats.getMin());
        System.out.println("count is "+stats.getCount());
        System.out.println("Sum is "+stats.getSum());
        System.out.println("Avg is "+stats.getAverage());
    }
    private static void autoboxing_Unboxing_IntStream(){
        Stream<Integer> s = IntStream.range(1,11).boxed();
        s.forEach(i-> System.out.println(i));


        Stream<Integer> integerStream = Stream.of(1, 3, 5, 7, 10);
        IntStream intStream = integerStream.mapToInt(i->i.intValue());
        intStream.forEach(i-> System.out.print(i+" "));
    }



}
