package Arrayss;

public class PushZerosToEnd {
    public static void main(String[] args) {
        int[]arr={3,5,6,3,4,5,7,65,5,6,0,1,0,2,5,0,6,0};
         pushZerosToEnd(arr);
         for(int num :arr)
        System.out.println(num+" ");
    }


    static void pushZerosToEnd(int[]arr){
        int n =arr.length;
        int[]temp=new int[n];
        int j=0;

        for(int i=0;i<n;i++) {
            if (arr[i] != 0)
                temp[j++] = arr[i];


        }
            while(j<n)

                temp[j++]=0;

            for(int i = 0; i<n; i++){
                arr[i]=temp[i];

            }
        }

    }
