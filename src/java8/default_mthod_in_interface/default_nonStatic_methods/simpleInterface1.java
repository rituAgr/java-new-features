package java8.default_mthod_in_interface.default_nonStatic_methods;

public interface simpleInterface1 {
    default void printStatement(int n){
        System.out.println("The number is "+n);
    }
}
