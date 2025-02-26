package Arrayss;

public class ArrayRangeSearch {
    public static void main(String[] args) {
        int[]arr={7,555,7,89,6,3,567,8,9,6,999};
        int target=8;
        int start ,end;
        System.out.println(linearSearch(arr,target,start=2,end=7));
    }
    static int linearSearch(int[]arr,int target,int start,int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;

    }
}