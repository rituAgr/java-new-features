package java8.functional_Interface;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

//https://www.geeksforgeeks.org/binaryoperator-interface-in-java/?ref=gcse
public class BinaryOperator_functionalInterface {
    public static void main(String[] args) {
        BinaryOperator<Double> func1 = (n1, n2)-> n1/n2;
        Double result = func1.apply(10.0, 2.0);
        System.out.println(result);

        //andThen and then use apply
        BinaryOperator<Integer> func2 = (n1,n2)->n1+n2;
        BiFunction<Integer, Integer, Double> triple = func2.andThen(a -> Double.valueOf(a * 3));
        Double value = triple.apply(10, 3);
        System.out.println("Tripled amount is "+value);
    }
}
