package questions;

import java.util.HashSet;
import java.util.Set;

public class HashSetQuestions {
    // count the total number of distinct elements in an array
    public static void countNumberOfDistinctElements(int[] arr){
        Set<Integer> set = new HashSet<>();
        // hashset contains distinct elements
        for(int i : arr){
            set.add(i);
        }

        System.out.println("No of distinct elements: "+ set.size());
    }

    // union of two arrays - return total count

    public static void unionOfTwoArrays(int[] arr1, int[] arr2){
        Set<Integer> set = new HashSet<>();
        for(int i : arr1){
            set.add(i);
        }

        for(int j : arr2){
            set.add(j);
        }
        System.out.println("No of distinct elements in union of two arrays: "+ set.size());
    }
}
