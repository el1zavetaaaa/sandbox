package yllbnts.sandbox.sandbox.bobocode;

import java.util.Arrays;

/**
 * @author yelyzavetalubenets
 **/
public class SortingAlgorithms {
    public static void main(String[] args) {
        int[] arr = {5, 4, 12, 6, 11};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }
}
