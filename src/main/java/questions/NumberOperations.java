package questions;

import java.util.*;

public class NumberOperations {

    // this Method swaps two numbers without needing 3rd variable
    public static void swapVariables(double var1, double var2){
        System.out.println("Before swapping var1:" + var1 + " var2:"+var2);
        var1 = var1 + var2;
        var2 = var1 - var2;
        var1 = var1 - var2;
        System.out.println("After swapping var1:" + var1 + " var2:"+var2);
    }

    // this Method reverse given int
    public static void reverseNumber(int number){
        System.out.println("Original:" +number);
        int reversedNumber = 0;
        while(number>0){
            reversedNumber = reversedNumber * 10 + (number % 10);
            number = number / 10;
        }
        System.out.println(" reversed: "+reversedNumber);
    }

    public static int getCeil(int[] nums, int x){
        int low = 0;
        int high = nums.length-1;
        int ceil = -1;
        int mid;
        while(low<=high){
            mid = (low+high)/2;
            if(x==nums[mid]){
                return nums[mid];
            }
            else if(x<nums[mid]){
                ceil = nums[mid];
                high = mid-1;

            }
            else{
                low = mid +1;
            }
        }
        return ceil;
    }


    public static int getFloor(int[] nums, int x){
        int low = 0;
        int high = nums.length-1;
        int floor = -1;
        int mid;

        while(low<=high){
            mid = (low + high)/2;
            if(x==nums[mid]){
                return nums[mid];
            }
            else if(x<nums[mid]){
                high = mid-1;
            }
            else {
                floor = nums[mid];
                low = mid +1;
            }
        }
        return floor;
    }

    // fibonacci series
    public static void fibonacciSeries(int n){

        // 0 1 1 2 3 5 8
        int n1 = 0;
        int n2 = 1;
        int sum = 0;
        System.out.println(n1 + ", " + n2);
        for (int i = 2; i <=n; i++){
            sum = n1 + n2; // 0 +1 = 1| sum = 1
            System.out.println(sum + ", ");
            n1 = n2;
            n2 = sum;
        }
    }

    public static void sumOfArrayElements(int[] array){
        int sum = 0;
        for(int i : array){
            sum = sum + i;
        }
        System.out.println("Sum :" + sum);
    }

    public static void evenOdd(int num){
        if( num % 2 == 0){
            System.out.println("EVEN :" + num);
        }
        else {
            System.out.println("ODD :" + num);
        }
    }

    public static void printDigitsOfNum(int num){
        // 7800, 1234
        int power = 0;
        int temp = num;
        while (num != 0){
            num = num/10;
            power++;
        }

        int div = (int)Math.pow(10, power-1);

        while(div !=0){
            int quotient  = temp / div ;
            System.out.println(quotient);
            temp = temp % div;
            div = div/10;

        }
    }

    public static void reverseANumber(int num){
        int reversedNum = 0;
        while(num>0){
            reversedNum = reversedNum * 10 + num % 10;
            num = num/10;
        }
        System.out.println(reversedNum);
    }

    // rotate a number by K from right
    public static void rotateNumberByKDigitsFromRight(int num, int k){
        int tem = num; int n=0;
        int div = (int)Math.pow(10, k);
        while(tem>0){
            tem = tem/10;
            n++;
        }
        int multi = (int)Math.pow(10, n-k);
        int addNums = num / div ;
        int rotNum = num % div;
        int rotatedNumberByKDigits =(rotNum*multi) + addNums;
        System.out.println(rotatedNumberByKDigits + " multifact: "+rotNum*multi);


//        System.out.println(num);


    }


    public static void getCost(List<Integer> cost, int money) {
        Map<Integer, Integer> nums = new HashMap<>();

        for(int i=0; i<cost.size(); i++){
            int requiredMoney = money - cost.get(i);
            if(nums.containsKey(requiredMoney)){
                if(nums.get(requiredMoney) < cost.get(i)){
                    System.out.println((nums.get(requiredMoney)+1) + " " +(cost.get(i)+1));
                }
            }
            nums.put(cost.get(i), i);

        }
        System.out.println(nums);
    }
//        for (int i = 0; i < cost.size(); i++) {
//            for (int j = i + 1; j < cost.size(); j++) {
//                if (money == cost.get(i) + cost.get(j)) {
//                    if (i < j) {
//                        System.out.println(i+1 + " " + j+1);
//                    } else {
//                        System.out.println(j+1 + " " + i+1);
//                    }
//                }
//            }
//        }
//    }

    public static void findTheMaxDifferenceInArray(int[] arr){
        // [23,67,1,6,97,21,7]
        // brute force
//        int maxDiff = 0;
//
//        for(int i=0; i< arr.length; i++){
//            for(int j=1; j< arr.length; j++){
//                int diff = arr[i] - arr[j];
//                if(diff > maxDiff){
//                    maxDiff = diff;
//                }
//            }
//        }
//        System.out.println("Max diff" + maxDiff);

        Arrays.sort(arr);
        System.out.println(arr[arr.length-1] - arr[0]);
    }

    public static void main(String[] args) {
//        System.out.println(isPowerOfFour(4));
        char ch = 'w';

        System.out.println(10 + ch - 'A');
    }
        public static boolean isPowerOfFour(int n) {
            if(n == 1) return true;
            int x = 0;
            while(x<=n/4){
                System.out.println(Math.pow(4, x));
                if(Math.pow(4, x) == n){
                    return true;
                }
                x++;
            }
            return false;

        }
    }

