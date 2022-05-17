// 1. You are given a positive number n. 
// 2. You are required to print the counting from n to 1.
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

// Example
// Sample Input
// 5

// Sample Output
// 5
// 4
// 3
// 2
// 1

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
  }

}