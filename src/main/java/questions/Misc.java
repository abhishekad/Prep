package questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Misc {

    public static void main(String[] args) {
//        int n=5;
//        int[] ranges = {1,2,3,0,4,2};
//        int[] change = {1,2,3,0,4,2};
////        System.out.println(minTaps(n, ranges));
//
//        Map<String, Integer> hm = new HashMap<>();
//        Map<String, Integer> hm2 = new HashMap<>();
//        hm.put("Abhishek", 11);
//        hm2.put("Abhishek", 10);
//        Arrays.sort(ranges);
//        Arrays.sort(change);

//        System.out.println(ranges.equals(change));

        System.out.println(canConstruct("aa", "abb"));

    }

        public static int minTaps(int n, int[] ranges) {
            // Initialize dp array with -1
            int[] dp = new int[n + 1];
            Arrays.fill(dp, -1);

            // Base case: The 0th tap can water the entire garden
            dp[0] = 1;

            // Iterate from 1 to N
            for (int i = 1; i <= n; i++) {
                // Check if the garden can be watered from any previous tap
                for (int j = i - 1; j >= 0; j--) {
                    if (dp[j] != -1 && i <= j + ranges[j]) {
                        // If the garden can be watered from tap j, update dp[i]
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                    }
                }
            }

            // Return the minimum number of taps or -1 if the garden cannot be watered
            return dp[n];
        }

    public static boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> magMap = new HashMap<>();
        Map<Character, Integer> ranMap = new HashMap<>();

        for(int i=0; i<magazine.length(); i++){
            if(magMap.containsKey(magazine.charAt(i))){
                magMap.put(magazine.charAt(i), magMap.get(magazine.charAt(i))+1);
            }
            else{
                magMap.put(magazine.charAt(i), 1);
            }
        }

        for(int j=0; j<ransomNote.length(); j++){
            if(magMap.containsKey(ransomNote.charAt(j))){
                magMap.put(ransomNote.charAt(j), magMap.get(ransomNote.charAt(j))-1);
            }
            else{
                return false;
            }
        }

        System.out.println(magMap);
        return true;



    }
    }


