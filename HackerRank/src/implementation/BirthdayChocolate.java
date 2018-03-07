package implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BirthdayChocolate {

	static int solve(int n, int[] s, int d, int m){


		int count = 0;
		for(int i=0; i<n; i++){

			int bucket[] = new int[m];
			int buckCount = 0;
			for(int j=0; j<m; j++){

				if(i+buckCount < n){
					bucket[j] = s[i+buckCount];
					buckCount++;
				}

			}

			if(sum(bucket) == d)
				count++;

		}

		return count;

	}

	static int sum(int[] array){

		int ans = 0;
		for(int i=0;i<array.length; i++){

			ans+= array[i];

		}
		return ans;
	}


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] s = new int[n];
		for(int s_i=0; s_i < n; s_i++){
			s[s_i] = in.nextInt();
		}
		int d = in.nextInt();
		int m = in.nextInt();
		int result = solve(n, s, d, m);
		System.out.println(result);
	}
}
