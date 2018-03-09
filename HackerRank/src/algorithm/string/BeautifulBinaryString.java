package algorithm.string;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class BeautifulBinaryString {
    static int beautifulBinaryString(String b) {
        String s = "010";
        char ch[] = b.toCharArray();
        int count = 0;
        for(int i = 0; i<ch.length;i++){
            if(i < ch.length-2){
              if(b.substring(i,i+3).equals(s)){
       

                count++;
                i = i+2;

              }
              
                
            }


        }
       return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String b = in.next();
        int result = beautifulBinaryString(b);
        System.out.println(result);
        in.close();
    }
}
