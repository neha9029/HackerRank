package algorithm.string;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CamelCase {


	static int camelcase(String s) {


		String [] strNew = s.split("(?=[A-Z])");

		return strNew.length;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		// int result = camelcase("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");
		int result = camelcase(s);
		System.out.println(result);
		in.close();
	}
}
