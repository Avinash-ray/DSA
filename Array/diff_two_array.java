1. You are given a number n1, representing the size of array a1.
2. You are given n1 numbers, representing elements of array a1.
3. You are given a number n2, representing the size of array a2.
4. You are given n2 numbers, representing elements of array a2.
5. The two arrays represent digits of two numbers.
6. You are required to find the difference of two numbers represented by two arrays and print the arrays. a2 - a1

Assumption - number represented by a2 is greater.

Constraints
1 <= n1, n2 <= 100
0 <= a1[i], a2[i] < 10
number reresented by a1 is smaller than number represented by a2

Format
Input
A number n1
n1 number of elements line separated
A number n2
n2 number of elements line separated

Output
A number representing difference of two numbers (a2 - a1), represented by two arrays.

Example
Sample Input
3
2
6
7
4
1
0
0
0

Sample Output
7
3
3

import java.util.Scanner;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn= new Scanner(System.in);
    int n1= scn.nextInt();
    int a1[]= new int[n1];
    for(int indx=0; indx< n1; indx++){
        a1[indx]= scn.nextInt();
    } 
    int n2= scn.nextInt();
    int a2[]= new int[n2];
    for(int indx=0; indx< n2; indx++){
        a2[indx]= scn.nextInt();
    }
    int result[]= sub(a1,a2);
    int indx = 0;
    for( ; indx< result.length; ){
        if(result[indx] == 0){
            indx++;
        }
        else{
            break;
        }
    }

    for( ; indx< result.length; ){
        System.out.println(result[indx]);
        indx++;
    }

    
 }
    public static int[] sub(int a1[], int a2[]){
        int n1= a1.length;
        int n2= a2.length;
        int n3= Math.max(n1,n2);
        int res[]= new int[n3];

        int p1= n1-1;
        int p2= n2-1;
        int p3= n3-1;
        int b= 0;

        while(p1>=0 || p2>=0){
            int v1= p1>=0 ? a1[p1] : 0;
            int v2= p2>=0 ? a2[p2] : 0;

        
            if(v2+b >= v1){
                res[p3]= (v2+b)-v1;
                b=0;
            }

            else{
                res[p3]= ((v2+b)+10)-v1;
                b= -1;
            }

            p1--;
            p2--;
            p3--;
        }
        return res;
    }

}