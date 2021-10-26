package com.java_collections;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(50000, "David");
        map.put(11111, "Mark");
        map.put(20000, "John");
        map.put(70000, "David");
        map.put(99999, "Daniel");
        map.put(99999, "Abc");

       for (Map.Entry entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " value: " + entry.getValue());
        }
//        map.remove(11111);
//        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(e-> System.out.println(e.getValue()));

    }
}
