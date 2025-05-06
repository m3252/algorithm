package leetcode.tree;

// 두 정렬된 연결 리스트를 병합하여 하나의 정렬된 연결 리스트로 반환하는 문제입니다.
public class LeetCode21 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode ret = null;
            ListNode cur = null;

            while (l1 != null || l2 != null) {
                if (l2 == null || (l1 != null && l1.val < l2.val)) {
                    if (ret == null) {
                        ret = l1;
                        cur = l1;
                        l1 = l1.next;
                    } else {
                        cur.next = l1;
                        cur = l1;
                        l1 = l1.next;
                    }
                } else {
                    if (ret == null) {
                        ret = l2;
                        cur = l2;
                        l2 = l2.next;
                    } else {
                        cur.next = l2;
                        cur = l2;
                        l2 = l2.next;
                    }
                }
            }
            return ret;
        }
    }

    public static void main(String[] args) {
        LeetCode21 outer = new LeetCode21(); // 바깥 클래스 객체

        // 첫 번째 리스트: 1 -> 2 -> 4
        ListNode l1 = outer.new ListNode(1);
        l1.next = outer.new ListNode(2);
        l1.next.next = outer.new ListNode(4);

        // 두 번째 리스트: 1 -> 3 -> 5
        ListNode l2 = outer.new ListNode(1);
        l2.next = outer.new ListNode(3);
        l2.next.next = outer.new ListNode(5);

        Solution solution = outer.new Solution();
        ListNode result = solution.mergeTwoLists(l1, l2);

        // 결과 출력
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) {
                System.out.print(" -> ");
            }
            result = result.next;
        }
    }

}
