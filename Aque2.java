package Array1DAssign;
//wAP to  traverse over the element and print even number using for each loop.
import java.util.Scanner;

public class Aque2 {
     public static void main(String []args){
        System.out.println("enter the no of elements");
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        System.out.println("enter the elements of an array");
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int elem : arr) {
            if(elem%2==0){
                System.out.println("even" +elem);
            }
        }
       

    }
}
