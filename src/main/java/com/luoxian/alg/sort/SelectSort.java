package com.luoxian.alg.sort;

import java.util.Arrays;

/**
 * @Author: luoxian
 * @Date: 2020/6/1 15:25
 * @Description:
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectSort(int[] arr) {
        if (arr == null) {
            return;
        }
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            int index = i;
            int min = arr[i];
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < min) {
                    index = j;
                    min = arr[j];
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;

        }

    }

}
