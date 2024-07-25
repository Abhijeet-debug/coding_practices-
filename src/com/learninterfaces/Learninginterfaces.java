package com.learninterfaces;

public class Learninginterfaces {
    public static void main(String[] args) {
//        Monkey monkey = new Monkey();
//        monkey.drinks();
//        monkey.eats();
//        monkey.sings();
//        System.out.println(Animal.LEGS);

        Lambda1 obj1 = (steps) -> steps;
        System.out.println(obj1.showSteps(5));

    }
}

@FunctionalInterface
interface Lambda1 {
    int showSteps(int steps);
}

interface Pet {
    void sings();

    void eats();
}

interface Animal {

    public static final int LEGS = 4;

    void eats();

    void drinks();
}

class Monkey implements Pet, Animal {

    @Override
    public void drinks() {
        System.out.println("Monkey is drinking");
    }

    @Override
    public void sings() {
        System.out.println("Monkey is Singing");
    }

    @Override
    public void eats() {
        System.out.println("Monkey is eating");
    }
}
