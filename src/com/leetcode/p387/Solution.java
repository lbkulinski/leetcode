package com.leetcode.p387;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.HashMap;

public final class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> characterToCount = new LinkedHashMap<>();

        Map<Character, Integer> characterToIndex = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);

            characterToCount.compute(character, (k, v) -> (v == null) ? 1 : (v + 1));

            if (!characterToIndex.containsKey(character)) {
                characterToIndex.put(character, i);
            } //end if
        } //end for

        int index = -1;

        for (Map.Entry<Character, Integer> entry : characterToCount.entrySet()) {
            int value = entry.getValue();

            int expectedValue = 1;

            if (value == expectedValue) {
                char key = entry.getKey();

                index = characterToIndex.get(key);

                break;
            } //end if
        } //end for

        return index;
    } //firstUniqChar
}