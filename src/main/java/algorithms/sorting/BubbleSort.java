package algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {


    // Bubble sort on arrays
    // Time complexity = o(n^2)
    // Space complexity = o(1)
    // Compare the adjacent elements and swap the elements if the element on right is smaller than element on left
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        int temp;

        for(int i = 0; i < n-1; i++){

            for(int j = 1; j < arr.length-i; j++){
                // compare and swap if the previous is smaller than current
                if(arr[j-1] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
