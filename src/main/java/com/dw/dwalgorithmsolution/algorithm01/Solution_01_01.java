package com.dw.dwalgorithmsolution.algorithm01;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Solution_01_01 {
    private static final Logger LOGGER =  LoggerFactory.getLogger(Solution_01_01.class.getName());

    /**
     * minimum of three numbers
     * <p>
     * Write a program that receives natural numbers A, B, and C less than 100
     * and outputs the smallest of the three numbers.
     * (don't use sort)
     * <p>
     * ▣ Input description
     * The first line contains three natural numbers less than 100.
     * <p>
     * ▣ Output Description
     * Print the smallest number on the first line.
     * <p>
     * ▣ Input Example 1
     * 6 5 11
     * <p>
     * ▣ Output example 1
     * 5
     */

    private static void solution(int arg1, int arg2, int arg3) {
        // code your solution here
        System.out.println("hello world");
    }

    public static void main(String[] args) {
        solution(5, 7, 3); // expect 3

        int arg1 = (int) (Math.random() * 100);
        int arg2 = (int) (Math.random() * 100);
        int arg3 = (int) (Math.random() * 100);
        LOGGER.info("arg1:{}; arg2:{}, arg3:{}", arg1, arg2, arg3);
        solution(arg1, arg2, arg3);
    }
}
