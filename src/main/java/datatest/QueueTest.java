package datatest;

import java.util.Stack;

public class QueueTest {
    public static void main(String[] args) {
        Stack stack  =  new Stack();
        System.out.println(stack.empty());
        stack.push(3);
        System.out.println(stack.empty());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
    }
}
