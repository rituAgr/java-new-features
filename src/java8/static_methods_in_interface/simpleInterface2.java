package java8.static_methods_in_interface;

public interface simpleInterface2 {
    //static method in interface can have implementation
     static void printStatement(int n){
        System.out.println("simpleInterface2: The Number is "+n);
    }
}
