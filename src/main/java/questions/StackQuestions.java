package questions;

import java.util.Stack;

public class StackQuestions {

     // How to declare a stack;
//    Stack<Integer> integerStack = new Stack<>();  // declared stack

    //  duplicate brackets
    public static void findDuplicateBrackets(String equation){
        Stack<Character> charct = new Stack<>();
        char[] brackets = equation.toCharArray();

        for(int i=0; i<brackets.length; i++) {
            if (brackets[i] == ')') {
                if(charct.peek() == '(') {
                    System.out.println("Duplicate: true");
                    return;
                }
                else {
                    while (charct.peek() != '(') {
                        charct.pop();
                    }
                    charct.pop();
                }
            } else {
                charct.push(brackets[i]);
            }
        }
        System.out.println("Duplicate: false");
    }


}
