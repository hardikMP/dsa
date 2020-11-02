package xyz.hardikprajapati.leetcode;

public class FindNUniqueIntsSumUptoZero {
    public static void main(String[] args) {
        int[] result = sumZero(5);
        for (int n:
             result) {
            System.out.println(n);
        }
    }

    public static int[] sumZero(int n) {
        int[] result = new int[n];
        if(n%2 != 0) {
            result[0] = 0;
            for (int i = 1; i < n-1; i+=2) {
                result[i] = i;
                result[i+1] = i*-1;
            }
        } else {
            for (int i = 0; i < n-1; i+=2) {
                result[i] = (i+1);
                result[i+1] = (i+1)*-1;
            }
        }
        return result;
    }
}
