package com.loops;

import java.util.Scanner;

public class LearnLoops {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n = sc.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(n+ " * " + i + " = " +i * n);
//        }

        // Sum of n integer numbers
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n = sc.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum = sum + i;
//        }
//        System.out.println("Sum of " + n + " Integer Numbers is : " + sum);

        // Sum of n even numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum = sum + 2*i;
//        }
//        System.out.println("Sum of " + n + " Even Numbers is : " + sum);
        for (int i = 2; i <= 2 * n; i = i + 2) {
            sum = sum + i;
        }
        System.out.println("Sum of " + n + " Even Numbers is : " + sum);


    }
}
