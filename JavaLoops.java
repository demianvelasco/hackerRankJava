import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=0, b=0, n=0;
        int t = sc.nextInt(); // Test cases (lines)
        if (t >= 0 && t <=500) {
            for (int i=0; i<t; i++) {       // Test cases 
             for (int j=0; j<3; j++) {   // Gets the value from test cases
                a = sc.nextInt();
                b = sc.nextInt();
                n = sc.nextInt();
                if (a >=0 && a <= 50 && b >=0 && b <= 50 && n >=0 && n <= 15) {
                    Series(a,b,n);
                    System.out.print("\n");
                }
                else {
                    System.out.print("Out of constrains");
                 }          
             
            }
            }
        }
        
        else {
            System.out.print("Out of constrains");
        }
    }
    
    
    public static void Series (int a, int b, int n) {
        int total = 0;
        int temp = 0;
        double indexDouble = 0;
        for (int i = 0; i<n; i++) {
            indexDouble = (double) i;
            temp = a;
            total = total + (int)(Math.pow(2.0,indexDouble)) * b;
            temp = total;
            temp += a;
            System.out.print(temp + " ");
        }
        
        
    }
}
