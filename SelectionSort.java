package array;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Array size");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int counter=0;counter<size;counter++){
            arr[counter]=sc.nextInt();
        }
        int lower,index=0;

        for (int counter=0;counter<size-1;counter++){
            lower=arr[counter];
            boolean var=false;
            for(int j=counter+1;j<size;j++){
                if(lower>arr[j]){
                    lower=arr[j];
                    index=j;
                    var=true;
                }

            }
            //System.out.println(lower+"  ");
            if(var==true) {
                int temp = arr[counter];
                arr[counter] = lower;
                arr[index] = temp;
            }
            else
                break;
        }
        for (int element:arr
             ) {
            System.out.println(element+" ");

        }
    }
}
