package java8.functional_Interface;

import java.util.function.Supplier;

public class Supplier_functionalInterface {
    public static void main(String[] args) {
        Supplier<Integer> randomInt = ()-> ((int)(Math.random()*100));
        System.out.println(randomInt.get());
    }
}
