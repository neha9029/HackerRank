package implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BreakingTheRecords {


	static int[] breakingRecords(int[] score) {

		int lowArray[] = new int[score.length];
		int highArray[] = new int[score.length];

		for(int i=0;i<score.length; i++){

			lowArray[i] = score[i];
			highArray[i] = score[i];

		}

		int totalIncreased = 0;
		int totalLowest = 0;

		int result[] = new int[2];
		for(int i = 0; i < highArray.length; i++){
			int k = i+1;

			if(k < highArray.length){

				if(highArray[k] < highArray[i]){

					highArray[k] = highArray[i];
				}
				if(highArray[k] > highArray[i]){

					totalIncreased++;
					result[0] = totalIncreased;


				}

			}

		}


		for(int i = 0; i < lowArray.length; i++){
			int k = i+1;

			if(k < lowArray.length){

				if(lowArray[k] < lowArray[i]){
					totalLowest++;

					result[1] = totalLowest;
				}
				if(lowArray[k] > lowArray[i]){
					lowArray[k] = lowArray[i];

				}

			}

		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] score = new int[n];
		for(int score_i = 0; score_i < n; score_i++){
			score[score_i] = in.nextInt();
		}
		int[] result = breakingRecords(score);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
		}
		System.out.println("");


		in.close();
	}
}
