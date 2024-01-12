package algorithms.recursion;

public class RecursionQuestions {
    public static void main(String[] args) {
        System.out.println(sumOfnto1(5));

    }


// ======================================================================================================================
// Recursion - THEORY
// ======================================================================================================================
/*
     Function that calls itself is called recursive function.
     Keeps calling itself until the base condition holds true
*/
// ======================================================================================================================
// Recursion - Problems
// ======================================================================================================================
    // Ques 1 - Print decreasing numbers using recursion

    public static void decreasingNumbersUsingRecursion(int num) {
        // we can print numbers using loop as well but here we are using recursion
        if (num > 0) {
            System.out.println(num);
            decreasingNumbersUsingRecursion(num - 1);
        }

    }

    public static void increasingNumbersUsingRecursion(int num) {
        if (num == 0) {
            return;
        }
        increasingNumbersUsingRecursion(num - 1);
        System.out.println(num);

    }

    // FIBONACCI SERIES
    public static int fibonacciSeriesOf(int n){

        if(n<2){
            return n;
        }
        return fibonacciSeriesOf(n-1) + fibonacciSeriesOf(n-2);
    }


    // FACTORIAL OF A NUMBER
    public static int printFactorialOfANumber(int n){

        if(n == 1){
            return 1;
        }
        return n * printFactorialOfANumber(n-1);
    }

    // SUM of n to 1
    public static int sumOfnto1(int n){
        if(n ==1){
            return 1;
        }
        return n + sumOfnto1(n-1);
    }


}
