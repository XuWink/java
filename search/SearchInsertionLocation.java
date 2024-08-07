package search;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * <p>
 * 请必须使用时间复杂度为 O(log n) 的算法。
 *
 * 相当于找第一个大于等于target的值
 */
public class SearchInsertionLocation {


    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 6, 9};
        int res = searchInsert(arr, 4);
        System.out.println(res);
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1, ans = 0;
        while (left <= right) {
//            int mid = (left + right) / 2;
            int mid = ((right - left) >> 1) + left;
            if (target <= nums[mid]) {
                ans = mid;
                right = mid - 1;

            } else {
                left = mid + 1;
            }

        }
        return ans;

    }
}
