package Array1DAssign;

import java.util.Scanner;
//given an array find the peak element in an array .A peak element is an element in which is greater than left and right side of elements.
public class Aque5 {
     public static void main(String []args){
        System.out.println("enter the no of elements");
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        System.out.println("enter the elements of an array");
        int arr[]=new int[a]; 
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        
        int previousNo=arr[0];
        int ans[]=new int[10];
        for(int i=1;i<a-1;i++) {
            if(previousNo<arr[i] && arr[i+1]<arr[i]){
                    int e=0;
                    ans[e]=arr[i];
                    System.out.println("peak element :"+ans[e]);
                    e++;
                   
            }
            previousNo= arr[i];
        }
       

       

    }
}
