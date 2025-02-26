package Arrayss;

public class ArrayMinValue {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 3, 6, 44, 7, 5, 70};
        System.out.println(Min(arr));
    }

    static int Min(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}