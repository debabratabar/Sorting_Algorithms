package array;

import java.util.Scanner;

public class BubbleSort {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println();
        int  size=sc.nextInt();
        boolean b;
        int[] arr= new int[size];
        for (int counter=0;counter<size;counter++){
            arr[counter]=sc.nextInt();
        }
        for(int counter=0;counter<size-1;counter++){
            b=true;
            for(int j=0;j<size-1-counter;j++){

                if (arr[j]>arr[j+1]){
                    b=false;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }


           if(b==true){

                break;
            }


            }
        for (int element :arr)
        {
            System.out.print(element+" ");
        }
    }
}
