package org.bean.java.test.sort;

import org.bean.java.test.ArrayTool;

import java.util.Arrays;

public class InsertSort {

    public static void main(String args[]) {
        int array[] = ArrayTool.buildArray();
        insertSort5(array);
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

    public static void insertSort4(int array[]) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 && array[j - 1] > array[j]; j--) {
                ArrayTool.swap(array, j - 1, j);
            }
        }
    }

    public static void insertSort5(int array[]) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 && array[j - 1] > array[j]; j--) {
                ArrayTool.swap(array, j - 1, j);
            }
        }
    }

    public static void insertSort6(int array[]) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 & array[j] < array[j - 1]; j--) {
                ArrayTool.swap(array, j , j - 1);
            }
        }
    }

    public static void insertSort7(int array[]) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 && array[j] < array[j - 1]; j--) {
                ArrayTool.swap(array, j, j - 1);
            }
        }
    }
}
