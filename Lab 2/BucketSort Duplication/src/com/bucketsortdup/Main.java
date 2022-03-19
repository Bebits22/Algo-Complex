package com.bucketsortdup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        int[] arr = {20, 2, 46, 22, 19, 6, 22, 14, 5, 48, 47, 17, 39, 5, 51, 7, 2, 22};

        /*ArrayList elements = bucketSort(arr);

        System.out.println("Unsorted Array:" + Arrays.toString(arr));

        System.out.print("\nSorted array: \t");
        StringBuffer sb = new StringBuffer();
        for (Object s : elements) {
            sb.append(s);
            sb.append(" ");
        }
        String str = sb.toString();
        System.out.println(str);
         */
    }

    public static int bucketSort(int[] arr) {
        TreeSet<Integer> list = new TreeSet<Integer>();

        for(int i=0; i<arr.length)
    }


    /*public static ArrayList<Integer> bucketSort(int[] arr) {
        //maximum value in the array
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >max) {
                max=arr[i];
            }
        }

        //creating a new array with size max+1
        int[] sortedArray = new int[max + 1];

        for (int currentVal : arr) {
            sortedArray[currentVal] = currentVal;
        }

        //creating a new array list
        ArrayList<Integer> sortedList = new ArrayList<>();

        //checking for duplicates
        for(int i=0; i< sortedArray.length-1; i++) {
            if (sortedArray[i] != sortedArray[i+1]) {
                sortedList.add(sortedArray[i]);
            }
        }
        return sortedList;
    }

     */

}
