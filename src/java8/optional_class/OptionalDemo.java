package java8.optional_class;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String[] strArr = new String[10];
        String word = strArr[0];
//        System.out.println(word.toLowerCase());// This will render NUllPointer exception

        //Creating Optional container with Optional.ofNullable()
        Optional<String> str = Optional.ofNullable(strArr[0]);
        if (str.isPresent())
            System.out.println(word.toLowerCase());
        else
            System.out.println("Null String");

        //Demo for ifPresentOrElse method of Optional
        Optional<String> str2 = Optional.ofNullable(strArr[1]);
        str2.ifPresentOrElse((num) -> System.out.println(num), () -> System.out.println("Empty"));

        //Difference between and Optional.ofNullable and Optional.of
        //https://stackoverflow.com/questions/31696485/why-use-optional-of-over-optional-ofnullable#:~:text=ofNullable%20is%20that%20if%20the,element%2Fobject%20and%20returns%20Optional.
    }
}
