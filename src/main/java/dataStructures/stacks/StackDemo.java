package dataStructures.stacks;

public class StackDemo {
    int array[];
    int capacity;
    int top;

    public StackDemo(int capacity){
        this.capacity = capacity;
        top = -1;
        array = new int[capacity];
    }

    public void push(int item){
        if(top == capacity-1){
            throw new RuntimeException("Index out of bound exception :: STACK IS FULL");
        }
        top++;
        array[top] = item;
    }

    public int pop(){
        if(top==-1){
            throw new RuntimeException("STACK IS EMPTY");
        }
        int popped = array[top];
        top--;
        return popped;
    }

    public int peek(){
        if(top==-1){
            throw new RuntimeException("STACK IS EMPTY");
        }
        return array[top];
    }

    public boolean empty() {
        if (top==-1){
            return true;
        }
        return false;
    }
}
