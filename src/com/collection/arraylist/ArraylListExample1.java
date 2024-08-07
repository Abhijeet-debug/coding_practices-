package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylListExample1 {
    public static void main(String[] args) {
        //Creating arraylist
        ArrayList<String> list1 = new ArrayList<>();
        //Adding object in arraylist
        list1.add("Mango");
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Grapes");
        //Printing the arraylist object
        System.out.println(list1);

        //Traversing list through Iterator
        Iterator<String> itr = list1.iterator();//getting the Iterator
        while (itr.hasNext()) {//check if iterator has the elements
            System.out.println(itr.next());//printing the element and move to next
        }

        //Traversing list through for-each loop
        for (String s : list1) {
            System.out.println(s);
        }

        //accessing the element
        System.out.println("Fetched Element :" + list1.get(1));

        // Changing the element
        list1.set(1, "Abhijeet");
        System.out.println(list1);

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }


    }
}
