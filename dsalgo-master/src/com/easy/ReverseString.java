package com.easy;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList();
		q.add(null);
		System.out.print(reverseString("hello"));
	}

	public static String reverseString(String s) {
        if (s == null || s.length() <= 1) return s;
        char[] ch = s.toCharArray();
        int i = 0; int j = s.length() - 1;
        System.out.println(j);
        for (; i > j; i++, j--) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }
        return new String(ch);
    }
}
