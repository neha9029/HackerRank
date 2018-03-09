package implementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TheHurdleRace {
	   static int hurdleRace(int k, int[] height) {
	        
	       Arrays.sort(height);
	        int max = height[height.length-1];
	        int bev = 0;
	        for(int i = 0; i< height.length; i++){
	            if(k > max){
	                bev = 0;
	            }
	            if( k < max){
	                bev = max - k;
	            }
	        }
	        return bev;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        int[] height = new int[n];
	        for(int height_i = 0; height_i < n; height_i++){
	            height[height_i] = in.nextInt();
	        }
	        int result = hurdleRace(k, height);
	        System.out.println(result);
	        in.close();
	    }
}
