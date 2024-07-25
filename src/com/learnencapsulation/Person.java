package com.learnencapsulation;

public class Person {
    private int age;
    private String name;

    public static int count = 0;

    public Person() {
        count++;
    }

    boolean isAccessible = true;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
//    public void setAge(int age) {
//        if (isAccessible) {
//            this.age = age;
//        }
//
//    }


    public int getAge() {
        return age;
    }
}
