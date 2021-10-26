package com.java_collections;

import java.util.*;

public class Main5 {
    public static void main(String[] args) {
        Properties props=new Properties();
        props.put("Student A","Java Class");
        props.put("Student B","Java Class");
        props.put("Student C","C# Class");
        props.put("Student D","Python Class");
        props.put("Student E","C# Class");

        Set<Object> set=props.keySet();
        for (Object obj:set) {
            System.out.println(obj+" is studying in " +props.getProperty(obj.toString()));
        }


    }
}
