package com.javapractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ioPractice {

    // ------------------------------------------------------
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
        sc.close();
        System.out.println("================================");
    }

    // ------------------------------------------------------
    public void ioTable() throws IOException {
        {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(bufferedReader.readLine().trim());
            for (int i=1;i<=10;i++) {
                int x = i*N;
                System.out.printf("%d x %d = %d%n", N, i, x);
            }
            bufferedReader.close();
        }
    }

    // ------------------------------------------------------ java loops II:

    // Throwing error on hackerrank
    // (Exception in thread "main" java.util.NoSuchElementException)

    public void javaLoopsII(){
        Scanner in = new Scanner(System.in);

        int t=in.nextInt();
        for(int i=0;i<10;i++){

            int a = Integer.parseInt(in.next());
            int b = in.nextInt();
            int n = in.nextInt();

            for (int x=0; x<n; x++){
                // a = a + (2^x) b
                // must cast to int to use Math.pow
                a += (int) (Math.pow(2, x) * b);
                System.out.printf("%d ", a);
            }
            System.out.println();
        }
        in.close();
    }
}
