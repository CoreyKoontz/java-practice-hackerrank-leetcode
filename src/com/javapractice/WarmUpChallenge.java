package com.javapractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WarmUpChallenge {

    // ------------------------------------------------------ Sales by Match:
    public static int sockMerchant(int n, List ar) {
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
    public static int countingValleys(int steps, String path) {
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
    public static int jumpingOnClouds(List<Integer> c) {
        int jumps = 0;
        for (int i = 0; i < c.size() - 1; i++) {
            if (c.get(i) == 0) {
                i++;
            }
            jumps++;
        }
        return jumps;
    }

}
