package SortingAlgorithms;

import java.util.Arrays;

public class Bubblesort {
    public static void amin(String[]args){
        int []arr={2,5,8,3,8,5,8,0,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void bubble(int[]arr){
        for(int i=0;i<arr.length;i++){
            boolean swap=false;
            for(int j=1;j<arr.length-1;j++){
                if(arr[j]<arr[j-1]){
                   int temp=arr[j];
                   arr[j]=arr[j-1];
                   arr[j-1]=temp;
                    swap=true;
                }
            }
         if(!swap)
             break;
        }
    }
}

