package implementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BeautifulDaysAtTheMovies {

	static int beautifulDays(int i, int j, int k) {

		int array[] = new int[(j-i)+1];
		int count = 0;
		for(int num = 0; num<array.length;num++){
			if(i <= j){
				array[num] = i;
				i++;

			}
		}

		for(int element :array){
			if(isDivisible(element,k)){
				count++;
			}
		}
		return count;
	}

	public static boolean isDivisible(int n, int l){

		int reverse = 0;
		int duplicateN = n;
		while(n > 0){
			reverse = (reverse * 10)+(n%10);
			n = n/10;
		}

		int absolute = duplicateN-reverse;

		if( Math.abs(absolute) % l == 0){
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		int j = in.nextInt();
		int k = in.nextInt();
		int result = beautifulDays(i, j, k);
		System.out.println(result);
		in.close();
	}
}
