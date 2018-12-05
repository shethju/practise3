package com.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generate(5);
	}

	public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i=0; i < numRows; i++) {
            List<Integer> rowElements = new ArrayList<Integer>();
            for (int j=0; j <=i; j++) {
                if ((j ==0) || j == i) {
                    rowElements.add(1);
                } else {
                    int left = result.get(i-1).get(j-1);
                    int right = result.get(i-1).get(j);
                    rowElements.add(left + right);
                }
            }
        }
        return result;
    }
}
