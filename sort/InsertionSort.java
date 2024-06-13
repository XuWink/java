package sort;

import java.util.Arrays;

/**
 * 插入排序
 * 从第二个元素开始，与前面已排序的元素进行逐个比较，并将元素插入到已排序列的适当位置
 * 稳定排序
 */
public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int i, j, temp;
        for (i = 1; i < arr.length; i++) {
            temp = arr[i];
            for (j = i; j > 0; j--) {
                if (arr[j - 1] > temp) {
                    arr[j] = arr[j - 1];
                } else break;
            }

            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 0, 5, 3, 4};
        insertionSort(arr);
    }
}
