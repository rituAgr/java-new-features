package java8.functional_Interface;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

//https://www.geeksforgeeks.org/java-8-predicate-with-examples/?ref=gcse
public class Predicate_functionalInterface {
    public static void main(String[] args) {
        Predicate<Integer>  isNullCheck = a-> a==null;
        Predicate<Integer>  isPositive = a-> a>=0;

        boolean result = isNullCheck.negate().and(isPositive).test(10);
        System.out.println("Is Number positive : "+result);

        IntPredicate isEqualto5 =  a -> a == 5;
        System.out.println(isEqualto5.test(3));
    }

}
