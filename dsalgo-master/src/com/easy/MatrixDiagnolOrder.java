package com.easy;

// https://leetcode.com/explore/learn/card/array-and-string/202/introduction-to-2d-array/1167/
/**
 * Input:



[
 {00, 01, 02},
 {10, 11, 12}
]

[
 [ 00, 01, 02, 03 ],
 [ 10, 11, 12, 13 ],
 [ 20, 21, 22, 23 ],
 [ 30, 31, 32, 33]
]

00
01 10
20 11 02
03 12 21 30
31 22 13
23 32 
33


Time complexity: O(m * n), m = number of rows, n = number of columns.
Space complexity: O(1).

 * @author jay_sheth
 *
 */
class MatrixDiagnolOrder {
	public static void main(String args[]) {
		System.out.println(3%2);
		int[][] arr = {
				{00,01,02,03},{10,11,12,13},{20,21,22,23}, {30,31,32,33}
		};
		int [][]arr1 = {{1,2,3},{4,5,6},{7,8,9}};
		int result[] = findDiagonalOrder(arr1);
		for (int i : result) {
			System.out.print(" " + i);
		}
	}
	
	/**
	 * [
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
Output:  [1,2,4,7,5,3,6,8,9]
00
01 10
20 11 02
21 12
22

	 * @param matrix
	 * @return
	 */
	
	public static int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return new int[0];
        int rows = matrix.length, cols = matrix[0].length;
        
        int[] result = new int[rows * cols];
        int x = 0, y = 0;
        for (int i = 0; i < result.length; i++) {
            result[i] = matrix[x][y];
            if ((x + y) % 2 == 0) { // moving up
                if      (y == cols - 1) { x++; }
                else if (x == 0)     { y++; }
                else            { x--; y++; }
            } else {                // moving down
                if      (x == rows - 1) { y++; }
                else if (y == 0)     { x++; }
                else            { x++; y--; }
            }   
        }   
        
        return result;
    }
	
	
}
