package com.easy;

public class IsPowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(isPowerOfTwo(7));
	}

	public static boolean isPowerOfTwo(int n) {
		return (n > 0) && (n & n-1) == 0;
	}
}
