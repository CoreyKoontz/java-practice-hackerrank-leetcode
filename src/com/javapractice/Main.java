package com.javapractice;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        StringManipulation stringManipulation = new StringManipulation();
        WarmUpChallenge warmUpChallenge = new WarmUpChallenge();


        // -------------------------------------------------- Sherlock and the Valid String:
        System.out.println("Sherlock and the Valid String:");
        System.out.println(stringManipulation.isValid("a"));
        // TEST: GOOD (YES)

        // -------------------------------------------------- Making Anagrams:
        System.out.println("Making Anagrams:");
        System.out.println(stringManipulation.makeAnagram("cde", "abc"));
        // TEST: GOOD (4)

        // -------------------------------------------------- firstUniqueCharacter in a string:
        System.out.println("firstUniqueCharacter in a string:");
        System.out.println(stringManipulation.firstUniqueCharacter("aabbbccccdeee"));
        // TEST: GOOD (10)

        // -------------------------------------------------- anagramRemover:
        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("car");
        listOfStrings.add("arc");
        listOfStrings.add("asdfasdf");
        listOfStrings.add("fdsafdsa");

        System.out.println("anagramRemover:");
        System.out.println(stringManipulation.anagramRemover(listOfStrings));
        // TEST: GOOD ([car, asdfasdf])

        // -------------------------------------------------- numberNeeded:
        System.out.println("numberNeeded:");
        System.out.println(stringManipulation.numberNeeded("abcdef", "defghi"));
        // TEST: GOOD (6)

        // -------------------------------------------------- Sales by Match Warm-Up:
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(2);
        numbers.add(1);
        numbers.add(3);
        numbers.add(3);
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);
        numbers.add(4);
        numbers.add(4);

        System.out.println("Sales by Match Warm-Up:");
        System.out.println(warmUpChallenge.sockMerchant(10, numbers));
        // TEST: GOOD (4)

        // -------------------------------------------------- Counting Valleys Warm-Up:
        System.out.println("Counting Valleys Warm-Up:");
        System.out.println(warmUpChallenge.countingValleys(10, "U, D, D, U, D, U, U, U, D, D"));
        // TEST: GOOD (2)

        // -------------------------------------------------- Jumping on the Clouds:
        List<Integer> clouds = new ArrayList();
        clouds.add(0);
        clouds.add(1);
        clouds.add(0);
        clouds.add(0);
        clouds.add(1);
        clouds.add(0);
        clouds.add(1);

        System.out.println("Jumping on the Clouds:");
        System.out.println(warmUpChallenge.jumpingOnClouds(clouds));
        // TEST: GOOD (4)

        // -------------------------------------------------- Repeating String:
        String infStr = "aba"; // 7 - a
        System.out.println("Repeating String:");
        System.out.println(warmUpChallenge.repeatedString(infStr, 1000000000));
        // TEST: GOOD (666666667)
    }
}
