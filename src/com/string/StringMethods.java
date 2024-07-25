package com.string;

public class StringMethods {
    public static void main(String[] args) {
//        String name = "ABhijEEt kumaR  ";
//        System.out.println(name.toUpperCase());
//        System.out.println(name.toLowerCase());
//        System.out.println(name.trim());
//        System.out.println(name.startsWith("AB"));

//        int age = 123;
//        String ageName = String.valueOf(123);
//        System.out.println(age + 2);
//        System.out.println(ageName + 2);

        // replace function

//        String sentence = "I love Java, and Java is a good language";
//        String newSentence = sentence.replace("Java", "python");
//        System.out.println(sentence);
//        System.out.println(newSentence);
//        System.out.println(sentence.contains("good"));

        // String sentence = "I love Java, and Java is a good language";
        // String words[] = sentence.split(" ");
//        String words[] = sentence.split(",");
//        for (String word : words) {
//            System.out.println(word);
//        }
        String colour = "Violet";
        char letters[] = colour.toCharArray();
        for (char letter : letters) {
            System.out.println(letter);
        }

        String name = "";
        if (name.isEmpty()) {
            System.out.println("Hii this is empty");
        } else System.out.println("Not Empty");
    }
}
