package org.bean.java.test.classalgorithm;

/**
 * Created by Administrator on 2015/3/1.
 */
public class FindGreatSubArraySum {

    public static int findSubSum(int[] array) {
        int currentSum = 0;
        int maxSum = 0;
        for (int i = 0; i < array.length; i++) {
            currentSum = Math.max(currentSum + array[i], 0);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }

    public static void main(String args[]) {
        int array[] = {1, -2, 3, 10, -4, 7, 2, -5};
        int maxSum = findSubSum(array);
        System.out.println(maxSum);
    }

}
