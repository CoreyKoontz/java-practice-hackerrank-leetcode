package com.javapractice;

import java.util.Scanner;

public class ioPractice {

    public void printer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0; i<3; i++){
            String s1 = sc.next().trim();
            int x = sc.nextInt();
            System.out.printf("%-14s %03d%n",s1, x);
            // Will need to adjust the number of space characters depending on the
            // length of the array element
        }

        System.out.println("================================");
    }
}
