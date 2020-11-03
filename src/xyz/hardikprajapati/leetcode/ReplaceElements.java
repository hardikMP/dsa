package xyz.hardikprajapati.leetcode;

/**
 * @author hardikprajapati
 */
public class ReplaceElements {

    public static int[] replaceElements(int[] arr) {
        int[] result = new int[arr.length];
        result[arr.length-1] = -1;
        int maxSoFar = result[arr.length-1];
        for (int i = arr.length-2; i >= 0 ; i--) {
            maxSoFar = arr[i+1] > maxSoFar ? arr[i+1] : maxSoFar;
            result[i] = maxSoFar;
        }
        return result;
    }
}
