package implementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UtopianTree {

	static int utopianTree(int n) {


		int i = 1;
		int h = 1;
		while(i <= n){
			if(i % 2 != 0){
				h = h * 2;
			}

			else if(i % 2 == 0){
				h = h + 1;
			}

			i++;
		}

		return h;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int a0 = 0; a0 < t; a0++){
			int n = in.nextInt();
			int result = utopianTree(n);
			System.out.println(result);
		}
		in.close();
	}
}
