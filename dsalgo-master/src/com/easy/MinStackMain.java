package com.easy;

public class MinStackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		//minStack.push(1);
		System.out.println(minStack.getMin());   //--> Returns -3.
		minStack.pop();
		System.out.println(minStack.top());      //--> Returns 0.
		System.out.println(minStack.getMin());   //--> Returns -2.
	}

}
