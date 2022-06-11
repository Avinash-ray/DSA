// 1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
// 2. Take as input n and k.
// 3. Print the rotated number.
// 4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
//    n = 12340056
//    k = 3
//    r = 05612340

// Constraints
// 1 <= n < 10^9
// -10^9 < k < 10^9

// Format
// Input
// "n" where n is any integer.
// "K" where k is any integer.

// Output
// "r", the rotated number

// Example
// Sample Input

// 562984
// 2

// Sample Output
// 845629

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // Write your code here
    Scanner scn= new Scanner(System.in);
    int num= scn.nextInt();
    int k= scn.nextInt();
    int n= num;

    int count= 0;
    while(n != 0){
      n= n/10;
      count++;
    }

    // actual rotations
    k= k % count;
    
    if(k<0){     // -ve rotation
      k= k+count;
    }

    int tmp1= (int)Math.pow(10,k);
    int p1= num / tmp1;
    int p2= num % tmp1;

    int tmp2= (int)Math.pow(10,count-k);
    int ans= (p2*tmp2)+ p1;
    System.out.println(ans);

  }
}