// 1. You are required to display the prime factorisation of a number.
// 2. Take as input a number n.
// 3. Print all its prime factors from smallest to largest.

// Constraints
// 2 <= n < 10 ^ 9

// Example
// Sample Input
// 1440

// Sample Output
// 2 2 2 2 2 3 3 5

import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here 
  Scanner scn= new Scanner(System.in);
  int n= scn.nextInt();
  for(int fac=2; fac*fac <= n; fac++){
    while(n%fac==0){
      n= n/fac;
      System.out.print(fac+" ");
    }
  }
    if(n!=1){
      System.out.println(n);
    }
}
}