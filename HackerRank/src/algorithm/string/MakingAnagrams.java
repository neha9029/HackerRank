package algorithm.string;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MakingAnagrams {
	static int makingAnagrams(String s1, String s2){
		char str1[] = s1.toCharArray();
		char str2[] = s2.toCharArray();

		HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
		for(int i = 0; i<str1.length;i++){
			if(!map1.containsKey(str1[i])){
				map1.put(str1[i],1);
			}else{
				int count = map1.get(str1[i]);
				count++;
				map1.put(str1[i],count);
			}
		}

		HashMap<Character,Integer> map2 = new HashMap<Character,Integer>();
		for(int i = 0; i<str2.length;i++){
			if(!map2.containsKey(str2[i])){
				map2.put(str2[i],1);
			}else{
				int count = map2.get(str2[i]);
				count++;
				map2.put(str2[i],count);
			}
		}

		int countCharacters = 0;
		for(Map.Entry<Character,Integer> entry: map1.entrySet()){
			Character key = entry.getKey();

			int value = (int)entry.getValue();
			if(map2.get(key) != null){
				if(map2.containsKey(key)){
					int value2 = map2.get(key);
					int min = Math.min(value,value2);
					countCharacters+= min;


				}
			}
		}


		int total = (s1.length()+s2.length()) - countCharacters*2;

		return total;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		String s2 = in.next();
		int result = makingAnagrams(s1, s2);
		System.out.println(result);
	}
}
