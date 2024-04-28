package sort;

import java.util.Arrays;

/**
 * 选择排序（Selection Sort）基本思想：
 * 将数组分为两个区间：左侧为已排序区间，右侧为未排序区间。每趟从未排序区间中选择一个值最小的元素，放到已排序区间的末尾，从而将该元素划分到已排序区间。
 * 时间复杂度O(n^2)，空间复杂度O(1)，原地操作，不稳定排序
 */
public class selection_sort {
    public static void selectionSort(int[] arr) {
        int i, j, temp;
        for (i = 0; i < arr.length - 1; i++) {
            int min_i = i;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_i]) {
                    min_i = j;
                }
            }
            if (min_i != i) {
                temp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 0, 5, 3, 4};
        selectionSort(arr);
    }
}
