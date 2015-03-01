package org.bean.java.test.sort;

import org.bean.java.test.ArrayTool;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String args[]) {
        int array[] = ArrayTool.buildArray();
        ArrayTool.print(array);
        bubbleSort8(array);
        System.out.println(Arrays.toString(array));
    }
    public static void bubbleSort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    ArrayTool.swap(array, j + 1 , j);
                }
            }
            ArrayTool.print(array);
        }
    }

    public static void bubbleSort1(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    ArrayTool.swap(array, j, j + 1);
                }
            }
        }
    }

    public static void bubbleSort8(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    ArrayTool.swap(array, j, j + 1);
                }
            }
        }
    }
}
