package xyz.hardikprajapati.leetcode;

/**
 * Created by hardikprajapati on 30/11/20
 */
public class ImageSmoother {
    public static void main(String[] args) {
//        int[][] M = {{1,1,1},
//                {1,0,1},
//                {1,1,1}};
        int[][] M = {{2,3}};
//        int[][] M = {{2,3,4},{5,6,7},{8,9,10},{11,12,13},{14,15,16}};

        int[][] smoother = imageSmoother(M);
        for (int i = 0; i < smoother.length; i++) {
            for (int j = 0; j < smoother[0].length; j++) {
                System.out.print(smoother[i][j] + ",");
            }
            System.out.print("\n");
        }
    }

//    public static int[][] imageSmoother(int[][] M) {
//        int[][] result = new int[M.length][M[0].length];
//        for (int i = 0; i < M.length; i++) {
//            for (int j = 0; j < M[0].length; j++) {
//                int count = 0;
//                int sum = 0;
//                int[] target = {i, j};
//                for (int k = 0; k < M.length; k++) {
//                    for (int l = 0; l < M[0].length; l++) {
//                        int gap = Math.max(Math.abs(i - k), Math.abs(j - l));
//                        if(gap <= 1) {
//                            ++count;
//                            sum += M[k][l];
//                        }
//                    }
//                }
//                result[i][j] = sum/count;
//            }
//        }
//        return result;
//    }

    public static int[][] imageSmoother(int[][] M) {
        if(M.length <= 1 && M[0].length <= 1)
            return M;
        int[][] result = new int[M.length][M[0].length];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                result[i][j] = getAverage(M, i, j);
            }
        }
        return result;
    }

    public static int getAverage(int[][] M, int i, int j) {
        int sum = 0;
        int average = 0;
        if(M.length == 1 && M[0].length == 2) {
            sum += M[0][0] + M[0][1];
            average = sum/2;
        } else if(i == 0 && j == 0) {
            sum += M[i][j] + M[i][j+1] + M[i+1][j] + M[i+1][j+1];
            average = sum/4;
        } else if (i == M.length-1 && j == M[0].length-1) {
            sum += M[i][j] + M[i][j-1] + M[i-1][j] + M[i-1][j-1];
            average = sum/4;
        } else if (i == 0 && j == M[0].length-1) {
            sum += M[i][j] + M[i][j-1] + M[i+1][j] + M[i+1][j-1];
            average = sum/4;
        } else if (i == M.length-1 && j == 0) {
            sum += M[i][j] + M[i][j+1] + M[i-1][j+1] + M[i-1][j];
            average = sum/4;
        } else if(i == 0) {
            sum += M[i][j] + M[i][j+1] + M[i+1][j] + M[i+1][j+1] + M[i+1][j-1] + M[i][j-1];
            average = sum/6;
        } else if(j == 0) {
            sum += M[i][j] + M[i][j+1] + M[i+1][j] + M[i+1][j+1] + M[i-1][j+1] + M[i-1][j];
            average = sum/6;
        } else if(i == M.length-1) {
            sum += M[i][j] + M[i][j+1] + M[i-1][j+1] + M[i-1][j] + M[i-1][j-1] + M[i][j-1];
            average = sum/6;
        } else if(j == M[0].length-1) {
            sum += M[i][j] + M[i][j-1] + M[i+1][j] + M[i+1][j-1] + M[i-1][j] + M[i-1][j-1];
            average = sum/6;
        } else {
            sum += M[i][j] + M[i][j+1] + M[i+1][j] + M[i+1][j+1] + M[i-1][j-1] + M[i-1][j] + M[i-1][j+1] + M[i][j-1] + M[i+1][j-1];
            average = sum/9;
        }
        return average;
    }
}
