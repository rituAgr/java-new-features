#### Main advantages of using Java 8?
1. More compact code
2. Less boilerplate code

#### Java 8 main features
1. Lambda Expression
2. Stream API
3. Default methods in the interface 
4. Functional Interface
5. Optional
6. Method references
7. [Date API](https://www.youtube.com/watch?v=9hUEiu_Ts68&ab_channel=CodeWithZ)
8. Nashorn, JavaScript Engine

#### Links -
* [Default Method in interface](https://www.geeksforgeeks.org/default-methods-java/)
* [Static methods in interface](https://www.geeksforgeeks.org/static-method-in-interface-in-java/?ref=gcse)
* [Functional Interface or SAM(Single Abstract Method) interfaces](https://www.geeksforgeeks.org/functional-interfaces-java/?ref=gcse)\
* [Access modifier for interface](https://www.geeksforgeeks.org/access-modifiers-for-classes-or-interfaces-in-java/?ref=rp)
* [Optional](https://www.geeksforgeeks.org/java-8-optional-class/)

#### Function
* [`Function` functional interface](https://www.geeksforgeeks.org/function-interface-in-java-with-examples/?ref=gcse)
* [`BiFunction` functional interface](https://www.geeksforgeeks.org/java-bifunction-interface-methods-apply-and-addthen/?ref=gcse)
* [`UnaryOperator` functional interface](https://www.geeksforgeeks.org/unaryoperator-interface-in-java/?ref=gcse)
* [`BinaryOperator` functional interface](https://www.geeksforgeeks.org/binaryoperator-interface-in-java/?ref=gcse)\
  UnaryOperator & BinaryOperator are more specific form of `Function` and `Bifunction` functional interface where that datatype is same with input & output params

#### Consumer 
* [`Consumer` functional interface](https://www.geeksforgeeks.org/java-8-consumer-interface-in-java-with-examples/?ref=gcse)
* [`BiConsumer` functional interface](https://www.geeksforgeeks.org/java-8-biconsumer-interface-in-java-with-examples/?ref=gcse)\
   Consumer takes in one input parameter and there is no return type (return type is void)\
   BiConsumer takes in two input parameter and there is no return type (return type is void)

#### Supplier
* [`Supplier` functional interface](https://www.geeksforgeeks.org/supplier-interface-in-java-with-examples/?ref=gcse)

#### Predicate
* [Link](https://www.geeksforgeeks.org/java-8-predicate-with-examples/?ref=gcse)
* [BiPredicate]()

----

#### [Lambda Expressions](https://www.geeksforgeeks.org/lambda-expressions-java-8/?ref=gcse)
[youtube link](https://www.youtube.com/watch?v=oUdENE7ljjw&ab_channel=CodeDecode) at 4 min
Note that lambda expressions can only be used to implement functional interfaces

----

#### Stream in java8
* [Stream in java](https://www.geeksforgeeks.org/stream-in-java/)
* [10 Ways to Create a Stream in Java](https://www.geeksforgeeks.org/10-ways-to-create-a-stream-in-java/?ref=gcse)
* [Difference between IntStream & Stream<Integer>](https://stackoverflow.com/questions/64974871/what-is-the-difference-between-intstream-and-streaminteger#:~:text=on%20this%20post.-,What%20is%20the%20difference%20between%20both%3F,of%20methods%20in%20the%20javadoc.)
* [Basic Boxing and Unboxing in java](https://www.geeksforgeeks.org/autoboxing-unboxing-java/)
* [Boxing Unboxing in stream](https://www.geeksforgeeks.org/intstream-boxed-java/?ref=gcse)
* [Collectors in java stream](https://www.geeksforgeeks.org/java-collectors/?ref=gcse)

* Intermediate Operations:
     - map()
     - filter()
     - sorted()
     - distinct()
   * Terminal Operations:
     - anyMatch()
     - collect()
     - count()
     - findFirst()
     - min()
     - max()
     - sum()
     - average()
* [St- reams Practice link1](https://www.java67.com/2014/04/java-8-stream-examples-and-tutorial.html) - done
* [Streams Practice link2](https://blog.devgenius.io/15-practical-exercises-help-you-master-java-stream-api-3f9c86b1cf82)
 ```
Arrays.stream(<arrayname>)
Stream.of(...values)
IntStream, Stream, Stream<Integer>
```
* [difference-between-stream-of-and-arrays-stream-method-in-java](https://www.geeksforgeeks.org/difference-between-stream-of-and-arrays-stream-method-in-java/?ref=rp)
* [Method Reference link](https://www.geeksforgeeks.org/method-references-in-java-with-examples/?ref=gcse)
* [Method Reference video](https://www.youtube.com/watch?v=5rbdwovjbw4&ab_channel=JavaTechie)
