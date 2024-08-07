package com.collection.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample3 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Abhi");
        list.add("Vidit");
        list.add("Paras");

        System.out.println(list);

        HashSet<String> set = new HashSet<>(list);
        set.add("Vaibhaw");

        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
