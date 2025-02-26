package Arrayss;

import java.util.Arrays;

public class ThirdLargest {
    public static void main(String[] args) {
        int[]arr={8,4,7,4,66,2,-2,67};
        System.out.println(thirdLargest(arr));


    }


    static int thirdLargest(int[]arr){
        int n=arr.length;
        Arrays.sort(arr);
        return arr[n-3];
    }
}

