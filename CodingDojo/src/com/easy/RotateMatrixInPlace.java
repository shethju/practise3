package com.easy;

public class RotateMatrixInPlace {
    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        int a1[][] = {{1, 2, 3},
                      {4, 5, 6},
                      {7, 8, 9}};
        rotate(a1, 3);// should return:
        // [[7, 4, 1],
        //  [8, 5, 2],
        //  [9, 6, 3]]

        int a2[][] = {{1, 2, 3, 4},
                      {5, 6, 7, 8},
                      {9, 10, 11, 12},
                      {13, 14, 15, 16}};
        rotate(a2, 4);// should return:
        // [[13, 9, 5, 1],
        //  [14, 10, 6, 2],
        //  [15, 11, 7, 3],
        //  [16, 12, 8, 4]]
        int a3[][] = {{1, 2, 3, 4, 5},
                		{6, 7, 8, 9, 10},
                		{11, 12, 13, 14, 15},
                		{16, 17, 18, 19, 20},
                		{21,22,23,24,25}};
     // 
        /*
      * [[21,16,11,6,1],
      * [22,17,12,7,2],
      * [23,18,13,8,3],
      * [24,19,14,9,4],
      * [25,20,15,10,5]
      * ]
      */
    }

    // Implement your solution below.
    public static int[][] rotate(int[][] a, int n) {
        int outerIterations = (int)Math.floor(n/2);
        for (int outIteration = 0; outIteration < outerIterations;  outIteration++) {
        		int[] temp = {-1, -1, -1, -1};
        		for (int i=0; i < n - (outIteration * 2) - 1; i++) {
        			int xy[] = {outIteration+i, 0};
        			for (int j=0; j <=3; j++) {
        				temp[j] = a[xy[0]][xy[1]];
        				int[] coordinates = rotatesub(xy[0],xy[1],n);
        				xy[0] = coordinates[0];
        				xy[1] = coordinates[1];
        			}
        			xy[0] = outIteration+i;
        			xy[1] = 0;
        			for (int j=0; j <=3; j++) {
        				a[xy[0]][xy[1]] = temp[(j+3)%4];
        				int[] coordinates = rotatesub(xy[0],xy[1],n);
        				xy[0] = coordinates[0];
        				xy[1] = coordinates[1];
        			}
        		}
        }
        return a;
    }
    
    private static int[] rotatesub(int i, int j, int n) {
    		int[] value = {j, n - 1 - i};
    		return value;
    }
 }
