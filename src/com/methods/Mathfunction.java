package com.methods;

public class Mathfunction {
    public static void main(String[] args) {
//        int a = 5;
//        int b = 6;
//
//        System.out.println(Math.min(a, b));
//        System.out.println(Math.sqrt(16));
//        System.out.println(Math.pow(a, b));
//
//        System.out.println(Math.random());
//        System.out.println(getRandom(12,17));

        boolean isfibbonaci = checkMember(234);
        System.out.println(isfibbonaci);

    }

    // get random value between two numbers
    public static int getRandom(int a, int b) {
        return (int) (Math.random() * (b - a + 1) + a);
    }

    // check fibbonaci number
    public static boolean checkMember(int n) {
        if (n == 0)
            return true;

        int f1 = 0;
        int f2 = 1;
        int i = 1;
        while (i <= n) {
            int sum = f1 + f2;
            f1 = f2;
            f2 = sum;
            if (f2 == n) {
                return true;
            }
            i++;
        }
        return false;

    }
}
