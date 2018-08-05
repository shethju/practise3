package com.easy;

public class MSJay {
    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        int[][] bombs1 = {{0, 2}, {2, 0}};
        mineSweeper(bombs1, 3, 3); //should return:
        // [[0, 1, -1],
        //  [1, 2, 1],
        //  [-1, 1, 0]]

        int[][] bombs2 = {{0, 0}, {0, 1}, {1, 2}};
        // mineSweeper(bombs2, 3, 4) should return:
        // [[-1, -1, 2, 1],
        //  [2, 3, -1, 1],
        //  [0, 1, 1, 1]]

        int[][] bombs3 = {{1, 1}, {1, 2}, {2, 2}, {4, 3}};
        // mineSweeper(bombs3, 5, 5) should return:
        // [[1, 2, 2, 1, 0],
        //  [1, -1, -1, 2, 0],
        //  [1, 3, -1, 2, 0],
        //  [0, 1, 2, 2, 1],
        //  [0, 0, 1, -1, 1]]
    }

    // Implement your solution below.
    public static int[][] mineSweeper(int[][] bombs, int numRows, int numCols) {
        int[][] field = new int[numRows][numCols];
        //if (bombs.length == 0) return field;
        for (int[] bomb : bombs) {
        		System.out.println("");
        		int x = bomb[0];
        		int y = bomb[1];
        		for (int i = -1; i <= 1; i++) {
        			for (int j = -1; j <= 1; j++) {
        				int tempx = x + i;
        				int tempy = y + j;
        				if ((tempx >=0 && tempx < numRows) && (tempy >= 0 && tempy < numCols)) {
        					if (i ==0 && j == 0) {
        						field[tempx][tempy] = -1;
        					} else {
        						if (field[tempx][tempy] != -1) {
        							field[tempx][tempy] = field[tempx][tempy] + 1;
        						}
        					}
        				}
        			}
        		}
        }
        return field;
    }
 }
