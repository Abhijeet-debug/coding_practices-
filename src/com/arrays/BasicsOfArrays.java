package com.arrays;

public class BasicsOfArrays {
    public static void main(String[] args) {
//        int age[];  // Declaration
//        age = new int[5]; // Allocation
//
//        age[0] = 5;
//        age[1] = 6;
//
//
//        System.out.println(age[0]);
//        System.out.println(age[1]);
//        System.out.println(age[2]);
//
//
//        System.out.println(age.length);

//        int age[] = {21, 22, 34, 54, 45};
//        System.out.println(age[0]);
        //   System.out.println(age[7]); // give index out of bound exception

        String names[] = {"Abhi", "Golu", "vidit", "Paras"};

        // using for loop
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);

        // using for each loop

//        for (String name : names) {
//            System.out.println(name);

        // Sum of numbers
//        int numbers[] = {12, 23, 3, 45, 56, 87, 2};
//        int sum = 0;
//        for (int number : numbers) {
//            sum = sum + number;
//        }
//
//        System.out.println("sum is : " + sum);

        // Smallest number in an Array
//        int numbers[] = {12, 23, 3, 45, 56, 87, 2};
//        int min = Integer.MAX_VALUE;
//        for (int number : numbers) {
//            if (number < min) {
//                min = number;
//            }
//        }
//        System.out.println("Smallest number is :" + min);

        // Maximum number in an Array
//        int numbers[] = {12, 23, 3, 45, 56, 87, 2};
//        int max = Integer.MIN_VALUE;
//        for (int number : numbers) {
//            if (number > max) {
//                max = number;
//            }
//        }
//        System.out.println("Maximum number is :" + max);

        // find 2nd maximum number in an array
        int a[] = {3, 24, 2, 5, 4, 76, 23};
        int max1, max2;
//        max1 = max2 = Integer.MIN_VALUE;
        max1 = max2 = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];
            } else if (a[i] > max2) {
                max2 = a[i];
            }
        }
        System.out.println("2nd Largest number is : " + max2);


    }
}

