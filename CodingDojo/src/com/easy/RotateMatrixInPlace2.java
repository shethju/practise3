package com.easy;


public class RotateMatrixInPlace2 {
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
        // n/2 gives us floor(n/2)
        // and n/2 + n%2 gives us ceiling(n/2)
        int outerLoop = (int) Math.ceil(n/2);// + 1 only if n is odd
        int innerLoop = (int) Math.floor(n/2);
    		for (int i = 0; i <  n / 2 + n % 2; i++) {
            for (int j = 0; j < n / 2; j++) {
                int[] tmp = new int[4];
                int currentI = i;
                int currentJ = j;
                for (int k = 0; k < 4; k++) {
                    tmp[k] = a[currentI][currentJ];
                    int[] newCoordinates = rotateSub(currentI, currentJ, n);
                    currentI = newCoordinates[0]; currentJ = newCoordinates[1];
                }
                for (int k = 0; k < 4; k++) {
                    a[currentI][currentJ] = tmp[(k + 3) % 4];
                    int[] newCoordinates = rotateSub(currentI, currentJ, n);
                    currentI = newCoordinates[0]; currentJ = newCoordinates[1];
                }
            }
        }
        return a;
    }

    public static int[] rotateSub(int i, int j, int n) {
        int[] newCoordinates = new int[2];
        newCoordinates[0] = j;
        newCoordinates[1] = n - 1 - i;
        return newCoordinates;
    }
 }
