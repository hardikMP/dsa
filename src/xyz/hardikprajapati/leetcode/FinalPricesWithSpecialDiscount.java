package xyz.hardikprajapati.leetcode;

import java.util.Arrays;

/**
 * @author hardikprajapati
 */
public class FinalPricesWithSpecialDiscount {
    public static void main(String[] args) {
        int[] prices = {10, 1, 1, 6};
        int[] finalPrices = finalPrices(prices);
        for (int finalPrice:
             finalPrices) {
            System.out.println(finalPrice);
        }
    }

    public static int[] finalPrices(int[] prices) {
        int[] finalPrices = new int[prices.length];
        finalPrices = Arrays.copyOf(prices, prices.length);
        for (int i = 0; i < prices.length-1; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if(prices[j] <= prices[i]) {
                    finalPrices[i] -= prices[j];
                    break;
                }
            }
        }
        return finalPrices;
    }
}
