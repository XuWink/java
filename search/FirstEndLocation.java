package search;

import java.util.Arrays;

/**
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 * 示例 1:
 * 输入：nums = [5,7,7,8,8,10], target = 8
 * 输出：[3,4]
 * <p>
 * 示例 2：
 * 输入：nums = [5,7,7,8,8,10], target = 6
 * 输出：[-1,-1]
 * <p>
 * 示例 3：
 * 输入：nums = [], target = 0
 * 输出：[-1,-1]
 * <p>
 * 思路：
 * 1. 先通过二分查找查找target
 * 2. 如果没有找到，说明不存在targer，返回{-1，-1}；
 * 3. 如果找到了，通过左右滑动窗口确定返回值
 */

public class FirstEndLocation {

    public static void main(String[] args) {

        int[] arr = new int[]{5,7,7,8,8,10};
        int[] result = searchRange(arr, 6);
        String res = Arrays.toString(result);
        System.out.println(res);
    }

    public static int[] searchRange(int[] nums, int target) {

        int biSearch = BiSearch(nums, target);

        if (biSearch == -1) {
            return new int[]{-1, -1};
        } else {
            int i;
            int start, end;

            // 找结束位置
            for (i = biSearch; i < nums.length; i++) {
                if (nums[i] != nums[biSearch]) {
                    break;
                }
            }
            end = i - 1;

            // 找开始位置
            for (i = biSearch; i >= 0; i--) {
                if (nums[i] != nums[biSearch]) {
                    break;
                }
            }
            start = i + 1;
            return new int[]{start, end};
        }

    }

    public static int BiSearch(int[] arr, int target) {
        // 二分查找
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = ((right - left) >> 1) + left;

            if (target < arr[mid]) {
                right = mid - 1;
            } else if (target > arr[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
