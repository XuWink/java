package sort;

/**
 * TODO
 * 快排
 */
public class QuickSort {
    public static void main(String[] args) {

    }

    public static void Quick(int[] arr) {
        // 基准
        int pivot = arr[0];

        int i = 0, j = arr.length - 1;
        while(i!=j){
            if(arr[i]<pivot){
                i++;
            }
        }
    }
}
