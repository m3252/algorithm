package structure.stack;

import java.util.EmptyStackException;

public class MyStack<T> {
    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }

    }

    private Node<T> top;

    public T pop(){
        if (top == null) {
            throw new EmptyStackException();
        }
        T temp = top.data;
        top = top.next;
        return temp;
    }

    public void push(T item) {
        Node<T> t = new Node<>(item);
        t.next = top;
        top = t;
    }

    public T peek() {
        if (top == null) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

}

class MyStackTest {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        System.out.println(myStack.isEmpty());
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        System.out.println(myStack.peek());
        myStack.pop();
        System.out.println(myStack.peek());
        myStack.pop();
        System.out.println(myStack.peek());
        myStack.pop();
        System.out.println(myStack.peek());
        System.out.println(myStack.isEmpty());
        myStack.pop();
        System.out.println(myStack.isEmpty());
    }
}
