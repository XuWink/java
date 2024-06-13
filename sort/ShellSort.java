package sort;

import java.util.Arrays;

/**
 * 希尔排序
 * 将整个数组按照一定的间隔取值划分为若干个子数组，每个子数组分别进行插入排序。然后逐渐缩小间隔进行
 * 下一轮划分子数组和对子数组进行插入排序。直至最后一轮排序间隔为 111，对整个数组进行插入排序。
 * 1.确定一个元素间隔数 gap。
 * 2.将参加排序的数组按此间隔数从第 1 个元素开始一次分成若干个子数组，即分别将所有位置相隔为 gap 的元素视为一个子数组。
 * 3.在各个子数组中采用某种排序算法（例如插入排序算法）进行排序。
 * 4.减少间隔数，并重新将整个数组按新的间隔数分成若干个子数组，再分别对各个子数组进行排序。
 * 5.依次类推，直到间隔数 gapgapgap 值为 111，最后进行一次排序，排序结束。
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};
        shellSort(arr);


    }

    public static int[] insertSort(int[] arr) {
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
        return arr;
    }

    private static void shellSort(int[] arr) {

        insertSort(arr);
    }
}
