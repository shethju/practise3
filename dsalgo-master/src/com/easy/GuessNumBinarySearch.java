package com.easy;

public class GuessNumBinarySearch {
// https://leetcode.com/problems/guess-number-higher-or-lower/description/
	static int j = 6;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(guessNumber2(10));
	}
	
	/*
	 * l   r    middle
	 * 1   10    5
	 * 1    5    3
	 *      3
	 */

	public static int guessNumber(int n) {
        int l = 1;
        int r = n;
        while (l < r) {
        		int middle = l + (r-l)/2;
        		int guessResult = guess(middle);
        		if (guessResult == 0) return middle;
        		if (guessResult == -1) r = middle; // Not middle-1 e.g. 1 wont work
        		if (guessResult == 1) l = middle + 1;
        }
        return l;
    }
	
	public static int guessNumber2(int n) {
        int l = 1;
        int r = n;
        while (l <= r) {
        		int middle = l + (r-l)/2;
        		int guessResult = guess(middle);
        		if (guessResult == 0) return middle;
        		if (guessResult == -1) r = middle -1; // Not middle-1 e.g. 1 wont work
        		if (guessResult == 1) l = middle + 1;
        }
        return l;
    }
	// -1 j is less than i
	public static int guess(int i) {
		if (i == j) return 0;
		if (i > j) return -1;
		else return 1;
	}
	
	
	    public static int guessNumberLC(int n) {
	        int low = 1;
	        int high = n;
	        while (low <= high) {
	            int mid = low + (high - low) / 2;
	            int res = guess(mid);
	            if (res == 0)
	                return mid;
	            else if (res < 0)
	                high = mid - 1;
	            else
	                low = mid + 1;
	        }
	        return -1;
	    }
	
}

