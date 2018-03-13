package algorithm.string;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SuperReducedString {

	static String super_reduced_string(String s){
		char str[] = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		StringBuilder sb = new StringBuilder();
		stack.push(str[0]);
		char peek = '-';

		for(int i = 1; i<str.length;i++){

			if(stack.isEmpty()){
				peek = '-';
			}
			else{
				peek = (char) stack.peek();
			}

			if(str[i] == peek){
				stack.pop();

			}
			else{
				stack.push(str[i]);
			}


		}


		if(stack.isEmpty()){
			return "Empty String";
		}

		Object array[] = stack.toArray();

		for(int i = 0; i<array.length;i++){
			sb.append((char)array[i]);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String result = super_reduced_string(s);
		System.out.println(result);
	}
}
