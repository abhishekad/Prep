package dataStructures.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {

    public static void main(String[] args) {

        // Declaration of ArrayList
        ArrayList<Integer> list = new ArrayList<>();

//        // add element to lsit
//        list.add(456);
//        list.add(56);
//        list.add(22);
//        System.out.println("1st list: " + list);
//
//        //update element
//        list.set(0, 457);
//
//        // get element at index
//        list.get(0);
//
//        // check if element is present in the list
//        System.out.println(list.contains(56));
//
//        // remove element from list
//        list.remove(2);
//
//        // print size of list
//        System.out.println(list.size());
//        System.out.println("2nd list: " + list);

        //take input using for loop
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list);

    }
}
