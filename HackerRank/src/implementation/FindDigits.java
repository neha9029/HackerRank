package implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindDigits {

    static int findDigits(int n) {
     
        int same = n;
        int count = 0;
        while(n > 0){
            int digit = n%10;
            n/=10;
            if(digit != 0){
            if(same % digit == 0){
                count++;
            }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int result = findDigits(n);
            System.out.println(result);
        }
        in.close();
    }
}
