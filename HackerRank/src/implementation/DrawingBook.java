package implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DrawingBook {
    static int solve(int n, int p){
        if(p == n || p == 1){
            return 0;
        }
        int front = p / 2; 
         
     
        int back = (n - p) / 2;
        if((n - p) == 1){
            return 1;
        }
        if(front <= back){
            return front;
        }
        else{
            return back;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
