package org.softserve.academy;

import java.util.Scanner;

/**
 * Ask the user for a number and write a program that determines
 * whether the number is prime or not using a for loop.
 * A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself.
 * example 2, 3, 5, 7, 11,….. are prime numbers.
 */
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number:");
        int number= sc.nextInt();
        sc.close();
        if (isPrime(number))
            System.out.println(number + " is Prime.");
        else
            System.out.println(number + " is not Prime.");
    }
    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;
        // Check from 2 to n-1
        for (int i = 2; i < Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }

}
