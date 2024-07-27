package com.wrapperclassandgenerics;

public class WrapperClassTest {
    public static void main(String[] args) {
        // Integer obj1 = new Integer(12);

        // System.out.println(obj1);

        Integer obj2 = Integer.valueOf(134);
        System.out.println(obj2 * 2);

        Boolean myboolean = Boolean.valueOf(false);

        Integer obj3 = 14; //autoboxing
        int obj4 = obj2;
        System.out.println(obj3 + "\n" + obj4);
    }
}
