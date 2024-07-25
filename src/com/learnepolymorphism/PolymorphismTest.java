package com.learnepolymorphism;

class Data {
    int data;

    public void showData() {
        System.out.println("Inside Parent Data Class");
    }
}

class ChildData extends Data {
    public void showData() {
        System.out.println("Inside child class " + data);
    }

    public void showAnything() {
        System.out.println("Showing Anything inside child class");
    }
}

public class PolymorphismTest {
    public static void main(String[] args) {
//        int a = 5;
//        Data obj = new Data();
//        obj.data = 5;
//        changeData(5, obj);
//        System.out.println(a);
//        System.out.println(obj.data);

        Data obj1;
        obj1 = new ChildData();
        obj1.showData();

    }

    static void changeData(int a, Data obj) {
        a = 10;
        obj.data = 100;
    }
}
