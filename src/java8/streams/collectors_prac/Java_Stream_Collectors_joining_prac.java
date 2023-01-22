package java8.streams.collectors_prac;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//https://www.geeksforgeeks.org/java-collectors/?ref=gcse

//Collectors.joining
//Collectors.mapping

public class Java_Stream_Collectors_joining_prac {
    public static void main(String[] args) {
        countEmptyString();

    }
    //Counting Empty String
    private static void  countEmptyString() {
        char[] ch = {'G', 'e', 'e', 'k', 's', 'f', 'o',
                'r', 'G', 'e', 'e', 'k', 's'};
        String collect = Stream.of(ch).map(c -> new String(c)).collect(Collectors.joining());
        System.out.println(collect);

        String[] strArray = {"geeks", "for", "geeks"};
        String collect1 = Arrays.stream(strArray).collect(Collectors.joining(" "));
        String collect2 = Arrays.stream(strArray).collect(Collectors.joining(" ","**", "--"));
        System.out.println(collect1);
        System.out.println(collect2);
    }

}
