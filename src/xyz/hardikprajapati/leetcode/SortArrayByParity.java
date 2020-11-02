package xyz.hardikprajapati.leetcode;

import java.util.*;

/**
 * @author hardikprajapati
 */
public class SortArrayByParity {
    public static void main(String[] args) {
        int[] A = {3,1,2,4};
        int[] result = sortArrayByParity(A);
        for (int a:
             result) {
            System.out.println(a);
        }
    }

    public static int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];
        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            if(A[i]%2 == 0)
                evens.add(A[i]);
            else
                odds.add(A[i]);
        }
        Collections.sort(evens);
        Collections.sort(odds);
        int i;
        for (i = 0; i < evens.size(); i++) {
            result[i] = evens.get(i);
        }
        for (int j = i; j < result.length; j++) {
            result[j] = odds.get(j-i);
        }

        return result;
    }
}
