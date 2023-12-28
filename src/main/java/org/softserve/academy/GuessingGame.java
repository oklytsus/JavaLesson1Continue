package org.softserve.academy;

import java.util.Scanner;

/**
 * Create a simple number guessing game. Generate a random number and have the user try to guess it.
 * Give them hints ('too high' or 'too low') until they get it right.
 */
public class GuessingGame {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println("Hi! Want to play? Try to guess the number between 0 to 100:");
        int userNumber= sc.nextInt();
        while (userNumber!=randomNum && userNumber!=-1){
            if (userNumber>randomNum){
                System.out.println("Your number is too high, try again:");
                System.out.println("Enter your number or input -1 to quit");
                userNumber= sc.nextInt();
            } else {
                System.out.println("Your number is too low, try again:");
                System.out.println("Enter your number or input -1 to quit");
                userNumber= sc.nextInt();
            }
        }
        if (userNumber==randomNum) {
            System.out.println("Congratulations! You guess!!!");
        } else if (userNumber==-1) {
            System.out.println("You quit the game. The number was: " + randomNum);
            System.out.println("See you next time! :)");
        }

    }
}
