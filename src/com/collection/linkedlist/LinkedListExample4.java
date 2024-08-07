package com.collection.linkedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExample4 {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("Abhi");
        list1.add("Vidit");
        list1.add("Paras");
        list1.add("Shoaib");
        list1.add("Avi");

        System.out.println(list1);

        // traverse in forward Direction
        ListIterator<String> lt = list1.listIterator();
        while (lt.hasNext()) {
            System.out.println(lt.next());
        }

        System.out.println();

        // traverse in reverse direction

        while (lt.hasPrevious()) {
            System.out.println(lt.previous());
        }
    }
}
