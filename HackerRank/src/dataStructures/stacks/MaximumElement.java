package dataStructures.stacks;

import java.io.*;
import java.util.*;


public class MaximumElement {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> maxStack = new Stack<Integer>();
        
        Scanner input = new Scanner(System.in);
        
        while(input.hasNext()){

            int queryNo = input.nextInt();
            int max = Integer.MIN_VALUE;

            if(queryNo == 1){
                 int stackElement = input.nextInt();
                 if(stack.isEmpty()) {
                    maxStack.push(stackElement);
                    stack.push(stackElement);
                 }
                else{
                    stack.push(stackElement);
                    max = Math.max(stack.peek(),maxStack.peek());
                    maxStack.push(max);

                }
            }
            if(queryNo == 2){
                stack.pop();
                maxStack.pop(); 
            }
            if(queryNo == 3){
                 
                System.out.println(maxStack.peek());
            }

        }
    }
}
