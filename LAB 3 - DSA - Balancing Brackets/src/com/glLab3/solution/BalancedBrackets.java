package com.glLab3.solution;
import java.util.Stack;
public class BalancedBrackets {

	public boolean checkExpression(String expression) {
		
		Stack<Character> stack = new Stack<>();
		
		for(char c : expression.toCharArray()) {
			if(c == '(' || c == '{' || c == '[') {
				stack.push(c);
				continue;
			}
			
			if(stack.isEmpty())
				return false;
			
			char bracket;
			switch(c) {
				
				case ')':
					bracket = stack.pop();
					if(bracket=='{' || bracket=='[')
						return false;
					break;
					
				case '}':
					bracket = stack.pop();
					if(bracket=='[' || bracket=='(')
						return false;
					break;
					
				case ']':
					bracket = stack.pop();
					if(bracket=='(' || bracket=='{')
						return false;
					break;	
			}
		}
		
		return(stack.isEmpty());
		
	}
}
