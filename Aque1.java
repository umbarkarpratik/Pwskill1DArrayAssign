//write a program to print sum of all elements present on   
// even indices in the given array.
package Array1DAssign;
import java.util.Scanner;
public class Aque1 {
    public static void main(String []args){
        System.out.println("enter the no of elements");
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        System.out.println("enter the elements of an array");
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<=a;i=i+2){

             sum=arr[i]+sum;
        }
        System.out.println(sum);

    }
}
