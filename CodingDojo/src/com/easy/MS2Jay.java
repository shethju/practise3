package com.easy;

import java.util.ArrayDeque;

public class MS2Jay {
    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        int[][] field1 = {{0, 0, 0, 0, 0},
                          {0, 1, 1, 1, 0},
                          {0, 1, -1, 1, 0}};

        click(field1, 3, 5, 2, 2);// should return:
        // [[0, 0, 0, 0, 0],
        //  [0, 1, 1, 1, 0],
        //  [0, 1, -1, 1, 0]]

        // click(field1, 3, 5, 1, 4) should return:
        // [[-2, -2, -2, -2, -2],
        //  [-2, 1, 1, 1, -2],
        //  [-2, 1, -1, 1, -2]]


        int[][] field2 = {{-1, 1, 0, 0},
                          {1, 1, 0, 0},
                          {0, 0, 1, 1},
                          {0, 0, 1, -1}};

        // click(field2, 4, 4, 0, 1) should return:
        // [[-1, 1, 0, 0],
        //  [1, 1, 0, 0],
        //  [0, 0, 1, 1],
        //  [0, 0, 1, -1]]

        // click(field2, 4, 4, 1, 3) should return:
        // [[-1, 1, -2, -2],
        //  [1, 1, -2, -2],
        //  [-2, -2, 1, 1],
        //  [-2, -2, 1, -1]]
    }

    // Implement your solution below.
    public static int[][] click(int[][] field, int numRows, int numCols, int givenI, int givenJ) {
	    if (field[givenI][givenJ] == 0) {
	    		field[givenI][givenJ] = -2;
	    		for (int i=givenI -1; i <= givenI + 1; i++) {
		    		for (int j=givenJ-1; j <= givenJ + 1; j++) {
		    			if (i >= 0 && i < numRows && j >=0 && j < numCols) {
		    				if (field[i][j] == 0) {
		    					click(field, numRows, numCols, i, j);
		    				}
		    			}
		    		}
		    }
	    }
    	return field;
    }
 }
