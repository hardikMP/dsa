package xyz.hardikprajapati.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KidsWithMostCandies {
    public static void main(String[] args) {

    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int[] dummy = candies;
        int max = Integer.MIN_VALUE;
        for(int i : candies)
            max = i > max ? i : max;

        for(int i : candies)
            result.add(candies[i] + extraCandies >= max ? true : false);

        return result;
    }
}
