package com.luoxian.alg.sort;

import java.util.Arrays;

/**
 * @Author: luoxian
 * @Date: 2020/6/1 13:55
 * @Description:
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        if (arr == null) {
            return;
        }
        int length = arr.length;
        for (int i = 0 ; i < length - 1; i++) {
            boolean notFinished = false;
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    notFinished = true;

                }
            }
            if (!notFinished) {
                break;
            }
        }

    }

}
