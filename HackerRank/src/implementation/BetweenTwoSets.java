package implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BetweenTwoSets {

	static int getTotalX(int[] a, int[] b) {

		Arrays.sort(a);
		Arrays.sort(b);
		int num = 0;
		int lastElemA = a[a.length-1];


		int factor = lastElemA;

		int iterations = 0;
		while(true){

			boolean breakLoop = false;
			boolean condition[] = new boolean[a.length];
			for(int i=0;i<a.length;i++){

				if(factor%a[i] == 0)
					condition[i] = true;
				else condition[i] = false;

			}
			for(int k=0;k<condition.length; k++){

				if(condition[k] == false){
					breakLoop = true;
					break;
				}

			}

			if(breakLoop)
				factor++;
			else
				break;

			iterations++;

			if(iterations>10000)
				return 0;

		}

		//System.out.println(factor+"===factor");
		lastElemA = factor;
		int i=0;

		boolean test = false;

		while(true){

			boolean breakLoop = false;
			//System.out.println(lastElemA);

			boolean condition[] = new boolean[b.length];
			for(int j=0;j<b.length;j++){

				if(test){
					System.out.println(b[j]);
					System.out.println(lastElemA);
					System.out.println(b[j]%lastElemA);

				}
				if(b[j]%lastElemA == 0)
					condition[j] = true;
				else
					condition[j] = false;

			}

			//System.out.println(Arrays.toString(condition));

			for(int k=0;k<condition.length; k++){

				if(condition[k] == false){
					breakLoop = true;
					break;
				}

			}

			if(!breakLoop)
				num++;

			lastElemA += factor; 
			i++;

			if(i==b[b.length-1])
				break;

		}

		return num;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n];
		for(int a_i = 0; a_i < n; a_i++){
			a[a_i] = in.nextInt();
		}
		int[] b = new int[m];
		for(int b_i = 0; b_i < m; b_i++){
			b[b_i] = in.nextInt();
		}
		int total = getTotalX(a, b);
		System.out.println(total);
		in.close();
	}

}
