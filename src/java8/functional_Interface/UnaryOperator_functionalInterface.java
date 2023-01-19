package java8.functional_Interface;

import java.util.function.Function;
import java.util.function.UnaryOperator;

//https://www.geeksforgeeks.org/unaryoperator-interface-in-java/?ref=gcse
public class UnaryOperator_functionalInterface {
    public static void main(String[] args) {
        UnaryOperator<Integer> func1 = a-> a*a;
        Integer result = func1.apply(10);
        System.out.println(result);

//        andThen and then use apply
        UnaryOperator<Integer> func2 = a-> a+a;
        Function<Integer, Integer> func3 = func2.andThen(r -> r * r);
        Integer value = func3.apply(4);
        System.out.println("UnaryOperator and Then amount is "+value);
    }
}
