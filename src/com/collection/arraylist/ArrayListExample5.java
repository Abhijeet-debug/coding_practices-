package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample5 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Ravi");
        al2.add("Hanumat");
        al.retainAll(al2);
        System.out.println("iterating the elements after retaining the elements of al2");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        ArrayList<String> al1 = new ArrayList<String>();
        System.out.println("Is ArrayList Empty: " + al1.isEmpty());
        al1.add("Ravi");
        al1.add("Vijay");
        al1.add("Ajay");
        System.out.println("After Insertion");
        System.out.println("Is ArrayList Empty: " + al1.isEmpty());
    }
}
