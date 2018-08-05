package com.easy;

public class OAJay {
    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
    	isOneAway("aaa", "abc");    
    	isOneAway("abcde", "abcd");  // should return true
        isOneAway("abde", "abcde");  // should return true
        isOneAway("a", "a");  // should return true
        isOneAway("abcdef", "abqdef");  // should return true
        isOneAway("abcdef", "abccef");  // should return true
        isOneAway("abcdef", "abcde");  // should return true
          // should return false
        isOneAway("abcde", "abc");  // should return false
        isOneAway("abc", "abcde");  // should return false
        isOneAway("abc", "bcc");  // should return false
    }
/*
isOneAway("abcdef", "abcde");  // should return true
isOneAway("abcde", "abcdef"); 
isOneAway("abde", "abcde");  // should return true
isOneAway("abc", "bbcd");
*/
    // Implement your solution below.
    public static Boolean isOneAway(String s1, String s2) {
        if (s1 == null || s2 == null) return false;
        int s1Length = s1.length(); int s2Length = s2.length();
        if (Math.abs(s1Length - s2Length) > 1) return false;
        int diffInCharacter = 0;
        int iterationLength = s1Length > s2Length ? s2Length : s1Length;
        int j = 0;
        for (int i=0; i < iterationLength; ) {
            if (diffInCharacter > 1) return false;
            Character c1 = s1.charAt(i);
            Character c2 = s2.charAt(j);
            if (c1 != c2) {
                diffInCharacter++;
                if ((j+1 < s2Length) && s1.charAt(i) == s2.charAt(j+1)) {
                    j = j + 1;
                    continue;
                }
            }
            i++; j++;
        }
        if (s2Length > s1Length && j == iterationLength) diffInCharacter++;
        if (diffInCharacter > 1) return false;
        return true;
    }
}

