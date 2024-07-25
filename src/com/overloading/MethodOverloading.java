package com.overloading;

public class MethodOverloading {
    public static void main(String[] args) {
        Greet greet = new Greet();
//        greet.grettings();
//        greet.grettings("Abhi");
        greet.grettings("Abhi", 5);
    }
}

class Greet {

    void grettings() {
        System.out.println("Hello, Good Morning");
    }

    void grettings(String name) {
        System.out.println("Hello " + name + " , Good Morning");
    }

    void grettings(String name, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Hello " + name + " , Good Morning");
        }

    }


}
