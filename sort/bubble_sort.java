package sort;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class bubble_sort {

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

    //    优化
    public static void bubbleSort_2(int arr[]) {
        int i, j;
        for (i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (j = arr.length - 1; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    flag = true;
                }
            }
            if (!flag){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 1, 5, 7, 0};
        bubbleSort(arr);
    }
}
