package algorithm.string;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockAndTheValidString {

    static String isValid(String s){
        char str[] = s.toCharArray();
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        for(int i = 0; i<str.length;i++){
            if(!map.containsKey(str[i])){
                map.put(str[i],1);
            }
            else{
                int count = map.get(str[i]);
                count++;
                map.put(str[i],count);
            }
        }
        
        Object array[] = map.values().toArray();
        Arrays.sort(array);
        int firstElement = (int)array[0];
        int lastElement = (int)array[array.length-1];
    
      
        long count = 0;
        int diff = 0;
        for(int i = 0; i<array.length-1;i++){

            if((int)array[i] != (int)array[i+1]){
            diff = i;
              count++;
                break;
            }

        }
  
        if(count == 0){
            return "YES";
        }
        if(count == 1 && (diff == 0) && ((int)array[0] == 1)){
            return "YES";
        }

        if(count == 1 && (diff == (array.length-2)) && (lastElement - firstElement == 1)){
            return "YES";
        }
        return "NO";
        
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = isValid(s);
        System.out.println(result);
    }
}