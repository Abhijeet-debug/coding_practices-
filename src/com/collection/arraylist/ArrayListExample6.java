package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample6 {
    public static void main(String[] args) {

        //Converting ArrayList to Array
        //creating Arraylist
        List<String> fruitList = new ArrayList<>();
        //adding String Objects to fruitsList ArrayList
        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        fruitList.add("Pineapple");
        System.out.println("Converting ArrayList to Array");
        String[] item = fruitList.toArray(new String[fruitList.size()]);
        for (String s : item) {
            System.out.println(s);
        }
        System.out.println("Converting Array to ArrayList");
        List<String> l2 = new ArrayList<>();
        l2 = Arrays.asList(item);
        System.out.println(l2);
    }
}
