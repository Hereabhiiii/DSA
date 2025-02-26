package Arrayss;

import java.util.Arrays;
public class Searchin2Darray {
    public static void main(String[] args) {
        int[][]arr={{2,4,6,33,5},{0,44,223,543,789,90},
                {35,66,56,6,4,5}};
        int target=33;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));

    }

    static int[]search(int[][]arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1} ;
    }
}
