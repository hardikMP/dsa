package xyz.hardikprajapati.leetcode;

import java.util.Arrays;

public class MaxProductOfTwoElements {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-1]-1) * (nums[nums.length-2]-1);
    }
}
