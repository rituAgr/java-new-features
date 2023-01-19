package java8.functional_Interface;

import java.util.function.BiFunction;

//https://www.geeksforgeeks.org/java-bifunction-interface-methods-apply-and-addthen/?ref=gcse
public class BiFunction_functionalInterface {
    public static void main(String[] args) {
        BiFunction<Double,Integer, Double> func1 = (n1, n2)-> n1/n2;
        Double result = func1.apply(10.0,3);
        System.out.println(result);

        //andThen and then use apply
        BiFunction<Integer, Integer,Integer> func2 = (n1,n2)->n1+n2;
        BiFunction<Integer, Integer, Double> triple = func2.andThen(a -> Double.valueOf(a * 3));
        Double value = triple.apply(10, 3);
        System.out.println("Tripled amount is "+value);
    }
}
