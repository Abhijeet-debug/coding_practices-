package com.wrapperclassandgenerics;

public class LearnGenerics {
    public static void main(String[] args) {
        Dog<Integer> d1 = new Dog<>(13);
        Dog<String> d2 = new Dog<>("Leo123");

        System.out.println(d1.getId());

        Cat<String, Integer> c1 = new Cat<>("leo", 12);
        Cat<Integer, String> c2 = new Cat<>(12, "Leo");

        System.out.println(c1);
        System.out.println(c2);
    }
}

class Dog<E> {
    E id;

    public Dog(E id) {
        this.id = id;
    }

    E getId() {
        return id;
    }

}

class Cat<E, V> {
    E id;
    V name;

    public Cat(E id, V name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
