package com.arrays;

public class LearnVarArgs {

    public static void showNumbers(int... A) {
        for (int a : A) {
            System.out.println(a + " ");
        }
    }

    static int max(int... A) {
        if (A.length == 0) return Integer.MIN_VALUE;
        int max = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] >= max) {
                max = A[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

//        showNumbers();
//        showNumbers(10, 20, 30);
//        showNumbers(55, 76, 23, 12, 34, 55, 32, 3, 4);
      //  showNumbers(new int[]{11, 22, 33, 44, 55});

        System.out.println(max(10,20,30));
        System.out.println(max(39,59,78));
//        showNumbers(12,13,10);
//        showNumbers(12,13,40);
//        showNumbers(12,13,50);


    }
}
