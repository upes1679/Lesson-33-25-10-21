package com.java_collections;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        List<String> words=new ArrayList<>();
        words.add("Hello");
        words.add("World");
        words.add("Java");
        words.add("ArrayList");
        //words.clear();
//        words.isEmpty();
//        boolean b= words.contains("Hello");
//        System.out.println(b);
//        Collection<String> anotherCollection=new ArrayList<>();
//        words.addAll(anotherCollection);
//        words.containsAll(anotherCollection);
//        words.toArray();
//        Iterator<String> itr=words.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
//        ListIterator<String> itr2=words.listIterator();
//        while(itr2.hasNext()) {
//            System.out.println("Next index "+itr2.nextIndex());
//            System.out.println( itr2.next());
//        }
//        words.forEach(s-> System.out.println(s));
        LinkedList<Double> numList=new LinkedList<>();
        numList.add(1.1);
        numList.add(2.3);
        numList.add(9.6);
        numList.add(10.0);
        Iterator<Double> reverseItr= numList.descendingIterator();
//        while (reverseItr.hasNext()){
//            System.out.println(reverseItr.next());
//        }

        HashSet<String> numbers=new LinkedHashSet<>();
        numbers.add("One");
        numbers.add("Two");
        numbers.add("Ten");
        numbers.add("Twenty");
        numbers.add(null);
//        Iterator<String> itr3= numbers.iterator();
//        while(itr3.hasNext()) {
//            System.out.println(itr3.next());
//        }
        SortedSet<Country> countries=new TreeSet<>();
        countries.add(new Country(3, "France"));
        countries.add(new Country(4, "Italy"));
        countries.add(new Country(2, "USA"));
        countries.add(new Country(1, "Israel"));

//        countries.add("Israel");
//        countries.add("France");
//        countries.add("USA");
//        countries.add("Italy");

        Iterator<Country> itr4= countries.iterator();
        while(itr4.hasNext()) {
            System.out.println(itr4.next());
        }

    }
}
