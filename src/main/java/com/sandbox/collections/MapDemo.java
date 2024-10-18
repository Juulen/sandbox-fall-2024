package com.sandbox.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7 ,"seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");

        System.out.println("map: "+ map);

        Map<Integer, ArrayList<Map>> map2 = new HashMap<>();
    }
}
