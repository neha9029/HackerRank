package implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kangaroo {


    static String kangaroo(int x1, int v1, int x2, int v2) {
        String ans = "";
    
        for(int i = 1 ; i < 10000; i++){
            if((( v1 * i ) + x1) == ((v2 * i ) + x2)){

                ans = "YES";
                break;
            }
            else{
                ans = "NO";
            }
        }
        return ans;
        
       
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
