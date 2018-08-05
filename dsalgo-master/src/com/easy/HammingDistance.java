package com.easy;

public class HammingDistance {
  public static int hammingDistanceEasy(int x, int y) {
    return Integer.bitCount(x ^ y);
  }

  public static int hammingDistance(int x, int y) {
    int distance = 0;
    String xStr = Integer.toBinaryString(x);
    String yStr = Integer.toBinaryString(y);
    int xStrLength = xStr.length() - 1;
    int yStrLength = yStr.length() - 1;
    int lengthDiff = Math.abs(xStrLength - yStrLength);
    // int unequalLength;
    boolean isXstrLonger = false;
    boolean isYstrLonger = false;
    boolean isSameLength = false;
    if (xStrLength > yStrLength) {
      isXstrLonger = true;
    } else if (yStrLength > xStrLength) {
      isYstrLonger = true;
    } else {
      isSameLength = true;
    }

    if (isSameLength) {
      for (int i = 0; i <= xStrLength; i++) {
        if (yStr.charAt(i) != xStr.charAt(i)) {
          distance += 1;
        }
      }
    }
    else {
        if (isXstrLonger) {
          for (int i = 0; i <= yStrLength; i++) {
          if (xStr.charAt(lengthDiff + i) != yStr.charAt(i)) {
              distance += 1;
            }
          }
        } else if (isYstrLonger) {
          for (int i = 0; i <= xStrLength; i++) {
          if (yStr.charAt(lengthDiff + i) != xStr.charAt(i)) {
            distance += 1;
          }
          }
        }

      int iterationLength;
      if (isXstrLonger) {
        iterationLength = lengthDiff - 1;
      } else {
        iterationLength = lengthDiff - 1;
      }
      for (int i = 0; i <= iterationLength; i++) {
        if (isXstrLonger) {
          if (xStr.charAt(i) == '1') {
            distance += 1;
          }
        } else {
          if (yStr.charAt(i) == '1') {
            distance += 1;
          }
        }
      }
    }
    
    return distance;
  }

  public static void main(String[] args) {
    // 10,0 ; 1,0 ; 4, 14
    System.out.println("Hamming distance is **" + hammingDistanceEasy(14, 4));
  }

}
