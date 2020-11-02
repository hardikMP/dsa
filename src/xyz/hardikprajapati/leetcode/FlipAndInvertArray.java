package xyz.hardikprajapati.leetcode;

import java.util.Arrays;
import java.util.Collections;

public class FlipAndInvertArray {
    public static void main(String[] args) {
        int[][] A = {{1,1,0}, {1,0,1}, {0,0,0}};
        int[][] result = flipAndInvertImage(A);
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] flipAndInvertImage(int[][] A) {
        int[][] result = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                result[i][j] = A[i][A[0].length-j-1]^1;
            }
        }
        return result;
    }
}
