package java8.iteratorInJava;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IteratorDemo_java8 {
    public static void main(String[] args) {
        List<Integer> list = IntStream.range(1, 11).boxed().collect(Collectors.toList());
        list.removeIf(num -> num % 5 == 0);
        list.forEach(System.out::println);
    }
}
