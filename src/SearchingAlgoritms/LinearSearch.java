package SearchingAlgoritms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] num = {33, 5, 6, 3, 7, 55, 8, 0};
        int key = 55;
        int ans = linearSearch(num, key);
        System.out.println(ans);
        System.out.println("the element "+num[ans]+" found at "+ans+" index");

    }


    static int linearSearch(int[] arr, int key) {
        if (arr.length == 0) {
            return -1;

        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == key) {
                return index;
            }
        }
        return -1;
    }
}