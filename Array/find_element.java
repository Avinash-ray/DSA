// 1.You are given a number n, representing the size of array a.
// 2.You are given n distinct numbers, representing elements of array a.
// 3. You are given another number d.
// 4. You are required to check if d number exists in the array a and at what index (0 based). If found print the index, otherwise print -1.

// Constraints
// 1 <= n <= 10^7
// -10^9 <= n1, n2 
// .. n elements <= 10^9
// -10^9 <= d <= 10^9

// Example
// Sample Input
// 6
// 15
// 30
// 40
// 4
// 11
// 9
// 40

// Sample Output
// 2

import java.util.Scanner;
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
    int d= scn.nextInt();
    System.out.println(find(a,d));
 }

 public static int find(int a[], int d){
     for(int indx= 0; indx< a.length; indx++){
         if(a[indx]== d){
             return indx;
         }
     }
     return -1;
 }

}