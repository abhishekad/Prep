package algorithms.sorting;

import java.util.Arrays;

public class InsertionSort {

    // Insertion sort on arrays
    // Time complexity - O(n^2)
    // space complexity - O(n)
    // Sort the array partially and check if the current element is smaller than elements present on the left

    public static void insertionSort(int arr[]){
        for(int i=0; i <= arr.length-2; i++){
            for(int j=i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
