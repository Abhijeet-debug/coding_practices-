package com.collection.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample1 {
    public static void main(String[] args) {
//        String s = null;
//        String con = s + "hello";
//        System.out.println(con);

        LinkedList<String> al = new LinkedList<>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        Iterator<String> it = al.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");

        //Traversing the list of elements in reverse order
        Iterator<String> itr = ll.descendingIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
