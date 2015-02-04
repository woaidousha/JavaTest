package org.bean.java.test.sort;

import java.util.Arrays;

public class InsertSort {

    public static void main(String args[]) {
        int array[] = {321,43,56,874,32,1,6,44,745,32,54,54,23};
//        int array[] = {9};
        insertSort2(array);
        System.out.println(Arrays.toString(array));
    }

    private static void insertSort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 && array[j] < array[j - 1]; j--) {
                int temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
            }
        }
    }

    private static void insertSort1(int array[]) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 && array[j] > array[j - 1]; j--) {
                int temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
            }
        }
    }

    private static void insertSort2(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0 && array[j - 1] > array[j]; j--) {
                int temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
            }
            System.out.println(Arrays.toString(array));
        }
    }

    public static void insertSort3(int array[])  {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 && array[j - 1] > array[j]; j--) {
                int temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
            }
        }
    }
}
