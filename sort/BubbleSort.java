package sort;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 冒泡排序
 */
public class BubbleSort {

    public static void bubbleSort(int arr[]) {
        int i, j;
        for (i = 0; i < arr.length; i++) {
            for (j = arr.length - 1; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //  优化
    public static void bubbleSort_2(int arr[]) {
        int i, j;
        int temp = 0;
        for (i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (j = arr.length - 1; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    flag = true;
                }
            }
            // System.out.println(!flag);
            if (!flag) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void findKthLargest(int[] nums, int k) {
        // 进行排序
        int i, j, temp;
        for (i = 0; i < nums.length; i++) {
            boolean flag = false;
            for (j = nums.length - 1; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;

                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }

        // 去重
        Set set = new HashSet<Integer>();
        for (int t : nums) {
            set.add(t);
        }

        Object[] array = set.toArray();
        System.out.println(Arrays.toString(array));
        System.out.println(array[array.length - k]);
//        System.out.println(set.size()-2);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};
        int[] arr_2 = new int[]{5, 2, 3, 6, 1, 4};
        // bubbleSort(arr);
        // bubbleSort_2(arr_2);

        try {
            int sum = 20;
            int s = 0;
            System.out.println(sum/s);
        }catch (ArithmeticException arithmeticException){
            System.out.println(arithmeticException);
        }


        findKthLargest(arr, 4);
    }
}
