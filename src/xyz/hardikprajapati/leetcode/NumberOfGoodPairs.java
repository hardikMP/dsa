package xyz.hardikprajapati.leetcode;

import java.util.Arrays;

public class NumberOfGoodPairs {
    public static void main(String[] args) {

    }

    public static int numIdenticalPairs(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j])
                    ++sum;
                else
                    break;
            }
        }
        return sum;
    }
}
