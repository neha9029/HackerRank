package implementation;

import java.util.*;

public class CountingValley {

	static int countingValleys(int n, String s) {

		int count = 0;
		int equalizer = 0;
		char ch[] = s.toCharArray();
		for(int i = 0; i<ch.length; i++){
			if(ch[i] == 'D'){
				equalizer--;
				//System.out.println("equa--" +equalizer);

				if(equalizer == -1){                         
					count++;
				}


			}
			if(ch[i] == 'U'){
				equalizer++;
				//System.out.println("equa++" +equalizer);


			}
		}

		return count;

	}


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		int result = countingValleys(n, s);
		System.out.println(result);
		in.close();
	}
}
