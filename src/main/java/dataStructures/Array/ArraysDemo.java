package dataStructures.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo {

    public static void main(String[] args){
        // syntax
        // dataType[] nameOfArray = new dataType[size];

//        int[] rollNos = new int[10];
//
//        int[] arr; // declaration
//        arr = new int[5]; /// initialisation
//
//        // taking input using for loop
//        Scanner sc = new Scanner(System.in);
//        for(int i = 0; i< arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        // printing array element using for loop
//
//        for(int j=0; j<arr.length; j++){
//            System.out.print(arr[j] +" | ");
//        }
//
//        // printing using for each loop in java
//        for(int k: arr){
//            System.out.print(k + " / ");
//        }
//
//        // Using toString() method
//        System.out.println(Arrays.toString(arr));
        int[] arr = {0,1,1,0,1};
//        flipArrayhorizontally(arr);
        invertArray(arr);
    }

    /*
    i/p -- [1,0,1,1,0]
    o/p -- [0,1,1,0,1]
     */

    public static void flipArrayhorizontally(int[] arr){

        int p1 = 0;
        int p2 = arr.length-1;

        while(p1<p2){
            if(arr[p1] == arr[p2]){
                p1++;
                p2--;
            }
            else{
                int temp = arr[p1];
                arr[p1] = arr[p2];
                arr[p2] = temp;
                p1++;
                p2--;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    /*
    i/p > [1,0,1,1,0]
    i/p > [0,1,1,0,1]
    o/p > [1,0,0,1,0]
     */

    public static void invertArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                arr[i] =1;
            }
            else{
                arr[i]=0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public void flipAndInvertArray(int[] arr){

    }


}
