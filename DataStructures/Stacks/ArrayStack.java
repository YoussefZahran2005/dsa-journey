package DataStructures.Stacks;

/* 

Implementation of the array stack and its main operations. 

**/
public class ArrayStack {
    char[] arrayStack;
    int capacity;
    int top;

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        this.arrayStack = new char[capacity];
        this.top = -1;
    }

    public void push(char element) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow (not the website cuh)");
        }
        top++;
        arrayStack[top] = element;
    }

    public char pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        }
        char popped = arrayStack[top];
        top--;
        return popped;
    }

    public char peek(){
        if(top == -1){
            System.out.println("Stack is empty");
        }
        return arrayStack[top];
    }

    public boolean isEmpty(){
        if (top == -1)
            return true;
        else 
            return false;
    }
}
