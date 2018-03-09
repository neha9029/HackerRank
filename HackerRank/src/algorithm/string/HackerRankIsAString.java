package algorithm.string;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class HackerRankIsAString {

    static String hackerrankInString(String s) {
        // Complete this function
        String word = "hackerrank";
        char str[] = s.toCharArray();
        char wordStr[] = word.toCharArray();
        int i = 0,j = 0,k=0,index = 0;
        int count = 0;
             while(j < s.length()){
                if(k < s.length()){
                    if(i < word.length()){
                        char ch = word.charAt(i);

                         if((s.substring(k)).indexOf(ch) != -1){ 
                             
                                 index = (s.substring(k)).indexOf(ch);
                                count++;
                             }
                             else{
                                 return "NO";
                             }
                       
                             i++;

                         }
                         k = k+index+1;
                    } 
                  j++;
             }
        if(count < word.length()){
            return "NO";
        }
        else{
              return "YES";

        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = hackerrankInString(s);
            System.out.println(result);
        }
        in.close();
    }
}
