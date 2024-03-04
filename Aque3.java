package Array1DAssign;

import java.util.Scanner;
//WAP to calculate the maximum number of array
public class Aque3 {
    public static void main(String []args){
        System.out.println("enter the no of elements");
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        System.out.println("enter the elements of an array");
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int maxNo=0;
        for(int elem : arr) {
            if(elem>maxNo){
                maxNo=elem;
            }
        }
        System.out.println("Maximum No"+ maxNo);

       

    }
}
