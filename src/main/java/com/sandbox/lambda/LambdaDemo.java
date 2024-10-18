package com.sandbox.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaDemo {
    public static void main(String[] args) {

        // x -> x * 2
        // anonymous function

        // 4 classes
        //predicates - takes 1 value returns boolean
        Predicate<String> predicate = x -> x.startsWith("a");

        // Function - take 1 value and return a value
        Function<Integer, Integer> function = x-> {
            x = x+5;
            return x * 2;
        };

        // Supplier - takes nothing returns 1 value
        Supplier<String> supplier = () -> "Hello World";

        // Consumer - takes one value returns nothing
        Consumer<String> consumer = x -> System.out.println(x);
        Consumer<String> consumer2 = System.out::println;

        List<String> myList = Arrays.asList("a1", "a2", "b1", "b2", "c2", "c1");

        myList.stream()
                .sorted()
                .filter(x -> x.startsWith("c"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
