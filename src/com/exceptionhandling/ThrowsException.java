package com.exceptionhandling;

import java.sql.SQLOutput;

public class ThrowsException {
    public static void main(String[] args) {

        int a[] = new int[5];
        try {
            System.out.println(getNumberOfArray(a));
        } catch (Exception e) {
            System.out.println("Handled exception" + e.getMessage());
        }
    }

    public static int getNumberOfArray(int a[]) throws ArithmeticException {
        return a[9];
    }
}
