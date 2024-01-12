package questions;


public class ArrayQuestions {

    public static void findSpanOfArray(int[] arr){
        int max = 0;
        int min = Integer.MAX_VALUE;

        //  Find max
        for(int i= 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        for(int j=0; j<arr.length;j++){
            if(arr[j]<min){
                min = arr[j];
            }
        }
        System.out.println("Span of the array: " + (max-min));
    }

    //Find element in array <print index of that element>
    public static void findElementInArray(int[] arr, int a){

        for(int i=0; i<arr.length; i++){
            if(arr[i] == a){
                System.out.println(i);
            }
        }

    }

    // Bar chart
    public static void printBarChartOfArray(int[] arr){
        int max = 0;
        for(int i= 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        for(int floor = max; floor>=1; floor--){
            for(int j=0; j< arr.length; j++){
                if(arr[j]>=floor){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    // sum of two arrays
    public static void sumOfTwoArrays(int[] arr1, int[] arr2) {
        int length =  Math.max(arr1.length, arr2.length);
        int[] sum = new int[length];
        int arr1len = arr1.length;
        int arr2len = arr2.length;

        for (int i = 0; i < length; i++) {
            if (arr1len > i) {
                sum[i] += arr1[i];
            }
            if (arr2len > i) {
                sum[i] += arr2[i];
            }
        }

        for (int c : sum) {
            System.out.println(c);
        }


    }

}
