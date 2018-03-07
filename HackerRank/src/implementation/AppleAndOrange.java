package implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AppleAndOrange {

	static int[] appleAndOrange(int s, int t, int a, int b, int[] apple, int[] orange) {
		// Complete this function
		int appleRegion[] = new int [apple.length];
		int orangeRegion[] = new int [orange.length];
		int total[] = new int[2];
		int appleCount = 0;

		int orangeCount = 0;

		for(int i = 0; i < apple.length; i++){
			appleRegion[i] = a + apple[i];
			// System.out.println(appleRegion[i]);

			if(appleRegion[i] >= s && appleRegion[i] <= t){
				appleCount++;
				// System.out.println(appleCount);


			}

		}
		for(int i = 0; i < orange.length; i++){
			orangeRegion[i] = b + orange[i];

			//System.out.println(orangeRegion[i]);
			if(orangeRegion[i] >= s && orangeRegion[i] <= t){
				orangeCount++;

				//System.out.println(orangeCount);

			}
			total[0] = appleCount;

			total[1] = orangeCount;

		}
		return total;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int t = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();
		int[] apple = new int[m];
		for(int apple_i = 0; apple_i < m; apple_i++){
			apple[apple_i] = in.nextInt();
		}
		int[] orange = new int[n];
		for(int orange_i = 0; orange_i < n; orange_i++){
			orange[orange_i] = in.nextInt();
		}
		int[] result = appleAndOrange(s, t, a, b, apple, orange);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
		}
		System.out.println("");


		in.close();
	}

}
