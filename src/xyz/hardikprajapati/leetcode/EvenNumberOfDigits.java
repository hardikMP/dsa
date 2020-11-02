package xyz.hardikprajapati.leetcode;

public class EvenNumberOfDigits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num:
             nums) {
            if(Integer.toString(num).length()%2 == 0)
                ++count;
        }
        return count;
    }

    public int findNumbersOpt(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if( ((int) Math.log10(nums[i]))%2==1){
                count++;
            }
        }
        return count;
    }
}
