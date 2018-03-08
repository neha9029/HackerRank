package implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MigratoryBirds {

	static int migratoryBirds(int n, int[] ar) {
		Arrays.sort(ar);
		int count=1;
		int next = 0;
		int max = 0;
		int j = 1;


		for(int i = 0; i<ar.length;i++){
			if(j < ar.length){
				if(ar[i] == ar[j]){
					count++;

				}
				if(ar[i] != ar[j]){
					next++;
				}
				j++;
			}
		}

		System.out.println(next);


		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int ar_i = 0; ar_i < n; ar_i++){
			ar[ar_i] = in.nextInt();
		}
		int result = migratoryBirds(n, ar);
		System.out.println(result);
	}
}
