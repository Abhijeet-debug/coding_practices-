package com.string;

import java.util.Scanner;

public class LearnStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = sc.nextLine();
        System.out.println("Enter your Last name:");
        String lastName = sc.nextLine();

        // System.out.println("your full name is:" + firstName + " " + lastName);

        // String concatenation
        String newName = firstName + lastName;
        System.out.println(newName);
    }
}
