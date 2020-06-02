package com.luoxian.alg.sort;

import java.util.Arrays;

/**
 * @Author: luoxian
 * @Date: 2020/6/1 17:04
 * @Description:
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {
        mergeSortRecursionCall(arr, 0, arr.length - 1);
    }

    private static void mergeSortRecursionCall(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + ((right - left) >> 1);
        mergeSortRecursionCall(arr, left, mid);
        mergeSortRecursionCall(arr, mid + 1, right);
        merge(arr, left, mid, right);

    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int i = left, j = mid + 1, index = 0;
        int[] temp = new int[right - left + 1];
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[index++] = arr[i++];
            } else {
                temp[index++] = arr[j++];
            }
        }
        int start = i, end = mid;
        if (j <= right) {
            start= j ;
            end = right;
        }
        while (start <= end) {
            temp[index++] = arr[start++];
        }
        for (i = 0; i < right - left + 1; i++ ){
            arr[left + i] = temp[i];
        }

    }
}
