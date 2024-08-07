package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
    int rollno;
    String name;
    int age;

    public Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}

public class ArrayListExample3 {
    public static void main(String[] args) {

        //Creating user-defined class objects
        Student s1 = new Student(101, "Sonoo", 23);
        Student s2 = new Student(102, "Ravi", 21);
        Student s3 = new Student(103, "Hanumat", 25);

        //Creating user-defined class objects
        ArrayList<Student> s = new ArrayList<>();
        s.add(s1);
        s.add(s2);
        s.add(s3);

        Iterator<Student> i = s.iterator();
        while (i.hasNext()) {
            Student student = (Student) i.next();
            System.out.println(student.rollno + " " + student.name + " " + student.age
            );
        }

    }
}
