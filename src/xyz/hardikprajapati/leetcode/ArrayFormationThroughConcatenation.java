package xyz.hardikprajapati.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by hardikprajapati on 16/11/20
 */
public class ArrayFormationThroughConcatenation {
    public static void main(String[] args) {
        int[] arr = {91,4,64,78};
        int[][] pieces = {{78}, {4, 64}, {91}};
        System.out.println(canFormArray(arr, pieces));
    }

    public static boolean canFormArray(int[] arr, int[][] pieces) {
        int elemenets = 0;
        Arrays.sort(arr);
        for (int i = 0; i < pieces.length; i++) {
            for (int j = 0; j < pieces[i].length; j++) {

            }
        }
        System.out.println();
        return false;
    }
}
