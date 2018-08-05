package com.easy;
import java.util.HashMap;

public class HighestFrequencyElementARray {
    public static void main(String[] args) {
        // NOTE: The following input values are used for testing your solution.

        // mostFrequent(array1) should return 1.
        int[] array1 = {1, 3, 1, 3, 2, 1};
        // mostFrequent(array2) should return 3.
        int[] array2 = {3, 3, 1, 3, 2, 1};
        // mostFrequent(array3) should return null.
        int[] array3 = {};
        // mostFrequent(array4) should return 0.
        int[] array4 = {0};
        // mostFrequent(array5) should return -1.
        int[] array5 = {0, -1, 10, 10, -1, 10, -1, -1, -1, 1};
        System.out.println(mostFreqent(array5));
    }

    // Implement your solution below.
    public static Integer mostFreqent(int[] givenArray) {
        Integer maxItem = null;
        int count = givenArray.length;
        if (givenArray == null || count == 0) return maxItem;
        HashMap<Integer, Integer> elementCount = new HashMap<Integer, Integer>();
        Integer tempCount = 0;
        int maxCount = 0;
        for (int i=0; i < count; i++) {
            tempCount = elementCount.get(givenArray[i]);
            if (tempCount == null) {
                elementCount.put(givenArray[i], 1);
                if (maxCount == 0) {
                    maxItem = givenArray[i];
                    maxCount = 1;
                }
            } else {
                elementCount.put(givenArray[i], tempCount + 1);
                if (maxCount < tempCount + 1) {
                    maxItem = givenArray[i];
                    maxCount = tempCount + 1;
                }
            }
        }
        return maxItem;
    }
}
