package codinginterview.linkedlist;

public class Node<T> {
    Node<T> next = null;
    T data;

    public Node(T data) {
        this.data = data;
    }

    void appendToTail(T data) {
        Node<T> end = new Node<>(data);
        Node<T> n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    void print() {
        Node<T> n = this;
        while (n.next != null) {
            System.out.print(n.data  + " -> ");
            n = n.next;
        }
        System.out.println(n.data);
    }

    int length() {
        int count = 0;
        Node<T> n = this;
        while (n.next != null) {
            count++;
            n = n.next;
        }
        return count + 1;
    }

    public static void main(String[] args) {
        Node<Integer> linked = new Node<>(1);
        linked.appendToTail(2);
        linked.appendToTail(3);
    }
}
