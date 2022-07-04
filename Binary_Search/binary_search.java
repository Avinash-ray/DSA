import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // Write your code here

    Scanner scn= new Scanner(System.in);
   int n= scn.nextInt();
   int[] a= new int[n];
   for(int i=0; i< n; i++){
     a[i]= scn.nextInt(); 
   }
   int k= scn.nextInt();
   int element= binarysearch(a,k);
   System.out.print(element);
  }
  public static int binarysearch(int[] a, int k){
    int start=0, end= a.length-1;
    while(start <= end){
      int mid= (start + end)/2;
      if(a[mid]< k){
        start= mid + 1;
      }
      else if(a[mid]> k){
        end= mid - 1;
      }
      else{
        return mid;
      }
    }
    return -1;
  }
}