package org.bean.java.test;

import java.util.Random;

public class ArrayTool {

    public static int[] buildArray() {
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        int length = random.nextInt(30);
        int array[] = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(length);
        };
        return array;
    }

    public static void swap(int[] array, int i, int j ) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
