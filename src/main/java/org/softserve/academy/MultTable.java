package org.softserve.academy;

import java.util.Scanner;

/**
 * Write a program that asks the user for a number and then prints the multiplication
 * table for that number up to 10 using a for loop
 */
public class MultTable {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your number:");
        int number= sc.nextInt();
        int result;
        for (int i = 1; i <=10 ; i++) {
            result = number *i;
            System.out.println(number+ " * " +i+ " = " + result);
        }
    }
}
