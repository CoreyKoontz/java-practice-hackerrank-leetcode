package com.javapractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WarmUpChallenge {

    // ------------------------------------------------------ Sales by Match:
    public int sockMerchant(int n, List ar) {
        int pairs = 0;
        List sockTypes = new ArrayList();
        for (Object sock : ar) {
            if (sockTypes.contains(sock)) {
                sockTypes.remove(sock);
                pairs++;
            } else {
                sockTypes.add(sock);
            }
        }
        return pairs;
    }

    // ------------------------------------------------------ Counting Valleys:
    public int countingValleys(int steps, String path) {
        int lvl = 0;
        int v = 0;
        for (char c : path.toCharArray()) {

            if (c == 'U')
                lvl++;

            if (c == 'D')
                lvl--;

            if (lvl == 0 && c == 'U')
                v++;
        }
        return v;
    }

    // ------------------------------------------------------ Jumping on the Clouds:
    // Can only move i+1 || i+2;
    // Cannot land on a 1, only 0;
    public int jumpingOnClouds(List<Integer> c) {
        int jumps = 0;
        for (int i = 0; i < c.size(); i++) {
            if (c.get(i) == 0) {
                i++;
            }
            jumps++;
        }
        return jumps;
    }

    // ------------------------------------------------------ Repeating Strings:
    // There is a string, s, of lowercase English letters that is repeated (infinitely many times.)<- Ignore this last bit
    // Given an integer, n, find and print the number of letter a's in the first n letters of the infinite string.

    public long repeatedString(String s, long n) {
    //First get the total number of completed strings: (long to be safe)
        long numOfStrings = n / s.length();
    //Then the number of left over characters:
        long remainingChars = n % s.length();
    // Check if there are any 'a's in s at all (If the list was actually infinite this probably wouldn't work):
        if (!s.contains("a")) return 0;
    // return the number of 'a's in the partial string OR the number of 'a's in the completed plus the partial strings:
        return n < s.length() ?
                countA(s, n) :
                numOfStrings * countA(s, s.length()) + countA(s, remainingChars);
    }
    // 'a' counter method for repeatedString method
    public static long countA(String s, long length) {
        int a = 0;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == 'a') a++;
    }
        return a;
    }





}
//        String sRepeat = s.repeat((int)n);
////        if (s.length() < n) {
////            n = s.length();
////        }
//        char[] charArray = (sRepeat.substring(0, (int) n)).toCharArray();
//        long charCount = 0;
//        for (char c : charArray) {
//            if (c == 'a')
//                charCount++;
//        }
//        System.out.println(charCount);
//        return charCount;
