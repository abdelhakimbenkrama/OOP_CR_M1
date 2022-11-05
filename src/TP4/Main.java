package TP4;
// Impelementation of a Simple Stack


class Stack {
    int [] s =  new int[10];
    int tos;

    Stack(){
        tos = -1;
    }

    // push item onto the stack
    void push(int item){
        if(tos==9)
            System.out.println("Stack is full");
        else
            s[++tos]=item;
    }
    // pop item from stack

    int pop (){
        if(tos <0){
            System.out.println("stack underflow");
            return  0;
        }else{
            return s[tos--];
        }
    }
}



public class Main {
    public static void main(String[] args) {
        // create Stack object
        Stack myStack = new Stack();
        for(int i =0; i<10;i++) myStack.push(i);

        System.out.println("Stack in MyStack :");
        for(int i =0; i<10;i++) System.out.println(myStack.pop());
    }
}
