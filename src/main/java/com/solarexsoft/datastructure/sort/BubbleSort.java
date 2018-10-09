package com.solarexsoft.datastructure.sort;

/**
 * Created by houruhou on 2018/10/9.
 * Desc:
 */
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            boolean flag = false;
            for (int j = 0; j < len-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {8, 9, 1, 0, 2, 4, 3, 7};
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}
