package xyz.hardikprajapati.leetcode;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 26;

//        int[] nums = {3, 2, 4};
//        int target = 6;
        int[] result = twoSum(nums, target);
        for (int index:
             result) {
            System.out.println(index);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            result[0] = i;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[result[0]] + nums[j] == target) {
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
