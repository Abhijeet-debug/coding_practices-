package com.exceptionhandling;

public class PracticeException {
    public static void main(String[] args) {

//        int a[] = new int[5];
//        System.out.println("Hello team");
//
//        try {
//            int resukt = 5 / 0;
//            System.out.println(a[8]);
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("Trying to access out of bound element");
//        } catch (ArithmeticException e) {
//            System.out.println(e.fillInStackTrace());
//            System.out.println(e.getMessage());
//            System.out.println(e);
//        }
//
//        System.out.println("bye Team");

        int b[] = new int[5];
        System.out.println("Hello team");

        try {
            int result = 5 / 0;
            System.out.println(b[8]);
        } catch (Exception e) {
            System.out.println("handling the exception");
        }
//        catch (IndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
//            System.out.println("Handling the exception");
//        }
        System.out.println("Bye team");
    }
}
