package com.lab1binarysearch;

public class BinarySearch {
    public static int binarySearch(int[] items, int target) {
        int beginingOfRange = 0;
        int endOfRange = items.length; // end of the range
        while (beginingOfRange <= endOfRange) {
            int midPoint = (beginingOfRange + endOfRange) / 2;
            if (target < items[midPoint]) {
                endOfRange = midPoint - 1;
            } else if (target > items[midPoint]) {
                beginingOfRange = midPoint + 1;
            } else {
                return midPoint;
            }
        }
        System.out.println("Found at : "+target);
        // element could not be found in the list
        return -1;

    }
}