package com.luoxian.alg.sort;

import java.util.Arrays;

/**
 * @Author: luoxian
 * @Date: 2020/6/1 14:35
 * @Description:
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        if (arr == null) {
            return;
        }
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            int value = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (value < arr[j]) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = value;
        }
    }
}
