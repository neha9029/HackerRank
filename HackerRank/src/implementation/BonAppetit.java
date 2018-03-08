package implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BonAppetit {
    static int bonAppetit(int n, int k, int b, int[] ar) {
        int sum = 0;
        int halfSum = 0;
        int annasCharge = 0;
        int brianReturns = 0;
        int result = 0;
        String results = "Bon Appetit";
        for(int i = 0; i< ar.length; i++){
            sum += ar[i];
        }
        halfSum = sum / 2;
          for(int i = 0; i< ar.length; i++){

            if(i == k){
                annasCharge = halfSum - (ar[i]/2);
               // System.out.println(annasCharge);
            }
            if(b != annasCharge){
                brianReturns = b - annasCharge;
                result = brianReturns;
            }
            if(b == annasCharge){
               // return results;
            }
            
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        int result = bonAppetit(n, k, b, ar);
        System.out.println(result);
    }
}
