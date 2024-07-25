package com.methods;

public class MethodsExamples {
    public static void main(String[] args) {

//        System.out.println("1");
//        System.out.println("2");
//        greet();
//        System.out.println("3");
//        System.out.println("4");

        System.out.println("kuch bhi");
        int aveargevalue = average(5, 6, true);
        System.out.println(aveargevalue);
        System.out.println("Abhi");

    }


    static void greet() {
        System.out.println("5");
        System.out.println("Hello Family");
        System.out.println("6");
    }

//    public static void average(int a, int b) {
//        float avg = (float) (a + b) / 2;
//        System.out.println("Average is : " + avg);
//    }

    public static int average(int a, int b, boolean shouldAverage) {
        float avg = (float) (a + b) / 2;
      //  System.out.println("Abhi");
        return (int) avg;
    }

}
