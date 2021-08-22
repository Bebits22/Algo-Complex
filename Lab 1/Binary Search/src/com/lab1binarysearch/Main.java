package com.lab1binarysearch;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearch bs = new BinarySearch();

        System.out.println("Array size:\t");
        int n = sc.nextInt();
        System.out.println("Element to be found: ");
        int x = sc.nextInt();

        ArrayList list = GenerateRandomIntegers(n, 0, 50000);

        //printing the unsorted array
        System.out.println("Unsorted Array: ");
        StringBuffer sb = new StringBuffer();
        for (Object s : list) {
            sb.append(s);
            sb.append(" ");
        }
        String unsorted = sb.toString();
        System.out.println(unsorted);

        //sorting the ArrayList
        Collections.sort(list);

        //printing the sorted array
        System.out.println("Sorted Array: ");
        StringBuffer sb2 = new StringBuffer();
        for (Object s : list) {
            sb2.append(s);
            sb2.append(" ");
        }
        String sorted = sb2.toString();
        System.out.println(sorted);

        //start computing time
        long startTime = System.nanoTime();

        bs.binarySearch(list, x);

        //end computing time
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in nanoseconds: " +timeElapsed);
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);

    }




    public static ArrayList GenerateRandomIntegers(int size, int min, int max) {
        ArrayList numbers = new ArrayList();
        Random rand = new Random();

        while (numbers.size()<size) {
            //getting random numbers within range
            int randomNumber = rand.nextInt((max-min)+1) + min;
            //check for duplicates
            if(!numbers.contains(randomNumber)) {
                numbers.add(randomNumber);
            }
        }
        return numbers;
    }



    public static class BinarySearch {
        int binarySearch(ArrayList<Integer> arr, int target) {
            int left = 0;
            int right = arr.size() - 1;

            while (left <= right) {
                int mid = (left + right)/2;
                if (arr.get(mid) == target) {
                    System.out.println("Item found at: "+(mid+1));
                    return mid+1;
                }
                else if (arr.get(mid) < target) {
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
            return -1;
        }
    }
}
