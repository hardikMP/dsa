package xyz.hardikprajapati.leetcode;

/**
 * Created by hardikprajapati on 28/11/20
 */
public class StringArraysAreEqualOrNot {
    public static void main(String[] args) {
        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String temp1 = "", temp2 = "";
        for (int i = 0; i < word1.length; i++) {
            temp1 = temp1.concat(word1[i]);
        }
        for (int i = 0; i < word2.length; i++) {
            temp2 = temp2.concat(word2[i]);
        }
        return temp1.equals(temp2);
    }
}
