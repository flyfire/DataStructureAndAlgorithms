package com.solarexsoft.datastructure.sort;

/**
 * Created by houruhou on 2018/10/9.
 * Desc:
 */
public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            int pivot = arr[i];
            int index = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < pivot) {
                    pivot = arr[j];
                    index = j;
                }
            }
            if (index != i) {
                int tmp = arr[i];
                arr[i] = arr[index];
                arr[index] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 0, 3, 6, 5, 4};
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + "\t");
        }
    }
}
