package xyz.hardikprajapati.leetcode;

import java.util.Arrays;

/**
 * @author hardikprajapati
 */
public class HeightChecker {
    public int heightChecker(int[] heights) {
        int result = 0;
        int[] sorted = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sorted);
        for (int i = 0; i < heights.length; i++) {
            result += heights[i] != sorted[i] ? 1 : 0;
        }
        return result;
    }
}
