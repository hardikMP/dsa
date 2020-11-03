package xyz.hardikprajapati.leetcode;

import java.util.Arrays;

/**
 * @author hardikprajapati
 */
public class SortedSquares {
    public int[] sortedSquares(int[] A) {
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            result[i] = A[i]*A[i];
        }
        Arrays.sort(result);
        return result;
    }
}
