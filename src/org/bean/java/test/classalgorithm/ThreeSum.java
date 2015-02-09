package org.bean.java.test.classalgorithm;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Administrator on 2015/2/9.
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * For example, given array S = {-1 0 1 2 -1 -4},
 * <p/>
 * A solution set is:
 * (-1, 0, 1)
 * (-1, -1, 2)
 */
public class ThreeSum {

    public static void main(String args[]) {
        int array[] = {-1, 0, 1, 2, -1, -4};
        System.out.println("res : " + threeSum(array));
    }

    /*
    * o(n^3)
    * */
    public static ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        Arrays.sort(num);

        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < num.length; i++) {
            int o = num[i];
            if (o > 0) {
                break;
            }
            for (int j = i + 1; j < num.length; j++) {
                int p = num[j];
                if (o + p > 0) {
                    break;
                }
                for (int m = j + 1; m < num.length; m++) {
                    int q = num[m];
                    if (o + p + q == 0) {
                        ArrayList<Integer> each = new ArrayList<Integer>();
                        each.add(o);
                        each.add(p);
                        each.add(q);
                        result.add(each);
                    }
                }
            }
        }
        return result;
    }

}
