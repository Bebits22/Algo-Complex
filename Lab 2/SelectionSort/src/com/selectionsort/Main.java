package com.selectionsort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] arr = {20, 46, 22, 19, 6, 42, 14, 5, 48, 47, 17, 39, 51, 7, 2};
		System.out.println("Unsorted Array: \t" + Arrays.toString(arr));

	    selectionSort(arr);
		System.out.println("Sorted Array: \t" +Arrays.toString(arr));
    }

	public static void selectionSort(int[] arr) {
		int n = arr.length;
		// one by one move boundary of unsorted subarray
		for (int i = 0; i < n - 1; i++) {
			// find the minimum element in unsorted array
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			// swapping the found min value with the first element
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
}


