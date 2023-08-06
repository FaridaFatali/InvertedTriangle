package org.example;

import java.util.Scanner;

/**
 * Exercise: https://www.youtube.com/watch?v=XBMM0zZ5Nis&list=PLEcJSEQK_cD4HTOlqV7xxMH0CYi29adgX&index=28
 * @author Farida Fatali
 */

// Printing an inverted triangle (or inverted tree) using for loop (2 ways)

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many lines? ");
        int line = scanner.nextInt();

        // Method 1:
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= (i - 1); j++) {
                System.out.print(" ");
            }
            int starCount = (line + 1) - i;
            for (int k = 1; k <= 2 * starCount - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // Method 2:
        for (int i = line; i >= 1; i--) {
            for (int j = 1; j <= (line - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // Normal Triangle:
//        for (int i = 1; i <= line; i++){
//            for (int j = 1; j <= (line - i); j++){
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= (2 * i) - 1; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

    }
}