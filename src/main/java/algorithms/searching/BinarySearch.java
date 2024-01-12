package algorithms.searching;

public class BinarySearch {

    public static void main(String[] args) {
        int[][] grid = {{4, 3, 2, -1},
                {3, 2, 1, -1},
                {1, 1, -1, -2},
                {-1, -1, -2, -3}};
        //System.out.println(countNegatives(grid));
        int[] arr = {1, 3, 4, 6, 7, 8, 9, 34, 36, 67};
        System.out.println(binarySearchUsingRecursion(arr, 8, 0, arr.length - 1));


    }

    // ======================================================================================================================
    // BINARY SEARCH - THEORY
    // ======================================================================================================================
/*
     Time complexity is : O(logn) hence preferred search algo
    Steps in Binary search -- given that array is sorted
    1. Find the middle element of the array
    2. if middle element > target then search to the left of middle element
        and if middle element is smaller < target then search on the right side of the middle element
    3. if middle element == target done
*/
    // ======================================================================================================================
    //CODE
    // ======================================================================================================================

    public static boolean binarySearch(int x, int[] array) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == x) {
                return true;
            }
            if (array[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;

    }

    // ======================================================================================================================
    // BINARY SEARCH USING RECURSION
    // ======================================================================================================================

    public static int binarySearchUsingRecursion(int[] arr, int target, int start, int end) {

        if (start > end) {
            return -1;
        }

        int mid = (start + end) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] < target) {
            return binarySearchUsingRecursion(arr, target, mid + 1, end);
        }
        return binarySearchUsingRecursion(arr, target, start, mid - 1);

    }


    public static int countNegatives(int[][] grid) {

        int count = 0;


        for (int row = 0; row < grid.length; row++) {
            int left = 0;
            int right = grid[row].length - 1;

            while (left <= right) {
                int mid = (left + right) / 2;
                if (grid[row][mid] < 0) {
                    count = count + (right + 1) - mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return count;
    }

}
