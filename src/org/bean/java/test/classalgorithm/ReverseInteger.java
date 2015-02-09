package org.bean.java.test.classalgorithm;

/**
 * Created by Administrator on 2015/2/9.
 */
public class ReverseInteger {

    public static void main(String[] args) {
        int input = -342832;
        boolean isNegative = false;
        if (input < 0) {
            isNegative = true;
            input *= -1;
        }
        int res = 0;
        while (input > 0) {
            int mod = input % 10;
            input /= 10;
            res = res * 10 + mod;
        }
        if (isNegative) {
            res *= -1;
        }
        System.out.println(res);
    }

}
