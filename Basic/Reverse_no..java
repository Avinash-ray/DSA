// 1. You've to display the digits of a number in reverse.
// 2. Take as input "n", the number for which digits have to be display in reverse.
// 3. Print the digits of the number line-wise, but in reverse order.

// Constraints
// 1 <= n < 10^9

// Format
// Input
// "n" where n is any integer

// Example
// Sample Input

// 65784383

// Sample Output
// 3
// 8
// 3
// 4
// 8
// 7
// 5
// 6

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // Write your code here
    Scanner scn= new Scanner(System.in);
    int n= scn.nextInt();

    while(n!= 0){
    int digit= n % 10;
    System.out.println(digit);
    n= n / 10;
    }
 }
}