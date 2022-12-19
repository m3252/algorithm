package structure.list;

public class LinkedList {

    private Node header;

    static class Node {
        Node next = null;
        int data;
    }

    public LinkedList() {
        this.header = new Node();
    }

    public void append(int d) {
        Node end = new Node();
        end.data = d;
        Node n = header;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    public void delete(int d) {
        Node n = header;
        while (n.next != null) {
            if (n.next.data == d) {
                n.next = n.next.next;
            } else {
                n = n.next;
            }
        }
    }

    public void print() {
        Node n = header.next;
        while (n.next != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println(n.data);
    }

    public void removeDuplicateElements() {
        Node n = header;
        /*
         * Runnner 기법
         * 부가 포인터를 이용하여 연결리스트를 한번 더 순회시킨다.
         */
        while (n != null && n.next != null) {
            Node r = n;
            while (r.next != null) {
                if (n.data == r.next.data) {
                    r.next = r.next.next;
                } else {
                    r = r.next;
                }
            }
            n = n.next;
        }
    }
}

class LinkedListTest {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.print();
        ll.delete(1);
        ll.print();
    }
}
