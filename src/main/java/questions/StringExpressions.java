package questions;

import java.util.*;

public class StringExpressions {

    public static boolean checkBracesAreBalanced(String expr) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <expr.length(); i++) {
            char x = expr.charAt(i);
            if (x == '{' || x == '[' || x == '(') {
                stack.push(x);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            char check;
            switch (x) {
                case '}':
                    check = stack.pop();
                    if (check == ']' || check == ')') {
                        return false;
                    }
                    break;
                case ']':
                    check = stack.pop();
                    if (check == ')' || check == '}') {
                        return false;
                    }
                    break;
                case ')':
                    check = stack.pop();
                    if (check == '}' || check == ']') {
                        return false;
                    }
                    break;
            }
        }
        return (stack.isEmpty());
    }

    public static Stack<Integer> sortStackWithTempStack(Stack<Integer> inputStack){
        Stack<Integer>  tempStack = new Stack();

        while(!inputStack.isEmpty()){
            int inputPop = inputStack.pop();

            while(!tempStack.isEmpty() && tempStack.peek()<inputPop){
                inputStack.push(tempStack.pop());
            }
            tempStack.push(inputPop);
        }
        return tempStack;
    }


    public static void findOccurrenceOfCharacters(String inputString){
        // Abhishek is ass
        Map<Character, Integer> charMap = new HashMap<>();
        char[] brokenString = inputString.toLowerCase().toCharArray(); // [A, b, h, i, s, h, e, k]
        for( char c : brokenString){
            if(!String.valueOf(c).isBlank())
            if(charMap.containsKey(c)){
                charMap.put(c, charMap.get(c)+1);
            }
            else{
                charMap.put(c, 1);
            }
        }
        System.out.println(inputString + ":" + charMap);
    }

    public static void reverseEachWordOfString(String sentence){
        // Abhishek is ass >> [Abhishek, is, ass] >> [kehsihbA, si, ssa]
        // kehsihbA si ssa
        String[] words = sentence.split(" "); // [Abhishek, is, ass]
        String reversedSentence = "";
        for(String s : words){  // Abhishek
            String reversedWord = "";
            for(int i = s.length()-1; i>=0; i--){
                reversedWord = reversedWord + s.charAt(i); // [ kehsihbA]
            }
            reversedSentence = reversedSentence + reversedWord + " ";
        }
        System.out.println("Reversed : " + reversedSentence);
    }

    public static void findDuplicateInAnArray(String[] array){
        // ["java", "selenium", "c", "c++", "c"]
        Map<String, Integer> map = new HashMap<>();
        for(String str: array){
            if(map.containsKey(str)){
                System.out.println("Duplicate word is : "+ str);
            }
            map.put(str, 1);
        }
    }

    public static void printAllSubstringOfString(String str){
        // abc > a, ab, abc, b, bc, c

        for(int i = 0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                System.out.println(str.substring(i, j));
            }
        }

    }

    // print intialism
    public static void printInitialism(String str){
        // Electronics and information engineering ->> EIE
        // convert to uppercase

        String abbrevation = "";
        String[] splittedString = str.toUpperCase(Locale.ROOT).split(" ");
       //['Electronics', and, information, engineering ]

        for(String s: splittedString){
            if(s.equals("AND") || s.equals("OF") || s.equals("FOR")){
                continue;
            }
            abbrevation = abbrevation + s.charAt(0);
        }

        System.out.println(abbrevation);
    }

    public static boolean isIsomorphics(String s, String t) {
        Map<Character, Character> hm = new HashMap<>();
        Map<Character, Character> hm2 = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            if(hm.containsKey(s.charAt(i)) && hm.get(s.charAt(i)) != t.charAt(i) || hm2.containsKey(t.charAt(i)) && hm2.get(t.charAt(i)) != s.charAt(i)){
                return false;
            }
            else{

                hm.put(s.charAt(i), t.charAt(i));
                hm2.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }

    public static void timeConversion() {
        // Write your code here
        String result ="";
        StringBuilder sb = new StringBuilder(result);

        String s = "07:05:45PM";
        String[] splitHours = s.split(":");
        System.out.println(Arrays.toString(splitHours));
//        return s;
    }


    // This method removed the previous character if the current char is '#'
    // leetcode: 844. Backspace String Compare
    public static boolean backspace(String s, String t){
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for(int i=0; i<s.length();i++){
            if(s.charAt(i) == '#'){
                if(stack1.isEmpty())
                    stack1.pop();
            }
            else{
                stack1.push(s.charAt(i));
            }
        }
        for(int i=0; i<t.length();i++){
            if(t.charAt(i) == '#'){
                stack2.pop();
            }
            else{
                stack2.push(t.charAt(i));
            }
        }
        return stack1.equals(stack2);
    }
}