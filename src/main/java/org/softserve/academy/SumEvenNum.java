package org.softserve.academy;

/**
 *  Using a for loop, write a program that sums all even numbers between 1 and 100 inclusive
 */
public class SumEvenNum {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 0; i <=100 ; i++) {
            if (i%2==0){ sum+=i;}
        }
        System.out.println("Sum of even numbers between 1 and 100 is " +sum);
    }
}
