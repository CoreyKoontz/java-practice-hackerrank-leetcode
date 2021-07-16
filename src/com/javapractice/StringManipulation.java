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

    // ------------------------------------------------------ firstUniqueCharacter in a string:

    public int firstUniqueCharacter(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {           // If map already contains the char
                map.put(c, map.get(c) + 1);     // update the key/value (only the value changes)
            } else {
                map.put(c, 1);                  // if the map does not contain the key/value then add it
            }
        }
        // So now we have our filled in map with the number of each char in the string
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1)     // If the value of the current char(i) is one
                return i + 1;                  // it is unique and the first time
        }                                      // this happens would be the first instance of it
        return -1;                             // so we need to return i.
    }                                          // i + 1 to make it 1-indexed


    // ------------------------------------------------------ anagramRemover:
    // Removes a sting in a list of strings if it is an anagram of a prior string in the list

    public List<String> anagramRemover(List<String> list) {
        // To store and return results:
        List<String> result = new ArrayList<>();

        // Duplicate checker: (Use HashSet instead of ArrayList to prevent duplicate values)
        HashSet<String> found = new HashSet<>();

        for (int i = 0; i < list.size(); i++) {

            String string = list.get(i);
//            System.out.println(string); // TEST (GOOD)

            // Must sort the string elements to check for duplicates
            String sortString = stringSort(string); // See below for sort method
//            System.out.println(sortString); // TEST (GOOD)

            if (!found.contains(sortString)){
                result.add(string); // add the actual string to the result set
                found.add(sortString); // add sorted string to the found set
            }

        }
        return result;
    }

    // Sorts an individual string alphabetically
    public static String stringSort(String str){
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }

    // ------------------------------------------------------ numberNeeded:
    // Minimum number of character deletions required to make the two strings anagrams.

    public int numberNeeded(String first, String second) {
        // Create and empty HashMap to input corresponding char(keys) and int(values):
        Map<Character, Integer> count = new HashMap<>();

        // Iterate through the first string as an array of chars and add each to the HashMap
        for (char key : first.toCharArray()) {
            // if count map already contains the current iteration of key, set value to its current value.
            // Otherwise set to 0:
            int value = count.getOrDefault(key, 0);
            //add the old value to the new instance (+1):
            count.put(key, (value + 1));
        }
        // Now we can iterate over the second string and compare it to the newly updated count map:
        for (char key : second.toCharArray()) {
            int value = count.getOrDefault(key, 0);
            count.put(key, (value - 1));
        }
        // Add up the absolute value of the differences:
        List<Integer> values = new ArrayList<>(count.values());
        int counter = 0;
        for (Integer value : values) {
            counter += Math.abs(value);
        }
        return counter;
    }
}


