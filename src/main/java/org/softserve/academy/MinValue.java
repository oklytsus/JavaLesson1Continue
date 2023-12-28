package org.softserve.academy;

public class MinValue {
    public static void main(String[] args) {
        int a = 8, b = 10;
        int[] nums = {4, 7, 5, 9, 0, 12, -6, 9, -4, 45};
        int c = Math.min(a, b);
        int min = nums[0];
        for (int num : nums) {
            min = Math.min(min, num);
        }
        System.out.println("min of numbers: " +min);
        System.out.println("min of a b: " +c);
    }
}
