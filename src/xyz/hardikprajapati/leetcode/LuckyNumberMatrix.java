package xyz.hardikprajapati.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckyNumberMatrix {
    public static void main(String[] args) {
//        int[][] matrix = {{3,7,8}, {9,11,13}, {15,16,17}};
//        int[][] matrix = {{1,10,4,2}, {9,3,8,7}, {15,16,17,12}};
        int[][] matrix = {{36376,85652,21002,4510}, {68246,64237,42962,9974}, {32768,97721,47338,5841}, {55103,18179,79062,46542}};
        System.out.println(luckyNumbers(matrix));
    }

    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> luckyNumbers = new ArrayList<>();
        List<Integer> min = new ArrayList<>();
        List<Integer> max = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            min.add(Integer.MAX_VALUE);
        }
        for (int i = 0; i < matrix[0].length; i++) {
            max.add(Integer.MIN_VALUE);
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(min.get(i) > matrix[i][j])
                    min.set(i,matrix[i][j]);
                if(max.get(j) < matrix[i][j] )
                    max.set(j, matrix[i][j]);
            }
        }

        for (int minNumber:
             min) {
            if(max.contains(minNumber))
                luckyNumbers.add(minNumber);
        }
        return luckyNumbers;
    }
}
