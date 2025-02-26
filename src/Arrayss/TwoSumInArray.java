package Arrayss;

public class TwoSumInArray {
    public static void main(String[] args) {
        int[]nums={1,4,3,6,4,8,9,2,0,-1,-2};
        int target=4;
        int[] result= twoSum(nums,target);

        System.out.println(result);
    }


    static int[] twoSum(int[]arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}
