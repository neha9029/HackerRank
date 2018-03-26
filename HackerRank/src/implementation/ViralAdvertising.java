package implementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class ViralAdvertising {

    static int viralAdvertising(int n) {
        
        int i = 1;
        int people = 5;
        int sum = 0;
        while(i <= n){
          sum+= people / 2;
            people = (people/2) * 3;
            i++;
        }
        
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = viralAdvertising(n);
        System.out.println(result);
        in.close();
    }
}
