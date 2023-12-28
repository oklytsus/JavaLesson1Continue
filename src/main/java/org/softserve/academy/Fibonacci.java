package org.softserve.academy;

import java.util.Scanner;

/**
 * Write a program that prints the first n Fibonacci numbers,
 * where n is provided by the user. Use a while loop to generate the numbers.
 * Fibonacci sequence is a sequence in which each number is the sum of the two preceding ones.
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Fibonacci numbers:");
        int number = sc.nextInt();
        sc.close();
        int num1 = 0, num2 = 1;
        int counter = 0;
        System.out.println("Fibonacci sequence:");
        while (counter < number) {
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter++;
        }
    }
}


