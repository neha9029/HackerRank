package algorithm.string;

 import java.util.*;


public class TwoCharacters {

	static int twoCharaters(String s) {

		if(s.length() < 2){
			return 0;
		}
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		HashSet<Character> set = new HashSet<Character>();
		char str[] = s.toCharArray();
		for(int i = 0; i<str.length;i++){
			if(alphabets.indexOf(str[i]) != -1){
				set.add(str[i]);
			}
		}
		if(set.size() == 1){
			return 0;
		}
		StringBuilder unique = new StringBuilder();
		Iterator<Character> itr = set.iterator();
		while(itr.hasNext()){
			unique.append(itr.next());
		}

		String uniqueStr = unique.toString();
		char uniqueArray[] = uniqueStr.toCharArray();

		ArrayList <Integer> list = new ArrayList<Integer>();
		for(int i = 0; i<uniqueArray.length;i++){
			for(int j = i+1; j<uniqueArray.length;j++){

				char first = uniqueArray[i];
				char second = uniqueArray[j];
				//System.out.println(first+"--"+second);
				int formed = getNewString(first,second,s);
				list.add(formed);

			}
		}

		int max = Collections.max(list);
		return max;
	}


	public static int getNewString(char a,char b,String c){
		char array[] = c.toCharArray();
		StringBuilder newString = new StringBuilder();
		for(int i = 0;i<array.length;i++){
			if(array[i] == a || array[i] == b){

				newString.append(array[i]);
			}
		}
		// System.out.println(newString.toString());
		String formed = newString.toString();
		char check[] = formed.toCharArray();
		boolean isAlternate = true;
		for(int i = 0; i<check.length-1;i++){

			if(check[i] == check[i+1]){
				isAlternate = false;
			}
		}

		if(isAlternate == true){
			return formed.length();
		}
		else{
			return 0;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int l = in.nextInt();
		String s = in.next();
		int result = twoCharaters(s);
		System.out.println(result);
		in.close();
	}
}
