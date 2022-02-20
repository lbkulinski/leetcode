package com.leetcode.p70;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public final class SolutionTest {
    @Test
    public void test0() {
        int expectedCount = 1;

        Solution solution = new Solution();

        int n = 0;

        int count = solution.climbStairs(n);

        Assertions.assertEquals(expectedCount, count);
    } //test0

    @Test
    public void test1() {
        int expectedCount = 1;

        Solution solution = new Solution();

        int n = 1;

        int count = solution.climbStairs(n);

        Assertions.assertEquals(expectedCount, count);
    } //test1

    @Test
    public void test2() {
        int expectedCount = 2;

        Solution solution = new Solution();

        int n = 2;

        int count = solution.climbStairs(n);

        Assertions.assertEquals(expectedCount, count);
    } //test2

    @Test
    public void test3() {
        int expectedCount = 3;

        Solution solution = new Solution();

        int n = 3;

        int count = solution.climbStairs(n);

        Assertions.assertEquals(expectedCount, count);
    } //test3

    @Test
    public void test4() {
        int expectedCount = 5;

        Solution solution = new Solution();

        int n = 4;

        int count = solution.climbStairs(n);

        Assertions.assertEquals(expectedCount, count);
    } //test4

    @Test
    public void test5() {
        int expectedCount = 165_580_141;

        Solution solution = new Solution();

        int n = 40;

        int count = solution.climbStairs(n);

        Assertions.assertEquals(expectedCount, count);
    } //test5
}