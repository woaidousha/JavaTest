package org.bean.java.test.sort;

import org.bean.java.test.ArrayTool;

import java.util.Arrays;

public class SelectSort {

    public static void main(String args[]) {
        int array[] = ArrayTool.buildArray();
        selectionSort3(array);
        System.out.println(Arrays.toString(array));
    }

    private static void selectSort(int array[]) {
        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            int position = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    position = j;
                }
            }
            int temp = array[i];
            array[i] = array[position];
            array[position] = temp;
        }
    }

    private static void selectSort1(int array[]) {
        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            int position = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    position = j;
                }
            }
            array[position] = array[i];
            array[i] = max;
            System.out.println(Arrays.toString(array));
        }
    }

    private static void selectSort2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            int position = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    position = j;
                }
            }
            ArrayTool.swap(array, position, i);
        }
    }

    public static void selectionSort3(int array[]) {
        for (int i = 0; i < array.length; i++) {
            int max = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[max]) {
                    max = j;
                }
            }
            ArrayTool.swap(array, max, i);
        }
    }
}
