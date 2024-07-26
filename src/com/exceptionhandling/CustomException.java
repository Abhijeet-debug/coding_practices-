package com.exceptionhandling;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        try {
            int age = sc.nextInt();
            if (age > 100) {
                // throw new MyException("my error is this");
                // throw new ArithmeticException("More than 100 is not allowed");
                throw new ArithmeticException();
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

class MyException extends Exception {

    public MyException(String message) {
        super(message);
    }

}
