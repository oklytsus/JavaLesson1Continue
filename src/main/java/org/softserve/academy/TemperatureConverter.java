package org.softserve.academy;

/**
 * Write a program that converts temperatures from Fahrenheit to Celsius
 * for 0°F to 100°F in 10-degree increments using a for loop.
 * C = 5/9(F-32)
 */
public class TemperatureConverter {
    public static void main(String[] args) {
        for (double f = 0; f <= 100; f+=10) {
            double c = (f-32)*5/9;
            System.out.printf(f + "F - %.2fC%n", c);
        }
    }
}
