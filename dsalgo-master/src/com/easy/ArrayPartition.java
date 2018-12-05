package com.easy;

import java.util.Arrays;

public class ArrayPartition {
// https://leetcode.com/explore/learn/card/array-and-string/205/array-two-pointer-technique/1154/discuss/102170/Java-Solution-Sorting.-And-rough-proof-of-algorithm.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,4,3,2};
		System.out.println(arrayPairSum(input));
	}
	
	public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i += 2) {
            result += nums[i];
        }
        return result;
    }

}
