package org.bean.java.test.sort;

import java.util.Arrays;

public class SelectSort {

    public static void main(String args[]) {
        int array[] = {321,43,56,874,32,1,6,44,745,32,54,54,23};
//        int array[] = {9};
        selectSort(array);
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

}
