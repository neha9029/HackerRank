package algorithm.string;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class FunnyString {
    static String funnyString(String s){
        // Complete this function
        char str[] = s.toCharArray();
        int sum = 0;
        int revSum = 0;
        int j = str.length-1;
        int minus = 0;
        for(int i = 0; i<str.length-1;i++){
          
            int plus = (int)str[i] - (int)str[i+1];
             if(j>=1){
                
                 minus = (int)str[j] - (int)str[j-1];
                 j--;
            }
            
            if(Math.abs(plus) != Math.abs(minus)){
                return "Not Funny";
            }
            
        }
        
    return "Funny";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
    }
}
