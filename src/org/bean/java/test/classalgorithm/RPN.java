package org.bean.java.test.classalgorithm;

import java.util.Stack;

/**
 * Created by Administrator on 2015/2/9.
 * <p/>
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * <p/>
 * Valid operators are +, -, *, /. Each operand may be an integer or another expression.
 * <p/>
 * Some examples:
 * ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 * ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 */
public class RPN {

    public static void main(String args[]) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        String operator = "+-*/";

        Stack<String> stack = new Stack<String>();
        for (String token : tokens) {
            if (operator.contains(token)) {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                int result = 0;
                if (token.equals("+")) {
                    result = a + b;
                } else if (token.equals("-")) {
                    result = a - b;
                } else if (token.equals("*")) {
                    result = a * b;
                } else if (token.equals("/")) {
                    result = a / b;
                }
                stack.push(result + "");
            } else {
                stack.push(token);
            }
        }
        System.out.println(stack.pop());
        return;
    }

}
