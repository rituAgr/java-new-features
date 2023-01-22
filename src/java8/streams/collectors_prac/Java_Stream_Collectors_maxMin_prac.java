package java8.streams.collectors_prac;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//https://www.geeksforgeeks.org/java-collectors/?ref=gcse

//Collectors.joining
//Collectors.mapping

public class Java_Stream_Collectors_maxMin_prac {
    public static void main(String[] args) {
        countEmptyString();

    }
    //Counting Empty String
    private static void  countEmptyString() {


        String[] strList = {"geeks", "for", "geeks", "ABC", "zjs", "Geeks"};
        Optional<String> collect1 = Arrays.stream(strList).collect(Collectors.maxBy(Comparator.naturalOrder()));
        Optional<String> collect2 = Arrays.stream(strList).collect(Collectors.minBy(Comparator.reverseOrder()));
        System.out.println(collect1.get());
        System.out.println(collect2.get());
    }

}
