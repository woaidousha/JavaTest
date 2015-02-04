package org.bean.java.test.sort;

import java.util.Arrays;

public class ShellSort {

    public static void main(String args[]) {
        int array[] = {321, 43, 56, 874, 32, 1, 6, 44, 745, 32, 54, 54, 23};
//        int array[] = {9};
        shellSort6(array);
        System.out.println(Arrays.toString(array));
    }

    private static void shellSort(int array[]) {
        int h = 1;
        while (h < array.length / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            int temp = 0;
            for (int i = h; i < array.length; i++) {
                temp = array[i];
                int j = i;
                while (j > h - 1 && array[j - h] > temp) {
                    array[j] = array[j - h];
                    j -= h;
                }
                array[j] = temp;
            }
            h = (h - 1) / 3;
        }
    }

    private static void shellSort1(int arr[]) {
        int h = 1;
        //计算最大间隔
        while (h < arr.length / 3) {
            h = h * 3 + 1;
        }
        System.out.println("h : " + h);
        while (h > 0) {
            //进行插入排序
            int temp = 0;
            for (int i = h; i < arr.length; i++) {
                temp = arr[i];
                int j = i;
                while (j > h - 1 && arr[j - h] >= temp) {
                    arr[j] = arr[j - h];
                    j -= h;
                }
                arr[j] = temp;
            }
            h = (h - 1) / 3;
        }
    }

    private static void shellSort2(int array[]) {
        int step = 1;
        while (step < array.length / 3) {
            step = step * 3 + 1;
        }
        while (step > 0) {
            int temp = 0;
            for (int i = step; i < array.length; i++) {
                temp = array[i];
                int j = i;
                while (j > step - 1 && array[j - step] >= temp) {
                    array[j] = array[j - step];
                    j -= step;
                }
                array[j] = temp;
            }
            step = (step - 1) / 3;
        }
    }

    private static void shellSort3(int array[]) {
        int step = 1;
        while (step < array.length / 3) {
            step = step * 3 + 1;
        }
        while (step > 0) {
            int temp;
            for (int i = step; i < array.length; i++) {
                temp = array[i];
                int j = i;
                while (j > step - 1 && array[j - step] > temp) {
                    array[j] = array[j - step];
                    j -= step;
                }
                array[j] = temp;
            }
            step = (step - 1) / 3;
        }
    }

    private static void shellSort4(int array[]) {
        int step = 1;
        while (step < array.length / 3) {
            step = step * 3 + 1;
        }
        while (step > 0) {
            int temp = 0;
            for (int i = step; i < array.length; i++) {
                temp = array[i];
                int j = i;
                while (j > step - 1 && array[j - step] < temp) {
                    array[j] = array[j - step];
                    j -= step;
                }
                array[j] = temp;
            }
            step = (step - 1) / 3;
        }
    }

    private static void shellSort5(int array[]) {
        int step = 1;
        while (step > array.length / 3) {
            step = step * 3 + 1;
        }
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
            step = (step - 1) / 3;
        }
    }

    public static void shellSort6(int array[]) {
        int step = array.length / 2;
        while (step > 0) {
            System.out.println("1 step:" + step + "," + Arrays.toString(array));
            for (int i = step; i < array.length; i++) {
                for (int j = i; j > step - 1 && array[j - step] > array[j]; j -= step) {
                    int temp = array[j];
                    array[j] = array[j - step];
                    array[j - step] = temp;
                }
            }
            System.out.println("2 step:" + step + "," + Arrays.toString(array));
            step = step / 2;
        }
    }
}
