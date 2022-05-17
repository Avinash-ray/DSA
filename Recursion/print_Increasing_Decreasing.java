// 1. You are given a positive number n. 
// 2. You are required to print the counting from n to 1 and back to n again.
// 3. You are required to not use any loops. 

// Constraints
// 1 <= n <= 1000

// Format
// Input
// A number n

// Output
// n
// n - 1
// n - 2
// ..
// 1
// 1
// 2
// 3
// ..
// n

// Example
// Sample Input
// 3

// Sample Output
// 3
// 2
// 1
// 1
// 2
// 3

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

  System.out.println(n);
  printincreasing(n-1);
  System.out.println(n);
  }

}