package leetcode;

// 비어 있지 않은 단일 연결 리스트가 head 노드로 주어졌을 때, 이 연결 리스트의 중간 노드를 반환하시오.
//중간 노드가 두 개라면, 두 번째 중간 노드를 반환하시오.
public class LeetCode876 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    }
}
