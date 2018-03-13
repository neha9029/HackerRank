package algorithm.string;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class GameOfThronesI {
    static String gameOfThrones(String s){
        
        char str[] = s.toCharArray();
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i = 0; i<str.length;i++){
            if(!map.containsKey(str[i])){
                map.put(str[i],1);
            }else{
                int count = map.get(str[i]);
                count++;
                map.put(str[i],count);
            }
        }
               
       Object array[] = map.values().toArray();
               Arrays.sort(array);           
               for(int i = 1; i<array.length;i++){
                   if((int) array[i] % 2 != 0){
                       return "NO";
                   }
               }
               
               
               return "YES";
               
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = gameOfThrones(s);
        System.out.println(result);
    }
}
