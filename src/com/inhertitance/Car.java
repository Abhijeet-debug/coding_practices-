package com.inhertitance;

public class Car extends Vehicle {

    String colour;

    Car() {
        super(3);
        System.out.println("Car is beinng Created");
    }

    void start() {
        System.out.println(this);
        System.out.println(this.model + " Car is starting");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.model = "i10";
        c.wheelCount = 4;
        c.start();
        c.colour = "red";
    }
}
