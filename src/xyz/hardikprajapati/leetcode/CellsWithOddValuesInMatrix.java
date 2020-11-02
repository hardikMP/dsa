package xyz.hardikprajapati.leetcode;

public class CellsWithOddValuesInMatrix {
    public static void main(String[] args) {
        int n = 2;
        int m = 3;
        int[][] indices = {{0, 1}, {1, 1}};
        System.out.println(oddCells(n, m, indices));;
    }

    public static int oddCells(int n, int m, int[][] indices) {
        int count = 0;
        int[][] matrix = new int[n][m];

        for (int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            int column = indices[i][1];

            for (int j = 0; j < matrix[row].length; j++) {
                ++matrix[row][j];
                if(matrix[row][j]%2 != 0)
                    ++count;
                else
                    --count;
            }

            for (int j = 0; j < matrix.length; j++) {
                ++matrix[j][column];
                if(matrix[j][column]%2 != 0)
                    ++count;
                else
                    --count;
            }
        }

        return count;
    }

    public int oddCellsOpt(int n, int m, int[][] indices) {
        boolean[] rows = new boolean[n];
        boolean[] cols = new boolean[m];
        int oddRowCount = 0, oddColCount = 0;

        for(int[] idx: indices) {
            rows[idx[0]] ^= true;
            cols[idx[1]] ^= true;

            oddRowCount += rows[idx[0]] ? 1 : -1;
            oddColCount += cols[idx[1]] ? 1 : -1;
        }

        return (m - oddColCount) * oddRowCount + (n - oddRowCount) * oddColCount;
    }
}
