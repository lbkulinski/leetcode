package com.leetcode.p387;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public final class SolutionTest {
    @Test
    public void test0() {
        int expectedIndex = 0;

        Solution solution = new Solution();

        String string = "leetcode";

        int index = solution.firstUniqChar(string);

        Assertions.assertEquals(expectedIndex, index);
    } //test0

    @Test
    public void test1() {
        int expectedIndex = 2;

        Solution solution = new Solution();

        String string = "loveleetcode";

        int index = solution.firstUniqChar(string);

        Assertions.assertEquals(expectedIndex, index);
    } //test1

    @Test
    public void test2() {
        int expectedIndex = -1;

        Solution solution = new Solution();

        String string = "aabb";

        int index = solution.firstUniqChar(string);

        Assertions.assertEquals(expectedIndex, index);
    } //test2

    @Test
    public void test3() {
        int expectedIndex = 0;

        Solution solution = new Solution();

        String string = "helloworld";

        int index = solution.firstUniqChar(string);

        Assertions.assertEquals(expectedIndex, index);
    } //test3

    @Test
    public void test4() {
        int expectedIndex = 2;

        Solution solution = new Solution();

        String string = "baseball";

        int index = solution.firstUniqChar(string);

        Assertions.assertEquals(expectedIndex, index);
    } //test4
}