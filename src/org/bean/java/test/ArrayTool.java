package org.bean.java.test;

import java.util.Arrays;
import java.util.Random;

public class ArrayTool {

    public static int[] buildArray() {
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        int length = Math.abs(random.nextInt()) % 10;
        int array[] = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = Math.abs(random.nextInt()) % 50;
        };
        return array;
    }

    public static void swap(int[] array, int i, int j ) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void print(int array[]) {
        System.out.println(Arrays.toString(array));
    }
}
