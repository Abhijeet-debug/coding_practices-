import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // System.out.println("Hello World");

        // Variable
        // primitive
        /* String name = "Abhijeet";
        int age = 26;
        String neighbour = "Vidit";

        String friend = neighbour;
        byte num = 39;
        int num1 = 1234567788;
        long num2 = 12376546283279L;
        char letter = 'a';
        double pi = 3.14F; */

        // Non primitive
        // Strings
        // length function

//        String name = "Abhijeet";
//        System.out.println(name.length());


        // concatenate

//        String name1 = "Abhijeet";
//        String name2 = "Kumar";
//        String name3 = name1 + name2;
//        System.out.println(name3);

        // charAt

//        String name = "Abhijeet";
//        System.out.println(name.charAt(1));

//        replace

//        String name = "Abhijeet";
//        String name2 = name.replace('e', 'r');
//        System.out.println(name2);
//        System.out.println(name);

        // Arrays

//        int[] marks = new int[3];
//        marks[0] = 98;
//        marks[1] = 97;
//        marks[2] = 96;

//        System.out.println(marks[0]);
        // length function
//        System.out.println(marks.length);

        // sort
//        Arrays.sort(marks);
//        System.out.println(marks[0]);

//        int[] marks = {96, 98, 94};
//        int[][] marksStudent = {{98, 97, 94}, {96, 98, 97}};
//        System.out.println(marksStudent[0][1]);

        // Casting
        // implicit

//        double price = 100.00;
//        double finalPrice = price + 18;
//        System.out.println(finalPrice);

        // Explicit

//        int p = 18;
//        int fp = 18 + (int)100.18;
//        System.out.println(fp);

        // Constants

        //   int num = 1;
        // System.out.println(num++);
//        System.out.println(++num);
//        System.out.println(num);

        // Math function
//        int num1 = 5;
//        int num2 = 8;
//        System.out.println(Math.max(num1,num2));
//        System.out.println(Math.min(num1,num2));
//        System.out.println((int)Math.random()*100);

        // How to take input
        // Scanner Class

//        Scanner sc = new Scanner(System.in);
//        int age;
//        System.out.println("Enter your age := ");
//        age = sc.nextInt();
//        System.out.println(age);

//        String name;
//        System.out.println("Enter your name : ");
        // name = sc.next();
//        name = sc.nextLine();
//        System.out.println("your name is : " + name);

        // Comparision Operator
//        a == b;
//        a != b;
//        a > b;
//        a < b;
//        a >= b;
//        a <= b;

        // Conditional stt

//        boolean isSunUp = true;
//        if (isSunUp)
//            System.out.println("Day");
//        else
//            System.out.println("night");
//
//        int age = 30;
//        if (age > 18)
//            System.out.println("can vote");
//        else System.out.println("Can't vote");

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter cash Amount you have : ");
//        int cash = sc.nextInt();
//        // pen = 10 , copy = 40
//        if (cash < 10) {
//            System.out.println("Can't buy anything");
//            System.out.println("get more cash");
//        } else if (cash > 10 && cash < 50) {
//            System.out.println("cant get one item");
//
//        } else System.out.println("can get both");

        System.out.println("Int Min: " + Integer.MIN_VALUE);
        System.out.println("Int Max: " + Integer.MAX_VALUE);
        System.out.println("Int Bytes :" + Integer.BYTES);

        System.out.println("Byte Min: " + Byte.MIN_VALUE);
        System.out.println("Byte Max: " + Byte.MAX_VALUE);
        System.out.println("Byte Bytes :" + Byte.BYTES);

        System.out.println("FLoat Min: " + Float.MIN_VALUE);
        System.out.println("Float Max: " + Float.MAX_VALUE);
        System.out.println("Float Bytes :" + Float.BYTES);


    }
}