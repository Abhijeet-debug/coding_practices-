package com.inhertitance;

public class Vehicle {

    int wheelCount;
    String model;

    Vehicle() {
        System.out.println("Creating a vehicle insatance");
    }

    Vehicle(int wheelCount) {
        this.wheelCount = wheelCount;
        System.out.println("Creating vehicle with wheels ");
    }

    void start() {
        System.out.println("Vehicle is starting");
    }
}
