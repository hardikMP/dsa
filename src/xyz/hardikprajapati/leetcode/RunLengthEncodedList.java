package xyz.hardikprajapati.leetcode;

import java.util.Arrays;

public class RunLengthEncodedList {
    public static void main(String[] args) {

    }

    public static int[] decompressRLElist(int[] nums) {
        int length = 0;
        for (int i = 0; i < nums.length; i+=2) {
            length += nums[i];
        }
        int[] result = new int[length];
        int count = 0;
        for (int i = 1; i < nums.length; i+=2) {
//            for (int j = 0; j < nums[i-1]; j++) {
//                result[count++] = nums[i];
                Arrays.fill(result, count, count + nums[i-1], nums[i]);
                count += nums[i-1];
//            }
        }
        return result;
    }
}
