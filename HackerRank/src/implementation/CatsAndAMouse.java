package implementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CatsAndAMouse {
    static String catAndMouse(int x, int y, int z) {
        
        
        String catA = "Cat A";
        String catB = "Cat B";
        String mouseC = "Mouse C";

            
        
        if((Math.abs(x-z))>(Math.abs(y-z))){
            //System.out.println(catA);
            return catB;
        }
        if((Math.abs(x-z))<(Math.abs(y-z))){
           // System.out.println(catB);
            return catA;
            
        }
        if((Math.abs(x-z))==(Math.abs(y-z))){
            //System.out.println(mouseC);
            return mouseC;
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            String result = catAndMouse(x, y, z);
        
            System.out.println(result);


        }
        in.close();
    }
}
