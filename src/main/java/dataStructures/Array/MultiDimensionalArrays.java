package dataStructures.Array;


// 2-D Arrays

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArrays {
    public static void main(String[] args) {

        // Declaration syntax

        //int[][] array1 = new int[3][];

        // Declaration with values

        int[][] array2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
//        diagonalSum(array2);
        rotate2DArrayBy90Degrees(array2);
        /*

        // different column size is possible refer ex below

        int[][] array3 = {
                {1,2,3},
                {1,2},
                {1,2,3,4}
        };

*/
        // Taking 2D array as an input form the user

//        int[][] arrays4 = new int[3][2];
//        Scanner sc = new Scanner(System.in);
//
//        for (int row = 0; row < arrays4.length; row++) {
//            for (int col = 0; col < arrays4[row].length; col++) {
//                arrays4[row][col] = sc.nextInt();
//            }
//        }

        // Printing 2D arrays using for loops
//        for(int row = 0; row < arrays4.length; row++){
//            for(int col = 0; col < arrays4[row].length; col++){
//                System.out.print(arrays4[row][col] + " ");
//            }
//            System.out.println();
//        }

        // printing 2D array using toString() method
//        for(int row = 0; row < arrays4.length; row++){
//                System.out.println(Arrays.toString(arrays4[row]));
//            }

        // Printing 2D array using for each loop
        // Each element in the 2D Arrays is of array type
//        for (int[] it : arrays4) {
//            System.out.println(Arrays.toString(it));
//        }
    }

    public static void diagonalSum(int[][] mat) {
        int res = 0;

            for(int row=0; row<mat.length; row++){
                for(int col=0; col<mat[row].length; col++){
                    if(col == row){
                        res = res + mat[row][col];
                        continue;
                    }

                    else if(col == (mat[row].length-1) - row){
                        res = res + mat[row][col];
                    }
                }

            }
        System.out.println(res);
    }

    // Rotate 2D array by 90 degrees
    // input [[1,2,3],[4,5,6],[7,8,9]]
    //Output: [[7,4,1],[8,5,2],[9,6,3]]
    public static void rotate2DArrayBy90Degrees(int[][] arr){

        int[][] result = new int[arr.length][arr.length];

//        int p1 = 0;
//        int p2 = 0;

//        for(int row =0 ; row< arr.length; row++){
//            for(int col=0; col<arr[row].length; col++){
//                result[col][(arr[row].length-1)-row] = arr[row][col];
//            }
//        }
//        for (int[] it : result) {
//            System.out.println(Arrays.toString(it));
//        }

            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[row].length; col++) { //col=2
                    int temp = arr[row][col]; // temp = arr[0][2]  // temp =
                    arr[row][col] = arr[col][(arr[row].length - 1) - row];
                    arr[col][(arr[row].length - 1) - row] = temp;
                }
        }
        for (int[] it : arr) {
            System.out.println(Arrays.toString(it));
        }

//                 {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}

    }
}
