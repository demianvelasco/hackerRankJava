/*

In this problem you will test your knowledge of Java loops. Given three integers aa, bb, and nn, output the following series:

a+20b,a+20b+21b,......,a+20b+21b+...+2n−1ba+20b,a+20b+21b,......,a+20b+21b+...+2n−1b
Input Format

The first line will contain the number of testcases t. Each of the next tt lines will have three integers, aa, bb, and nn.

Constraints:

0≤t≤5000≤t≤500
0≤a,b≤500≤a,b≤50
1≤n≤151≤n≤15
Output Format

Print the answer to each test case in separate lines.

Sample Input

2
0 2 10
5 3 5
Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
Explanation

In the first case:

1st term=0+1*2=2
2nd term=0+1*2+2*2=6
3rd term=0+1*2+2*2+4*2=14
and so on.


*/

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
