package com.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
Output: [1,2,3,6,9,8,7,4,5]
 * @author jay_sheth
 *
 */
public class SpiralMatrix {
// https://leetcode.com/explore/learn/card/array-and-string/202/introduction-to-2d-array/1168/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[][] = {{1, 2, 3,4},
                {4, 5, 6,7},
                {8, 9, 10,11}};
		spiralOrder(a1);
	}

	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new ArrayList<Integer>();
        if (matrix == null || matrix.length == 0) return result;
        int rowStart = 0;
        int rowEnd = matrix.length -1;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;
        boolean isAdded = false;
        
        
        while (rowStart <= rowEnd && colStart <= colEnd) {
            // traverse l->r
            for (int i=colStart; i <= colEnd; i++) {
                result.add(matrix[rowStart][i]);
                isAdded = true;
            }
            if (!isAdded) return result; isAdded = false;
            rowStart++;
            // traverse down
            for (int i= rowStart; i <= rowEnd; i++) {
                result.add(matrix[i][colEnd]);
                isAdded = true;
            }
            if (!isAdded) return result; isAdded = false;
            colEnd--;
            // traverse r-> l
            for (int i = colEnd; i >= colStart; i--) {
                result.add(matrix[rowEnd][i]);
                isAdded = true;
            }
            if (!isAdded) return result; isAdded = false;
            rowEnd--;
            // traverse top
            for (int i=rowEnd; i >= rowStart; i--) {
                result.add(matrix[i][colStart]);
                isAdded = true;
            }
            if (!isAdded) return result; isAdded = false;
            colStart++;
            
        }
        return result;
    }
    }

