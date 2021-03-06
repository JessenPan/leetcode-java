package org.jessenpan.leetcode.dp;

/**
 * @author jessenpan
 * tag:dynamicProgramming
 */
public class S1025DivisorGame {

    public boolean divisorGame(int n) {

        if (n <= 1) {
            return false;
        }
        int people = 0;
        while (true) {

            if (n <= 1) {
                return people == 1;
            }
            n -= 1;
            people = (people == 0 ? 1 : 0);
        }
    }

}
