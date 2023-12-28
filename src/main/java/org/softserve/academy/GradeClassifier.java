package org.softserve.academy;

import java.util.Scanner;

/**
 * Write a program that takes a series of grades (until the user enters a sentinel value, e.g., -1)
 * and classifies them as 'Fail' or 'Pass' using if-else statements within a while loop.
 */
public class GradeClassifier {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your grade: ");
        int grade;
        while (true){
                System.out.println("Enter your grade from 0 to 100: ");
                grade=sc.nextInt();
                if (grade<0){break;}
                if (grade >60){
                System.out.println("You Pass exam");
            }else {
                System.out.println("You Fail exam");
            }
        }
    }
}
