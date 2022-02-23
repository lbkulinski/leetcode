package com.leetcode.p198;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SolutionTest {
    @Test
    public void test0() {
        int expectedAmount = 4;

        Solution solution = new Solution();

        int[] numbers = {1, 2, 3, 1};

        int amount = solution.rob(numbers);

        Assertions.assertEquals(expectedAmount, amount);
    } //test0

    @Test
    public void test1() {
        int expectedAmount = 12;

        Solution solution = new Solution();

        int[] numbers = {2, 7, 9, 3, 1};

        int amount = solution.rob(numbers);

        Assertions.assertEquals(expectedAmount, amount);
    } //test1

    @Test
    public void test2() {
        int expectedAmount = 3_005;

        Solution solution = new Solution();

        int[] numbers = {28, 599, 849, 315, 970, 814, 76, 317, 346, 841};

        int amount = solution.rob(numbers);

        Assertions.assertEquals(expectedAmount, amount);
    } //test2

    @Test
    public void test3() {
        int expectedAmount = 4;

        Solution solution = new Solution();

        int[] numbers = {2, 1, 1, 2};

        int amount = solution.rob(numbers);

        Assertions.assertEquals(expectedAmount, amount);
    } //test3

    @Test
    public void test4() {
        int expectedAmount = 2;

        Solution solution = new Solution();

        int[] numbers = {2, 1};

        int amount = solution.rob(numbers);

        Assertions.assertEquals(expectedAmount, amount);
    } //test4
}