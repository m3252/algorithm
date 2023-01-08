package codinginterview.linkedlist;

import java.util.LinkedList;

/**
 * 뒤에서 K번째 원소 구하기
 * 단방향 연결리스트가 주어졌을 때 뒤에서 K번째 원소를 찾는 알고리즘을 구현하라
 */
public class Q2 {

    public static void main(String[] args) {
        Node<Integer> linkedList = new Node<>(1);
        linkedList.appendToTail(2);
        linkedList.appendToTail(3);
        linkedList.appendToTail(4);
        linkedList.appendToTail(5);
        linkedList.print();

        System.out.println(3 + "th to last node is " + findKthToLast(linkedList, 3));

        Reference reference = new Reference();
        System.out.println(4 + "th to last node is " + printKthToLast(linkedList, 4, reference).data);

        printKthToLast(linkedList, 2);

        System.out.println(5 + "th to last node is " + findNthToLast(linkedList, 5).data);


    }

    // 해법1. 연결리스트 길이를 아는 경우
    static int findKthToLast(Node<Integer> linkedList, int k) {
        Node<Integer> node = linkedList;
        for (int i = 0; i < linkedList.length() - k; i++) {
            node = node.next;
        }
        return node.data;
    }

    // 해법2. 재귀호출을 사용하는 경우, k번째 원소의 값을 '출력'
    static int printKthToLast(Node<Integer> linkedList, int k) {
        if (linkedList == null) {
            return 0;
        }
        int index = printKthToLast(linkedList.next, k) + 1;
        if (index == k) {
            System.out.println(k + "th to last node is " + linkedList.data);
        }
        return index;
    }

    static class Reference {
        public int count = 0;
    }

    // 해법2. 재귀호출을 사용하는 경우, 래퍼런스에 카운트 저장
    static Node<Integer> printKthToLast(Node<Integer> linkedList, int k, Reference r) {
        if (linkedList == null) {
            return null;
        }

        Node<Integer> node = printKthToLast(linkedList.next, k, r);

        r.count++;

        if (r.count == k) {
            return linkedList;
        }
        return node;
    }

    // 해법3. 순환적(iterative) 방법, 포인터를 사용하여 시간 복잡도 O(n), 공간 복잡도 O(1)
    static Node<Integer> findNthToLast(Node<Integer> head, int k) {
        Node<Integer> p1 = head;
        Node<Integer> p2 = head;

        // p1을 k만큼 이동시킨다.
        for (int i = 0; i < k; i++) {
            if (p1 == null) return null; // Out of bounds
            p1 = p1.next;
        }

        // p1과 p2를 함께 움직인다. p1이 끝에 도달하면, p2는 LENGTH-k번째 원소를 가리키게 된다.
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }


}

