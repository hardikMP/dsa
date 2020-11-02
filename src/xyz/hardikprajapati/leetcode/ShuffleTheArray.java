package xyz.hardikprajapati.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int[] shuffle = shuffle(nums, 3);
        for (int n:
             shuffle) {
            System.out.println(n);
        }
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] shuffle = new int[nums.length];

        for (int i = 0; i < nums.length / 2; i++){
            shuffle[2 * i] = nums[i];
            shuffle[(2 * i )+ 1] = nums[i + n];
        }

//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if(i % 2 == 0) {
//                shuffle[i] = nums[count++];
//            } else {
//                shuffle[i] = nums[count+n-1];
//            }
//        }

        return shuffle;
    }
}
