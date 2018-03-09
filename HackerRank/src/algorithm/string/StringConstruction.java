package algorithm.string;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringConstruction {
    static int stringConstruction(String s) {
        
        char str[] = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for(int i = 0; i<str.length;i++){
           String newStr = sb.toString();

            if(newStr.indexOf(str[i]) == -1){
                sb.append(str[i]);
                count++;
            }

        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = stringConstruction(s);
            System.out.println(result);
        }
        in.close();
    }
}
