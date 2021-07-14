package com.javapractice;

import java.util.*;

public class StringManipulation {

    // ------------------------------------------------------ Sherlock and the Valid String:

    public String isValid(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char key : s.toCharArray()) {
            int freq = map.getOrDefault(key, 0);
            map.put(key, freq + 1);
        }
        Collection<Integer> values = map.values();
        ArrayList<Integer> listOfValues = new ArrayList<>(values);
        Collections.sort(listOfValues);

        int first = listOfValues.get(0);
        int second = listOfValues.size() > 1 ? listOfValues.get(1) : listOfValues.get(0);
        int last = listOfValues.size() > 1 ? listOfValues.get(listOfValues.size() - 1) : listOfValues.get(0);
        int secondLast = listOfValues.size() > 1 ? listOfValues.get(listOfValues.size() - 2) : listOfValues.get(0);

        // If first and last is same all are the same
        if (first == last)
            return "YES";

        // If first is 1 but all others are same
        if (first == 1 && second == last) return "YES";

        // If all are the same except the last is 1
        if (first == second && second == secondLast && secondLast == (last - 1)) return "YES";

        return "NO";
    }

    // ------------------------------------------------------ Making Anagrams:
    public int makeAnagram(String a, String b) {
        Map<Character, Integer> count = new HashMap<>();

        for (char key : a.toCharArray()) {
            int value = count.containsKey(key) ? count.get(key) : 0;
            count.put(key, (value + 1));
        }
        for (char key : b.toCharArray()) {
            int value = count.containsKey(key) ? count.get(key) : 0;
            count.put(key, (value - 1));
        }
        List<Integer> values = new ArrayList<>(count.values());
        int counter = 0;
        for (Integer value : values) {
            counter += Math.abs(value);
        }
        return counter;
    }

}
