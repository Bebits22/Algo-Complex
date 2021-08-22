package com.lab1linearsearch;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinearSearch ls = new LinearSearch();

        System.out.println("Array size:\t");
        int n = sc.nextInt();
        System.out.println("Element to be found: ");
        int x = sc.nextInt();

        ArrayList list = GenerateRandomIntegers(n, 0, 50000);

        //printing the array
        StringBuffer sb = new StringBuffer();
        for (Object s : list) {
            sb.append(s);
            sb.append(" ");
        }
        String str = sb.toString();
        System.out.println(str);

        //start computing time
        long startTime = System.nanoTime();

        ls.linearSearch(list, x);

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



    public static class LinearSearch {
        int linearSearch(ArrayList arr, int target) {
            for(int i=0;i<arr.size();i++) {
                if(arr.get(i).equals(target)) {
                    System.out.println("Item found at = "+(i+1));
                }
            }
            return -1;
        }
    }
}
