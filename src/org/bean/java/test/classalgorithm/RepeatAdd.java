package org.bean.java.test.classalgorithm;

/**
 * Created by Administrator on 2015/2/9.
 */
public class RepeatAdd {

    public static void main(String args[]) {
        int input = 3;
        int number = 2;
        int a = 0;
        int sum = 0;
        for (int i = 0; i < input; i++) {
            a = a * 10 + number;
            System.out.println("a : " + a);
            sum += a;
        }
        System.out.println("sum : " + sum);
    }

}
