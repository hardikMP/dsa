package xyz.hardikprajapati.leetcode;

/**
 * @author hardikprajapati
 */
public class CountNegativesInMatrix {
    public static void main(String[] args) {
        int[][] grid = {
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}};

//        int[][] grid = {
//                {3, 2},
//                {1, 0},};
        System.out.println(countNegatives(grid));
    }

    public static int countNegatives(int[][] grid) {
        int result = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        for (int i = rows-1; i >= 0 ; i--) {
            for (int j = cols-1; j >= 0 ; j--) {
                if(grid[i][j] < 0)
                    ++result;
                else
                    break;
            }
        }
        return result;
    }
}
