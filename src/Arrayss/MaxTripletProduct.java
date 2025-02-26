package Arrayss;

import java.util.Arrays;

public class MaxTripletProduct {
    public static void main(String[] args) {
       int[]arr={-20,-40,4,1,8,9,0,-1,7,-10,40,20,30};
        System.out.println(maxTriplet(arr));
    }




    static int maxTriplet(int[]arr){
        int n=arr.length;
        Arrays.sort(arr);

        int product1=arr[n-1]*arr[n-2]*arr[n-3];
        int product2=arr[0]*arr[1]*arr[n-1];
        return Math.max(product1,product2);
    }
}
