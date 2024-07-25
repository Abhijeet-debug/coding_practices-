package com.learnencapsulation;

public class Main {

    static {
        System.out.println("Inside the Static block");
    }

    public static void main(String[] args) {

        System.out.println("Starting from main");
        Person p1 = new Person();
        p1.setAge(12);
        System.out.println(p1.getAge());

        Person p2 = new Person();
        System.out.println(Person.count);
    }
}
