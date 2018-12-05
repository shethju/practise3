package com.easy;

public class StringIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strStr("a","a"));
	}

	public static int strStr(String haystack, String needle) {
		if (haystack == null) return -1;
        if (needle == null) return -1;
        if (needle.isEmpty()) return 0;
        int stackLength = haystack.length() - 1;
        int needleLength = needle.length() -1;
        for (int i=0; i <= stackLength; i++) {
            for (int j=0; j <= needleLength; j++) {
                if (i + j == stackLength + 1) return -1;
                if (needle.charAt(j) != haystack.charAt(i+j)) break;
                if (j == needleLength) return i;
            }
        }
        return -1;
    }
}
