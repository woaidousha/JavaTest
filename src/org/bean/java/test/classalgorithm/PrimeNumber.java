package org.bean.java.test.classalgorithm;

import java.util.ArrayList;

/**
 * Created by Administrator on 2015/2/9.
 */
public class PrimeNumber {

    public static void main(String args[]) {
        ArrayList<Integer> primeNumber = new ArrayList<Integer>();
        for (int i = 101; i <= 200; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumber.add(i);
            }
        }
        System.out.println("nums : " + primeNumber.toString());
    }

}
