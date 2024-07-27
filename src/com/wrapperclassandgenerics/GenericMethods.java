package com.wrapperclassandgenerics;

public class GenericMethods {
    public static void main(String[] args) {
        showData(123);
        showData("Abhijeet");

        GenericMethods obj = new GenericMethods();
        obj.doubleData("123");
        obj.doubleData("Abhijeet_Kumar");
    }

    public static <E> void showData(E data) {
        System.out.println(data);
    }

    <E> void doubleData(E data) {
        System.out.println(data);
    }
}
