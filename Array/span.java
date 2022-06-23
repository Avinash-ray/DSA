// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are required to find the span of input. Span is defined as difference of maximum value and minimum value.

// Constraints
// 1 <= n <= 10^4
// 0 <= n1, n2
//  .. n elements <= 10 ^9

// Output
// A number representing max - min

// Example
// Sample Input
// 6
// 15
// 30
// 40
// 4
// 11
// 9

// Sample Output
// 36

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn= new Scanner(System.in);
    int n= scn.nextInt();
    int a[]= new int[n];
    for(int indx= 0; indx< n; indx++){
        a[indx]= scn.nextInt();
    }
    System.out.println(span(a));
 }
 public static int span(int a[]){
     int max= a[0];
     int min= a[0];
     for(int indx=1; indx< a.length; indx++){
         if(max< a[indx]){
             max= a[indx];
         }
         if(min> a[indx]){
             min= a[indx];
         }        
     }
     return max-min;
 }

}