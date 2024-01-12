package algorithms;


// Given an array Arr[] of N integers.
// Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.
public class KadaneAlgorithm {


    public static void kadaneAlgo() {

        int[] arr = {-1, -2, -3, -4};

        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];

        for(int i=1; i<arr.length; i++){

            if(arr[i] > maxEndingHere + arr[i]){
                maxEndingHere = arr[i];
            }
            else{
                maxEndingHere = maxEndingHere + arr[i];
            }

            if(maxSoFar < maxEndingHere){
                maxSoFar = maxEndingHere;
            }
        }
        System.out.println(maxSoFar);


    }
}
