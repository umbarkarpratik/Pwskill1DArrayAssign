package Array1DAssign;
//WAP to find out second largest element of array.
import java.util.Scanner;

public class Aque4 {
     public static void main(String []args){
        System.out.println("enter the no of elements");
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        System.out.println("enter the elements of an array");
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int maxNo=arr[0];
        int previousMax=0;
        for(int elem : arr) {
            if(elem>maxNo){
                 previousMax=maxNo;
                maxNo=elem;
            }
        }
        System.out.println("Maximum No"+ maxNo + "  Previous max: "+ previousMax);

       

    }
}
