package com.javapractice;

public class Main {

    public static void main(String[] args) {

        StringManipulation stringManipulation;
        stringManipulation = new StringManipulation();

        // -------------------------------------------------- Sherlock and the Valid String:
        System.out.println(stringManipulation.isValid("a"));
        // TEST: GOOD

        // -------------------------------------------------- Making Anagrams:
        System.out.println(stringManipulation.makeAnagram("cde", "abc"));
        // TEST: GOOD

        // -------------------------------------------------- firstUniqueCharacter in a string:
        System.out.println(stringManipulation.firstUniqueCharacter("aabbbccccdeee"));
        // TEST: GOOD

        // ------------------------------
    }
}
