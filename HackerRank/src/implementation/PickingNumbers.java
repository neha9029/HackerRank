package implementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PickingNumbers {
	static int pickingNumbers(int[] a) {

		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

		int i=0;
		for(int obj: a){

			if(map.containsKey(a[i])){

				int val = map.get(a[i]);
				val+=1;
				map.put(a[i], val);
			}else
				map.put(a[i], 1);

			i++;
		}

		ArrayList<Integer> list = new ArrayList<Integer>();
		for(Map.Entry m: map.entrySet()){  

			int key = (Integer)m.getKey();
			int val = (Integer)m.getValue();

			//System.out.println(key+"=="+val);
			list.add(key);

		}  
		Collections.sort(list);
		//System.out.println(list);


		int maxKey = (Integer)(map.keySet().toArray()[0]);
		int maxVal = (Integer)map.values().toArray()[0];
		for(Map.Entry m: map.entrySet()){  

			int key = (Integer)m.getKey();
			int val = (Integer)m.getValue();

			if(val > maxVal){

				maxVal = val;
				maxKey = key;
			}


			//System.out.println(key+" "+val);  
		}  

		int max = 0;
		int firstNum = list.get(0);
		for(int k=1; k<list.size(); k++){

			if(Math.abs(firstNum - list.get(k)) == 1){

				int add = map.get(firstNum) + map.get(list.get(k));
				if(add > max)
					max = add;
			}

			firstNum = list.get(k);

		}



		if(maxVal> max)
			return maxVal;
		else
			return max;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int a_i = 0; a_i < n; a_i++){
			a[a_i] = in.nextInt();
		}
		int result = pickingNumbers(a);
		System.out.println(result);
		in.close();
	}
}
