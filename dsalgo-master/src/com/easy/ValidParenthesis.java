package com.easy;

import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	    public boolean isValid(String s) {
	        
	        if(s == null || s.isEmpty()){
	            return true;
	        }
	        Stack<Character> bracketStack = new Stack<Character>();
	        for(char c : s.toCharArray()){
	            if(c == '('){
	                bracketStack.push(')');
	            }
	             else if(c == '{'){
	                bracketStack.push('}');
	            }
	             else if(c == '['){
	                bracketStack.push(']');
	            }
	            else if(bracketStack.isEmpty() || bracketStack.pop() != c){
	                return false;
	            }
	             
	        }
	        return bracketStack.isEmpty();
	        
	    }
	
}
