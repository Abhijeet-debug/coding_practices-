package com.learnenabstraction;

public class LearnAbstraction {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.accelerate();
        c1.breaking(4);
        c1.honks();

    }
}

abstract class Vehicle {
    abstract void accelerate();

    abstract int breaking(int wheels);

    void honks() {
        System.out.println("Vehicle honks");
    }
}

class Car extends Vehicle {

    @Override
    void accelerate() {
        System.out.println("car is accelearting");
    }

    @Override
    int breaking(int wheels) {
        System.out.println("car breaks are pushed");
        return wheels;
    }

    void honks() {
        System.out.println("Car is honking");
    }
}
