package java8.functional_Interface;

import java.util.function.Function;
//https://www.geeksforgeeks.org/function-interface-in-java-with-examples/?ref=gcse
public class Function_functionalInterface {
    public static void main(String[] args) {
        Function<Integer, Double> func1 = a-> a/2.7;
        Double result = func1.apply(10);
        System.out.println(result);

        //andThen and then use apply
        Function<Integer, Integer> func2 = a->a/2;
        Function<Integer, Integer> triple = func2.andThen(a -> a * 3);
        Integer value = triple.apply(10);
        System.out.println("Tripled amount is "+value);
    }
}
