// 1. You are given a positive number n. 
// 2. You are required to print the counting from 1 to n.
// 3. You are required to not use any loops. 

// Constraints
// 1 <= n <= 1000

// Input
// A number n

// Output
// 1
// 2
// 3
// ..
// n

// Example
// Sample Input
// 5

// Sample Output
// 1
// 2
// 3
// 4
// 5

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // Write your code here
    Scanner scn= new Scanner(System.in);
    int n= scn.nextInt();
    printincreasing(n);

  }
  public static void printincreasing(int n){
    if(n==0){
      return;
    }

  printincreasing(n-1);
  System.out.println(n);
  }

}