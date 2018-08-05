package com.easy;

import java.util.HashMap;

public class NRJay {
    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        nonRepeating("abcab"); // should return 'c'
        nonRepeating("abab"); // should return null
        nonRepeating("aabbbc"); // should return 'c'
        nonRepeating("aabbdbc"); // should return 'd'
    }

    // Implement your solution below.
    public static Character nonRepeating(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (map.containsKey(c)) {
                int count = map.get(c);
                map.put(c, count + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (map.containsKey(c) && map.get(c) == 1) {
                return c;
            }
        }
        return null;
    }
}
