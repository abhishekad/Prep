package dataStructures.linkedList;

import java.util.LinkedList;
import java.util.*;

public class MyLinkedList {

    public Node head;
    public Node tail;
    public int size;

    MyLinkedList(){
        this.size =0;
    }

    // Add element at the head of the linked list
    public void addFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = node;
        }
        size++;
    }

    // print the linked list >> all elements
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public void addTail(int value){
        Node node = new Node(value);
        if(tail == null){
            addFirst(value);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAtIndex(int value, int index){
        // (8, 3)  === LL: 5 -> 2-> 1->|| 12 ||-> 15 -> 13
        if(index == 0){
            addFirst(8);
            return;
        }

        if(index == size){
            addTail(value);
            return;
        }

        Node temp = head;

        for(int i = 1; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
//        System.out.println(temp.value);
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        return val;
    }

    public int deleteLast(){
        Node secondLastNode = getNodeAt(size-2);
        int val = tail.value;
        secondLastNode.next = null;
        tail = secondLastNode;

        return val;
    }

    public int deleteNodeAt(int index){
        Node previous = getNodeAt(index-1);
        int val = previous.next.value;
        previous.next = previous.next.next;
        return val;
    }

    public Node getNodeAt(int index){
        Node temp = head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }

    // useful when we only know the head value not the size or tail of the linked list
    public void addUsingRecursion(){

    }

    public MyLinkedList sortList(MyLinkedList llist) {
        Node traversal = llist.head;
        Node result = traversal;


        while(traversal.next != null){
            if(traversal.value > traversal.next.value){
                Node temp = traversal;
                traversal = traversal.next;
                traversal.next = temp;

            }
            else{
                traversal = traversal.next;
            }
        }
        return llist;

    }



    public class Node {
        private int value;
        private Node next;

        Node(int val) {
            this.value = val;
        }

        Node(int val, Node next){
            this.value = val;
            this.next = next;
        }

    }


}
