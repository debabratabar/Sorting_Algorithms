package array;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int[] array=new int[N];
        for (int i=0;i<N;i++){
            array[i]=sc.nextInt();
        }
        int check_element=0;
        for(int i=1;i<N;i++){
            check_element=array[i];
            for (int j=0;j<=i;j++){
                if(check_element < array[j]){
                    int temp =array[j];
                    array[j]=array[i];
                    array[i]=temp;

                }
            }
        }
        Arrays.sort(array);
        for (int element :array
             ) {
            System.out.print(element+" ");

        }
    }
}
