package com.string;

public class StringBasics {
    public static void main(String[] args) {
        String name = "Abhi";
        String sameName = "ABHI";
        String newName = new String("Abhijeet");
//
//        if (name == saneName)
//            System.out.println("both are same");
//
//
//        if (name == newName) {
//            System.out.println("both are same");
//        } else {
//            System.out.println("both are not same");
//        }

//        if (name.equals(newName)) {
//            System.out.println("both are same");
//        } else {
//            System.out.println("both are not same");
//        }

        if (name.equalsIgnoreCase(sameName)) {
            System.out.println("both are same");
        }

    }
}
