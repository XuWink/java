package sort;

import java.util.Arrays;

/**
 * TODO
 * 快排
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 0, 5, 3, 4};
        Quick(arr, 0, 5);
        System.out.println(Arrays.toString(arr));
    }

    // 交换两数
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //确定基准
    static int partition(int[] arr, int left, int right) {
        int i = left, j = right;
        while (i < j) {
            // 从右向左找到第一个比基准（数组的第一个元素）小的数
            while (i < j && arr[j] >= arr[left]) j--;
            // 从左向右找到第一个比基准大的数
            while (i < j && arr[i] <= arr[left]) i++;
            // 交换两个数
            swap(arr, i, j);
        }
        // 交换基准数并返回基准数的索引
        swap(arr, i, left);
        return i;
    }


    public static void Quick(int[] arr, int left, int right) {
        if (left >= right) return;

        int pivot = partition(arr, left, right);
        // 递归
        Quick(arr, left, pivot - 1);
        Quick(arr, pivot + 1, right);
    }
}
