package LeetCode;

import java.util.Arrays;
import java.util.Map;

public class sum_of_two_numbers {

    /*
     * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，
     * 并返回它们的数组下标。你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
     *
     * */

    //    方法一
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }


    public static void main(String[] args) {
        System.out.println("两数之和");
        //  int[] nums = new int[5];
        int[] nums = {1, 2, 3, 4, 5};
        int target = 6;
        int[] result = twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }


}
