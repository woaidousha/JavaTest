package org.bean.java.test.sort;

import org.bean.java.test.ArrayTool;

import java.util.Arrays;

public class HeapSort {

    public static void main(String args[]) {
        int[] array = ArrayTool.buildArray();
        System.out.println(Arrays.toString(array));
        Sort1.heapSort(array);
        System.out.println(Arrays.toString(array));
    }

    static class Sort {
        public static void heapSort(int array[]) {
            buildMaxHeap(array);

            for (int i = array.length - 1; i > 0; i--) {
                swap(array, 0, i);
                heapAdjust(array, i, 0);
            }
        }

        public static void swap(int[] array, int i, int j ) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        public static void buildMaxHeap(int array[]) {
            int half = array.length / 2;
            for (int i = half; i >= 0; i--) {
                heapAdjust(array, array.length, i);
            }
        }

        public static void heapAdjust(int array[], int heapSize, int index) {
            int left = index * 2;
            int right = index * 2 + 1;
            int largest = index;

            if (left < heapSize && array[left] > array[largest]) {
                largest = left;
            }
            if (right < heapSize && array[right] > array[largest]) {
                largest = right;
            }
            if (index != largest) {
                int temp = array[index];
                array[index] = array[largest];
                array[largest] = temp;
                heapAdjust(array, heapSize, largest);
            }
        }
    }

    static class Sort1 {

        static int count = 0;

        public static void swap(int array[], int i, int j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        public static void heapSort(int array[]) {
            buildMaxHeap(array);

            for (int i = array.length - 1; i > 0; i--) {
                swap(array, i, 0);
                heapAdjust(array, i, 0);
            }
        }

        public static void buildMaxHeap(int array[]) {
            for (int i = array.length / 2; i >= 0; i--) {
                heapAdjust(array, array.length, i);
            }
        }

        public static void heapAdjust(int array[], int heapSize, int index) {
            int left = index * 2;
            int right = index * 2 + 1;
            int largest = index;

            if (left < heapSize && array[left] > array[largest]) {
                largest = left;
            }
            if (right < heapSize && array[right] > array[largest]) {
                largest = right;
            }

            if (index != largest) {
                swap(array, index, largest);
                heapAdjust(array, heapSize, largest);
            }
            count++;
            System.out.println("count:" + count + "," + Arrays.toString(array));
        }
    }

    static class Sort2 {

        public static void swap(int array[], int i, int j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        public static void heapSort(int array[]) {
            buildMaxHeap(array);

            for (int i = array.length - 1; i > 0; i--) {
                swap(array, i, 0);
                heapAdjust(array, i, 0);
            }
        }

        public static void buildMaxHeap(int array[]) {
            for (int i = array.length / 2; i > 0; i--) {
                heapAdjust(array, array.length, i);
            }
        }

        public static void heapAdjust(int array[], int heapSize, int index) {
            int left = index * 2;
            int right = index * 2 + 1;
            int largest = index;

            if (left < heapSize && array[left] > array[largest]) {
                largest = left;
            }
            if (right < heapSize && array[right] > array[largest]) {
                largest = right;
            }

            if (index != largest) {
                swap(array, index, largest);
                heapAdjust(array, heapSize, largest);
            }

        }
    }

    static class Sort3 {

        public static void heapSort(int[] array) {
            buildMaxHeap(array);

            for (int i = array.length - 1; i >= 1; i--) {
                ArrayTool.swap(array, i, 0);
                heapAdjust(array, i, 0);
            }
        }

        public static void buildMaxHeap(int[] array) {
            for (int i = array.length / 2; i >= 0; i--) {
                heapAdjust(array, array.length, i);
            }
        }

        public static void heapAdjust(int[] array, int heapSize, int index) {
            int left = index * 2;
            int right = index * 2 + 1;
            int largest = index;

            if (left < heapSize && array[left] > array[largest]) {
                largest = left;
            }

            if (right < heapSize && array[right] > array[largest]) {
                largest = right;
            }

            if (index != largest) {
                ArrayTool.swap(array, index, largest);
                heapAdjust(array, heapSize, largest);
            }
        }

    }
}
