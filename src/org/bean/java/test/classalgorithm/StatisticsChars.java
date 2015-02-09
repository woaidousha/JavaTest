package org.bean.java.test.classalgorithm;

/**
 * Created by Administrator on 2015/2/9.
 */
public class StatisticsChars {

    public static void main(String args[]) {
        String input = "fjduia fud aufiejw afhew u8329 r892 yr372 wq y8hdsoifewy r;fhdwfwdsa,c,;KPOJOIKPU(*RY*#M";

        int countLetter = 0;
        int countNumber = 0;
        int countSpace = 0;
        int countOther = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                countLetter++;
            } else if (c >= 'A' && c <= 'Z') {
                countLetter++;
            } else if (c >= '0' && c <= '9') {
                countNumber++;
            } else if (c == ' ') {
                countSpace++;
            } else {
                countOther++;
            }
        }
        System.out.println("countLetter : " + countLetter + ", countNumber : " + countNumber + ", countSpace : " + countSpace + ", countOther:" + countOther);
    }

}
