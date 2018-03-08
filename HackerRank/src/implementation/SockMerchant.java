package implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SockMerchant {

	static int sockMerchant(int n, int[] ar) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int socks = 0;
		for(int i = 0; i<n;i++){
			if(!map.containsKey(ar[i])){
				map.put(ar[i],1);
			}else{
				int count = map.get(ar[i]);
				count++;
				map.put(ar[i],count);
			}
		}

		for(Map.Entry<Integer,Integer> entry : map.entrySet()){
			// System.out.println(entry.getKey()+ "-" +entry.getValue());
			if(entry.getValue() >= 2){
				socks = socks + entry.getValue()/2;
			}
		}

		return socks; 
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int ar_i = 0; ar_i < n; ar_i++){
			ar[ar_i] = in.nextInt();
		}
		int result = sockMerchant(n, ar);
		System.out.println(result);
	}
}
