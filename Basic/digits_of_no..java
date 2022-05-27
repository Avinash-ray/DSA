// 1. You've to display the digits of a number.
// 2. Take as input "n", the number for which digits have to be displayed.
// 3. Print the digits of the number line-wise.

// Constraints
// 1 <= n < 10^9

// Example
// Sample Input

// 65784383

// Sample Output
// 6
// 5
// 7
// 8
// 4
// 3
// 8
// 3

import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here
      Scanner scn= new Scanner(System.in);
    int n= scn.nextInt();

    int CopyofN= n;
    int tmp= 1;
    while(CopyofN > 9){
      CopyofN= CopyofN / 10;
      tmp= tmp * 10;
    }

    while(tmp!= 0){
      int digit= n/tmp;
      System.out.println(digit);
      n = n % tmp;

      tmp= tmp/10;
    }  
     }
    }