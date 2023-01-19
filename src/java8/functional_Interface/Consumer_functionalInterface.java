package java8.functional_Interface;

/*A functional interface is simply an interface with only one non-default, non-static method, ANSTRACT methos
All interfaces that satisfy that definition can be implemented through a lambda in Java 8

    Consumer<T> which has a void accept(T t)
        Supplier<T> which has a T get()
        Function<T, R> which has a R apply(T t)
        Predicate<T> which as a boolean test(T t)
 */
//https://www.geeksforgeeks.org/java-8-consumer-interface-in-java-with-examples/?ref=gcse

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Consumer_functionalInterface {
    public static void main(String[] args) {
        Consumer<Integer> d = (a) -> System.out.println(a);
        d.accept(1);

        BiConsumer<Integer, Integer> bi = (a, b) -> System.out.println(a + b);
        bi.accept(2, 3);

        Consumer<List<String>> consumer = list -> {
            for (String str : list) {
                System.out.println(str + "i");
            }
        };
        List<String> ll = List.of("John", "is ", "good");
    }
}
