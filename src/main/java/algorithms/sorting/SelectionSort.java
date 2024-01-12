package algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {

    // Selection sort on arrays
    // Time complexity = O(n^2)
    // Space complexity = O(n)
    // In selection sort we select an element and we move that element to its proper index
    // (e.g select max element and move it to the end of the array or min element move it to beginning of the array)

    public static void selectionSort(int[] arr){

        for(int i= 0; i< arr.length; i++){
            int last = arr.length-i-1;
            // find the index of the maximum element in the array and
            int maxIndex = findMax(arr, 0, last);
            // swap it with the element at the last index ( not necessarily last but according to the position)
            swap(arr, maxIndex, last);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int findMax(int[] arr, int start, int last){
        int max = start;
        for(int i =start; i<=last; i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
