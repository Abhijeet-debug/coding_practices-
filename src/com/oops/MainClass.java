package com.oops;

public class MainClass {
    public static void main(String[] args) {
//        System.out.println("Abhijeet");
//        Dog d1 = new Dog();
//        d1.name = "Tommy";
//        d1.bark();
//
//        Dog d2 = new Dog();
//        d2.name = "leo";
//        d2.walk();
        Complex1 c = new Complex1();
        c.a = 2;
        c.b = 5;
        c.print();
    }
}

class Complex1 {
    int a, b;

    void print() {
        System.out.println(a + " + " + b + "i");
    }
}
