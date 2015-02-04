package org.bean.java.test.sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String args[]) {
        int array[] = {321,43,56,874,32,1,6,44,745,32,54,54,23};
//        int array[] = {9};
        quickSort3(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int array[], int low, int height) {
        int index = partion(array, low, height);
        if (low < index) {
            quickSort(array, low, index - 1);
        }
        if (height > index) {
            quickSort(array, index + 1, height);
        }
    }

    private static int partion(int array[], int low, int height) {
        int pivot = array[low];
        while (low < height) {
            while (low < height && array[height] >= pivot) {
                height--;
            }
            array[low] = array[height];
            while (low < height && array[low] < pivot) {
                low++;
            }
            array[height] = array[low];
        }
        array[low] = pivot;
        return low;
    }

    private static void quickSort1(int[] array, int low, int height) {
        int index = partion1(array, low, height);
        if (low < index) {
            quickSort1(array, low, index - 1);
        }
        if (height > index) {
            quickSort1(array, index + 1, height);
        }
    }

    private static int partion1(int[] array, int low, int height) {
        int pivot = array[low];
        while (low < height) {
            while (low < height && array[height] >= pivot) {
                height--;
            }
            array[low] = array[height];
            while (low < height && array[low] < pivot) {
                low++;
            }
            array[height] = array[low];
        }
        array[low] = pivot;
        return low;
    }

    private static int partion2(int array[], int low, int height) {
        int pivot = array[low];
        while (low < height) {
            while (low < height && array[height] >= pivot) {
                height--;
            }
            array[low] = array[height];
            while (low < height && array[low] < pivot) {
                low++;
            }
            array[height] = array[low];
        }
        array[low] = pivot;
        return low;
    }

    private static void quickSort2(int array[], int low, int height) {
        int index = partion2(array, low, height);
        if (low < index) {
            quickSort2(array, low, index - 1);
        }
        if (height > index) {
            quickSort2(array, index + 1, height);
        }
    }

    public static int partion3(int array[], int low, int height) {
        int pivot = array[low];
        while (low < height) {
            while (low < height && array[height] >= pivot) {
                height--;
            }
            if (low < height) {
                array[low] = array[height];
            }
            while (low < height && array[low] <= pivot) {
                low++;
            }
            if (low < height) {
                array[height] = array[low];
            }
        }
        array[low] = pivot;
        System.out.println(Arrays.toString(array));
        return low;
    }

    public static void quickSort3(int array[], int low, int height) {
        if (low < height) {
            int index = partion3(array, low, height);
            quickSort3(array, low, index - 1);
            quickSort3(array, index + 1, height);
        }
    }
}
