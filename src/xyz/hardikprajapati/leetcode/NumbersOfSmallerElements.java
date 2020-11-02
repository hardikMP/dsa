package xyz.hardikprajapati.leetcode;

import java.util.Arrays;

public class NumbersOfSmallerElements {
    public static void main(String[] args) {

    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] > nums[j])
                    ++result[i];
            }
        }
        return result;
    }
}
