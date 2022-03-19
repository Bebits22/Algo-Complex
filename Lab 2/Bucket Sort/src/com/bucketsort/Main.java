package com.bucketsort;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] arr = {20, 2, 46, 22, 19, 6, 22, 14, 5, 48, 47, 17, 39, 5, 51, 7, 2, 22};

        int[] elements = bucketSort(arr);

        System.out.println("Unsorted Array:" +Arrays.toString(arr));

        System.out.print("\nSorted array: " +Arrays.toString(elements));
    }

    public static int[] bucketSort(int[] arr) {
        //finding the maximum value of the array
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >max) {
                max=arr[i];
            }
        }

        //creating a new array with size max+1
        int[] sortedArray = new int[max + 1];
        try{
            for (int i=0; i <= max; i++) {
                int currentVal = arr[i];
                sortedArray[currentVal] = currentVal ;
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return sortedArray;
    }
}
