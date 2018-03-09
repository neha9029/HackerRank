package algorithm.string;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Pangrams {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        str = str.replaceAll(" ","");
        String lower = str.toLowerCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char alpha[] = alphabet.toCharArray();
        boolean isPangram = true;
        for(int i = 0;i<alpha.length;i++){
            if(lower.indexOf(alpha[i]) == -1){
                isPangram = false;
            }
        }

        if(isPangram == false){
           System.out.println("not pangram");

        }
        else{
            System.out.println("pangram");
        }
    }
}
