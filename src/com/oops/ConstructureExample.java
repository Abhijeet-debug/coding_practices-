package com.oops;

public class ConstructureExample {
    public static void main(String[] args) {
        Complex num1 = new Complex(2, 4);
        Complex num2 = new Complex(4, 1);
        num1.print();
        num2.print();
        System.out.println("Adding two numbers");
        Complex result = num1.add(num2);
        System.out.println(result);
        result.print();
    }
}


class Complex {
    int a, b;


    // Dafault Constructure
//    public Complex() {
//        a = 0;
//        b = 0;
//    }


    public Complex(int real) {
        a = real;
        b = 12;
    }

    public Complex(int real, int imajinary) {
        this.a = real;
        this.b = imajinary;
    }


    void print() {
        System.out.println(a + " + " + b + "i");
    }

    Complex add(Complex num2) {
        return new Complex(a + num2.a, b + num2.b);
    }
}
