package com.leetcode.p1137;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public final class SolutionTest {
    @Test
    public void test0() {
        int expectedValue = 0;

        Solution solution = new Solution();

        int n = 0;

        int value = solution.tribonacci(n);

        Assertions.assertEquals(expectedValue, value);
    } //test0

    @Test
    public void test1() {
        int expectedValue = 1;

        Solution solution = new Solution();

        int n = 1;

        int value = solution.tribonacci(n);

        Assertions.assertEquals(expectedValue, value);
    } //test1

    @Test
    public void test2() {
        int expectedValue = 1;

        Solution solution = new Solution();

        int n = 2;

        int value = solution.tribonacci(n);

        Assertions.assertEquals(expectedValue, value);
    } //test2

    @Test
    public void test3() {
        int expectedValue = 2;

        Solution solution = new Solution();

        int n = 3;

        int value = solution.tribonacci(n);

        Assertions.assertEquals(expectedValue, value);
    } //test3

    @Test
    public void test4() {
        int expectedValue = 4;

        Solution solution = new Solution();

        int n = 4;

        int value = solution.tribonacci(n);

        Assertions.assertEquals(expectedValue, value);
    } //test4

    @Test
    public void test5() {
        int expectedValue = 1_389_537;

        Solution solution = new Solution();

        int n = 25;

        int value = solution.tribonacci(n);

        Assertions.assertEquals(expectedValue, value);
    } //test5

    @Test
    public void test6() {
        int expectedValue = 75_300_028;

        Solution solution = new Solution();

        int n = 40;

        int value = solution.tribonacci(n);

        Assertions.assertEquals(expectedValue, value);
    } //test6
}