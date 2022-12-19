package structure.list.questions;

import structure.list.LinkedList;

public class DuplicateElements {
    /**
     * HashSet 같은 버퍼 공간을 이용했을 때
     * 시간과 공간 복잡도를 각각 O(N) 으로 만들 수 있지만 (링크드리스트 크기 만큼 순회, 공간만큼 바퍼 사용)
     * 버퍼를 사용하지 못할 땐 Runner 기법을 사용할 수 잇따.
     * Runner 기법을 사용하게 되면 N과 R이 순회하며 시간 복잡도가 O(N2)가 되지만 공간 복잡도는 별도의 버퍼가 없었기 때문에 O(1)이 된다.
     */
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.append(3);
        ll.append(2);
        ll.append(1);
        ll.append(2);
        ll.append(4);
        ll.append(4);
        ll.print();
        ll.removeDuplicateElements();
        ll.print();
    }
}
