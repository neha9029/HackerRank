package implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DayOfTheProgrammer {


	static String solve(int year){
		int eightMonths = 0;
		int day = 256;
		int date = 0;
		if(year % 4 ==0 && year%100 == 0 && year%400==0) {
			eightMonths = 244;
		}

		else if(year%100 != 0 && year%400 != 0 && year%4 == 0)
		{
			eightMonths = 244;
		}
		else if(year%100 != 0 && year%400 != 0 && year%4 != 0) {
			eightMonths = 243;
		}
		else if(year%100 == 0 && year%400 != 0 && year%4 == 0) {
			eightMonths = 243;
		}
		if(year == 1918){
			eightMonths = eightMonths - 13;
		}
		if(year < 1918){
			if(year%100 == 0 && year%400 != 0 && year%4 == 0) {
				eightMonths = 244;
			}
		}

		date = day - eightMonths;
		String years = Integer.toString(year);
		String month = "09";
		String dateStr = Integer.toString(date);

		return dateStr+"."+month+"."+years;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		String result = solve(year);
		System.out.println(result);
	}
}
