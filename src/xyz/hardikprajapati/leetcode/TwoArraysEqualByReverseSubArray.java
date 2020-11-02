package xyz.hardikprajapati.leetcode;

import java.util.Arrays;

public class TwoArraysEqualByReverseSubArray {

    public static void main(String[] args) {
        int[] target = {1,2,3,4};
        int[] arr = {2,4,1,3};
        canBeEqual(target, arr);
    }

    public static boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);

        if(target.length != arr.length)
            return false;

        for (int i = 0; i < target.length; i++) {
            if(target[i] != arr[i])
                return false;
        }

        return true;
    }
}
