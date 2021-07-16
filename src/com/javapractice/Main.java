package com.javapractice;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        StringManipulation stringManipulation;
        stringManipulation = new StringManipulation();

        // -------------------------------------------------- Sherlock and the Valid String:
        System.out.println(stringManipulation.isValid("a"));
        // TEST: GOOD (YES)

        // -------------------------------------------------- Making Anagrams:
        System.out.println(stringManipulation.makeAnagram("cde", "abc"));
        // TEST: GOOD (4)

        // -------------------------------------------------- firstUniqueCharacter in a string:
        System.out.println(stringManipulation.firstUniqueCharacter("aabbbccccdeee"));
        // TEST: GOOD (10)

        // -------------------------------------------------- anagramRemover:
        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("car");
        listOfStrings.add("arc");
        listOfStrings.add("asdfasdf");
        listOfStrings.add("fdsafdsa");

        System.out.println(stringManipulation.anagramRemover(listOfStrings));
        // TEST: GOOD ([car, asdfasdf])

        // -------------------------------------------------- numberNeeded:
        System.out.println(stringManipulation.numberNeeded("abcdef", "defghi"));
        // TEST: GOOD (6)
    }
}
