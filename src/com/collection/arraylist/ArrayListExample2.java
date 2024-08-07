package com.collection.arraylist;

import java.util.*;

public class ArrayListExample2 {
    public static void main(String[] args) {
        // List of String
        List<String> list1 = new ArrayList<>();
        list1.add("Mango");
        list1.add("Apple");
        list1.add("Grapes");
        list1.add("Banana");

        // Sorting Array list
        Collections.sort(list1);

        Iterator<String> itr = list1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // List of Integer
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(13);
        list2.add(10);
        list2.add(45);
        list2.add(33);
        list2.add(56);
        list2.add(33);

        Collections.sort(list2);

        for (Integer i : list2) {
            System.out.println(i);
        }

        System.out.println();

        // Traversing through listIterator Here, element iterates in reverse order
        ListIterator<Integer> li = list2.listIterator(list2.size());
        while (li.hasPrevious()) {
            Integer i = li.previous();
            System.out.println(i);
        }
    }
}
