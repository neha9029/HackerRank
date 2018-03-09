package algorithm.string;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class TwoStrings {
    static String twoStrings(String s1, String s2){
        
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        char alp[] = alphabets.toCharArray();

        
        boolean isSubstring = false;
        for(int i = 0; i<alp.length;i++){
                if(s1.indexOf(alp[i]) != -1  && s2.indexOf(alp[i]) != -1){
                    isSubstring = true;
                    break;
                }
            
        }
        
        if(isSubstring == true){
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s1 = in.next();
            String s2 = in.next();
            String result = twoStrings(s1, s2);
            System.out.println(result);
        }
    }
}
