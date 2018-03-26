package algorithm.string;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PalindromeIndex {
	static int palindromeIndex(String s){
		char array[] = s.toCharArray();

		StringBuilder st = new StringBuilder(s);

		String t = st.reverse().toString();    //getReverse(s);
		if(t.equals(s))
			return -1;


		int lastIndex = s.length()-1;
		for(int i=0; i< s.length()/2; i++){

			if(lastIndex > s.length()/2){

				if(s.charAt(i)!=s.charAt(lastIndex)){

					if(isPalindrome(deleteChar(s, i)))
						return i;
					else if(isPalindrome(deleteChar(s, lastIndex)))
						return lastIndex;
				}
				lastIndex--;

			}



		}

		return -1;
	}

	public static boolean isPalindrome(String a){
		StringBuilder sb1 = new StringBuilder(a);

		return sb1.reverse().toString().equals(a);

	}

	public static String deleteChar(String s,int i){
		StringBuilder b = new StringBuilder(s);
		b.deleteCharAt(i);
		String r = b.toString();
		return r;

	}


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for(int a0 = 0; a0 < q; a0++){
			String s = in.next();
			int result = palindromeIndex(s);
			System.out.println(result);
		}
	}
}
