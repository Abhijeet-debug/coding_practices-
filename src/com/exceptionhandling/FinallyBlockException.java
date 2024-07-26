package com.exceptionhandling;

public class FinallyBlockException {
    public static void main(String[] args) {
        int a[] = new int[5];

        System.out.println("Hello team");

        try {
            System.out.println(a[9]);
        } catch (Exception e) {
            System.out.println("Handled the exception");
        } finally {
            System.out.println("Always executes");
        }
        System.out.println("bbye team");
    }
}
