package xyz.hardikprajapati.leetcode;

import java.util.Arrays;
import java.util.Collections;

public class ArrayPartitionI {
    public static void main(String[] args) {
        int[] nums = {1,4,3,2};
        System.out.println(arrayPairSum(nums));
    }
    public static int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i+=2) {
            sum += nums[i];
        }
        return sum;
    }
}
