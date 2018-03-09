package dataStructures.stacks;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BalancedBrackets {
	static String isBalanced(String s) {

		char str[] = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		char curly = '}';
		char square = ']';
		char round = ')';
		HashMap<Character,Character> map = new HashMap<Character,Character>();
		map.put('}','{');
		map.put(')','(');
		map.put(']','[');

		for(int i = 0;i<str.length;i++){
			if(stack.empty() || (str[i] != curly && str[i] != round && str[i] != square)){
				stack.push(str[i]);

			}
			if(str[i] == curly || str[i] == round || str[i] == square){

				// System.out.println("peek"+stack.peek());
				if(stack.peek() == map.get(str[i])){
					stack.pop();

				}
			}
		}
		if(stack.empty() == true){
			return "YES";
		}
		else{
			return "NO";
		}



	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int a0 = 0; a0 < t; a0++){
			String s = in.next();
			String result = isBalanced(s);
			System.out.println(result);
		}
		in.close();
	}
}
