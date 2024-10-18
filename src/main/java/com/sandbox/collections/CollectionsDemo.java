package com.sandbox.collections;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {

        Set<String> set1 = new LinkedHashSet<>();
        Set<String> set2 = new HashSet<>();
        Set<String> set3 = new TreeSet<>();

        set2.add("Hi");
        set2.add("Howdy");
        set2.add("Hi");
        set2.add("Hello");
        set2.add("Hi");
        set2.add("Hola");
        set2.add("There");

        System.out.println("Set2: " + set2);

        set1.add("Hi");
        set1.add("Howdy");
        set1.add("Hi");
        set1.add("Hello");
        set1.add("Hi");
        set1.add("Hola");
        set1.add("There");

        System.out.println("Set1: " + set1);

        set1.remove("Hi");
        //System.out.println("Set 1: " + set1);

        set3.add("Hi");
        set3.add("Howdy");
        set3.add("Hi");
        set3.add("Hello");
        set3.add("Hi");
        set3.add("Hola");
        set3.add("There");

        System.out.println("Set3: " + set3);

    }
}
