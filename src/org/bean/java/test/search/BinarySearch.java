package org.bean.java.test.search;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String args[]) {
        int array[] = {321,43,56,874,32,1,6,44,745,32,54,54};
//        int array[] = {9};
        shellSort(array);
        System.out.println(Arrays.toString(array));
        int position = binarySearch(array, 6);
        System.out.println("result : " + position);
    }

    public static void shellSort(int[] array) {
        int step = array.length / 2;
//        while (step < array.length / 3) {
//            step = step * 3 + 1;
//        }
        while (step > 0) {
            int temp = 0;
            for (int i = step; i < array.length; i++) {
                temp = array[i];
                int j = i;
                while (j > step - 1 && array[j - step] > temp) {
                    array[j] = array[j - step];
                    j -= step;
                }
                array[j] = temp;
            }
//            step = (step - 1) / 3;
            step = step / 2;
        }
    }

    public static int binarySearch(int array[], int value) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            int middleValue = array[middle];
            if (middleValue == value) {
                return middle;
            } else if (middleValue > value) {
                end = middle - 1;
            } else if (middleValue < value) {
                start = middle + 1;
            }
        }
        return -1;
    }

    public static int binarySearch1(int array[], int value) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            int middleVaule = array[middle];
            if (middleVaule == value) {
                return middle;
            } else if (middleVaule > middle) {
                end = middle - 1;
            } else if (middleVaule < middle) {
                start = middle + 1;
            }
        }
        return -1;
    }
}
