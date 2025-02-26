package Arrayss;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
       int[]arr={-4,5,2,0,1,44,66,55,48,99};
        System.out.println(secondLargest(arr));
    }


    static  int secondLargest(int[]arr)
    {
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=arr[n-1]){
                return arr[i];
            }
        }
        return -1;
    }
}
