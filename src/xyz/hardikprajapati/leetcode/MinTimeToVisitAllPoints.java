package xyz.hardikprajapati.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MinTimeToVisitAllPoints {
    public static void main(String... args) {
        int[][] points = {{1,1}, {3,4}, {-1,0}};
//        int[][] points = {{3,2}, {-2,-2}};
        System.out.println(minTimeToVisitAllPoints(points));
    }

    public static int minTimeToVisitAllPoints(int[][] points) {
        int steps = 0;
        for (int i = 1; i < points.length; i++)
            steps += Math.max(Math.abs(points[i-1][0] - points[i][0]), Math.abs(points[i-1][1] - points[i][1]));
        return steps;
    }

//    public static int minTimeToVisitAllPoints(int[][] points) {
//        int steps = 0;
//        int[] base = points[0];
//        for (int i = 1; i < points.length; i++) {
//            while(base[0] != points[i][0] || base[1] != points[i][1]) {
//                if(base[0] != points[i][0] && base[1] != points[i][1]) {
//                    if(base[0] > points[i][0])
//                        --base[0];
//                    else
//                        ++base[0];
//
//                    if(base[1] > points[i][1])
//                        --base[1];
//                    else
//                        ++base[1];
//
//                    ++steps;
//                } else if(base[0] != points[i][0]) {
//                    if(base[0] > points[i][0])
//                        --base[0];
//                    else
//                        ++base[0];
//                    ++steps;
//                } else if(base[1] != points[i][1]) {
//                    if(base[1] > points[i][1])
//                        --base[1];
//                    else
//                        ++base[1];
//
//                    ++steps;
//                }
//            }
//        }
//        return steps;
//    }
}
