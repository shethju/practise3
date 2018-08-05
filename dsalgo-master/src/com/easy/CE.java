package com.easy;

import java.util.ArrayList;
import java.util.List;

public class CE {
    public static void main(String[] args) {
        // NOTE: The following input values are used for testing your solution.

        int[] array1A = {1, 3, 4, 6, 7, 9};
        int[] array2A = {1, 2, 4, 5, 9, 10};
        // commonElements(array1A, array2A) should return [1, 4, 9] (an array).

        int[] array1B = {1, 2, 9, 10, 11, 12};
        int[] array2B = {0, 1, 2, 3, 4, 5, 8, 9, 10, 12, 14, 15};
        // commonElements(array1B, array2B) should return [1, 2, 9, 10, 12] (an array).

        int[] array1C = {0, 1, 2, 3, 4, 5};
        int[] array2C = {6, 7, 8, 9, 10, 11};
        // common_elements(array1C, array2C) should return [] (an empty array).
        System.out.println(commonElements(array1C, array2C));
    }

    // Implement your solution below.
    // NOTE: Remember to return an Integer array, not an int array.
    public static Integer[] commonElements(int[] array1, int[] array2) {
        //Integer[] resultInArray = new Integer[0];
        List<Integer> common = new ArrayList<Integer>();
        int ar1Index = 0;
        int ar2Index = 0;
        while (true) {
        	try {
	            Integer temp = array2[ar2Index];
	            Integer ar1Element = array1[ar1Index];
	            if (ar1Element == null || temp == null) {
	            		break;
	            } else {
		            if (ar1Element == temp) {
		                common.add(array1[ar1Index]);
		                ar1Index++;
		                ar2Index++;
		            } else if (ar1Element > temp) {
		                ar2Index++;
		            } else {
		                ar1Index++;
		            }
	            }
        	} catch (Exception e) {
        		break;
        	}
        }
        return common.toArray(new Integer[common.size()]);
    }
}
