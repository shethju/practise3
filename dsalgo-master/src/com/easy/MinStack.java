package com.easy;

import java.util.ArrayList;
import java.util.List;

class MinStack {
    List<Integer> list;
    int size = 0;
    int minIndex = 0;
    /** initialize your data structure here. */
    public MinStack() {
        list = new ArrayList<Integer>();
    }
    
    public void push(int x) {
        list.add(x);
        if (x <= list.get(minIndex)) {
            minIndex = size;
        }
        size = size + 1;
    }
    
    public void pop() {
    		boolean isMinRemoved = (minIndex == size - 1) ? true : false; // if element removed is the minimum
        if (!isEmpty()) {
            list.remove(size - 1);
            size = size - 1;
        }
        if (isMinRemoved) {
        		findMinimumIndex();
        }
    }
    
    private void findMinimumIndex() {
    		minIndex = 0;
    		for (int i = 0; i < list.size(); i++) {
    			if (list.get(i) < list.get(minIndex)) {
    				minIndex = i; 
    			}
    		}
    }
    
    public int top() {
        if (!isEmpty())
            return list.get(size - 1);
        else
            return list.get(0);
    }
    
    public int getMin() {
        if (!isEmpty())
            return list.get(minIndex);
        else
            return list.get(0);
    }
    
    private boolean isEmpty() {
        return (size <= 0) ? true : false;
    }

	
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */