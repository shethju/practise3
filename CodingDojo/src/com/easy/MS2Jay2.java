package com.easy;

import java.util.ArrayDeque;

public class MS2Jay2 {
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
	    ArrayDeque<int[]> toCheck = new ArrayDeque<int[]>();
	    if (field[givenI][givenJ] == 0) {
	    		field[givenI][givenJ] = -2;
	    		int[] coordinates = {givenI, givenJ};
	    		toCheck.add(coordinates);
	    } else {
	    		return field;
	    }
	    while (!toCheck.isEmpty()) {
	    		int[] currentCoordinates = toCheck.remove();
	    		int currentI = currentCoordinates[0];
	    		int currentJ = currentCoordinates[1];
	    		for (int i=currentI -1; i <= currentI + 1; i++) {
		    		for (int j=currentJ-1; j <= currentJ + 1; j++) {
		    			if (i >= 0 && i < numRows && j >=0 && j < numCols) {
		    				if (field[i][j] == 0) {
		    					field[i][j] = -2;
		    					int[] coordinates = {i, j};
		                     toCheck.add(coordinates);
		    				}
		    			}
		    		}
		    }
	    }
	    return field;
    }
 }
