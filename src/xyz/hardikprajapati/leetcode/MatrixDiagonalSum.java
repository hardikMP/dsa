package xyz.hardikprajapati.leetcode;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        System.out.println(diagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        boolean midFound = false;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(i == j || (i+j) == mat.length-1 && (!midFound || mat.length%2 == 0 || (i!=mat.length/2 || j!=mat[i].length/2))) {
                    sum+=mat[i][j];
                }
            }
        }
        return sum;
    }

    public int diagonalSumOpt(int[][] mat) {
        int result = 0;

        int i=0;
        int j=0;
        while(i<mat.length){
            result+=mat[i][j];
            i++;
            j++;
        }

        i=0;
        j=mat.length-1;
        while(i<mat.length){
            result+=mat[i][j];
            i++;
            j--;
        }

        if(mat.length%2==0){
            return result;
        }

        return result - mat[mat.length/2][mat.length/2];
    }
}
