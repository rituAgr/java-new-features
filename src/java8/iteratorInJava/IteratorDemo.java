package java8.iteratorInJava;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = IntStream.range(1, 11).boxed().collect(Collectors.toList());
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            Integer num = iterator.next();
            if(num%5==0)
                iterator.remove();
        }
        list.forEach(System.out::println);
    }
}
