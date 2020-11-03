package pr14.one;

import java.util.Arrays;

public class pr14 {
    public static void main(String[] args) {
        int[] arr1 = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };
        int[] arr2 = { 1, 0, 46, 71, 33, 67, 10, 12, -23 };
        System.out.println("Было:");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        new QuickSort().quickSort(arr1,0,arr1.length-1);
        new MergeSort().mergeSort(arr2,0,arr2.length-1);

        System.out.println("Стало:");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
