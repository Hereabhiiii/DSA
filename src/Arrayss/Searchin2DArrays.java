package Arrayss;

import java.util.Arrays;

public class Searchin2DArrays {
    public static void main(String[] args) {
        System.out.println("search in 2D arrays:");

        int[][]arr={
                {10,20,30,40},
                {40,50,60,70}
        };
        int target=50;
        int[] ans=Search2D(arr,target);
        System.out.println(Arrays.toString(ans));


    }

    static int[]Search2D(int[][]arr,int target) {

        for(int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};

                }
            }

        }
        return new int[]{-1, -1};
    }
}
