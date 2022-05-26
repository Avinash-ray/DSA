// 1. You've to print first n fibonacci numbers.
// 2. Take as input "n", the count of fibonacci numbers to print.
// 3. Print first n fibonacci numbers.

// Constraints
// 1 <= n < 40

// Example
// Sample Input

// 10

// Sample Output
// 0
// 1
// 1
// 2
// 3
// 5
// 8
// 13
// 21
// 34

import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
  Scanner scn= new Scanner(System.in);
  int n= scn.nextInt();

    int count= 1;
    int a= 0;
    int b= 1;
    
    while(count <= n){
      int sum= a+b;
      System.out.println(a);
      a= b;
      b= sum;
      count++;
    }

  }
}