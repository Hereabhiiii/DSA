package Arrayss;

public class ArrayElementsPrint {
    public void printArray(int [] arr) {
        int n = arr.length;
        for (int j : arr) {
            System.out.println(j + " ");

        }
        System.out.println();
    }
    public  void arrayDemo(){
        int[] myArray=new int[5];
        myArray[0]=5;
        myArray[1]=15;
        myArray[2]=25;
        myArray[3]=35;
        myArray[4]=45;
        printArray(myArray);
        System.out.println(myArray.length);
        System.out.println(myArray[myArray.length-1]);

    }
}
