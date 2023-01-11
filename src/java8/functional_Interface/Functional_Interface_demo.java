package java8.functional_Interface;

/*A functional interface is simply an interface with only one non-default, non-static method, ANSTRACT methos
All interfaces that satisfy that definition can be implemented through a lambda in Java 8

    Consumer<T> which has a void accept(T t)
        Supplier<T> which has a T get()
        Function<T, R> which has a R apply(T t)
        Predicate<T> which as a boolean test(T t)
 */
//https://www.geeksforgeeks.org/functional-interfaces-java/?ref=gcse

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Functional_Interface_demo {
    public static void main(String[] args) {
        Consumer<Integer> d = (a) -> System.out.println(a);
        d.accept(1);

        BiConsumer<Integer , Integer> bi = (a, b) -> System.out.println(a+b);
        bi.accept(2,3);
    }
}
