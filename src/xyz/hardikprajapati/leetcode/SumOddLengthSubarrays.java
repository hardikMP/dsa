package xyz.hardikprajapati.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumOddLengthSubarrays {
    public static void main(String... args) {
//        int[] arr = {1,4,2,5,3};
//        int[] arr = {10, 11, 12};
        int[] arr = {1,2};
        System.out.println(sumOddLengthSubarrays(arr));
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int limit = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            limit = i%2 == 0?i:0;
//            System.out.println(limit);
            if(limit != 0) {
                for(int k = i; k < arr.length ;k++) {
                    for (int j = k; j >= k-limit; --j) {
//                        System.out.print(arr[j]);
                        sum += arr[j];
                    }
//                    System.out.println("");
                }
            }
        }
        return sum;
    }

    public static int sumOddLengthSubarraysOptimal(int[] arr) {
        if(arr == null || arr.length == 0) {
            return 0;
        }
        int result = 0;

        for(int i = 0; i < arr.length; i++) {
            int startingHere = i+1;
            int endingHere = arr.length - i;
            int totalArraysContainingIthElement = startingHere * endingHere;
            // ceil
            int oddSubarraysContainingIthElement = (totalArraysContainingIthElement + 1) / 2;
            result += oddSubarraysContainingIthElement * arr[i]; // we want only odd-length subarrays
        }

        return result;
    }

    public static Object[] allOdds(int[] arr) {
        List<Integer> odds = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(i%2 == 0)
                odds.add(i);
        }
        return odds.toArray();
    }
}
