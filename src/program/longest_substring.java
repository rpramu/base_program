package program;

import java.util.Stack;

public class longest_substring {
	
	public static void main(String[] args) {
		String s= "(()(()";
		System.out.println(max_length(s));
		
	}
	
	public static int max_length(String s) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(-1);
		
		int maxlen =0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)== '(') {
				stack.push(i);
			}else {
				stack.pop();
				if(stack.isEmpty()) {
					stack.push(i);
				}else {
					maxlen = Math.max(maxlen, i-stack.peek());
				}
			}
		}
		return maxlen;
	}

}
