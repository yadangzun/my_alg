package com.luoxian.alg.sort;

import java.util.Arrays;

/**
 * @Author: luoxian
 * @Date: 2020/6/2 9:57
 * @Description:
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr) {
        quickSortRecurrionCall(arr, 0, arr.length - 1);
    }

    private static void quickSortRecurrionCall(int[] arr, int left, int right) {
        if(left >= right) {
            return;
        }
        int index = partition(arr, left, right);
        quickSortRecurrionCall(arr, left, index - 1);
        quickSortRecurrionCall(arr, index + 1, right);
    }

    private static int partition(int[] arr, int left, int right) {
        int value = arr[right];
        int i  = left;

        for (int j = left; j < right; j++) {
            if (arr[j] < value) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

        int temp = arr[right];
        arr[right] = arr[i];
        arr[i] = temp;
        return  i;
    }
}
