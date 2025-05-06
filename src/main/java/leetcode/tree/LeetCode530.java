package leetcode.tree;

/*
Binary Search Tree (BST)가 주어질 때,
서로 다른 두 노드의 값 사이의 최소 절댓값 차이를 구하라는 문제입니다.

조건: 트리의 값은 모두 0 이상의 정수입니다.
 */

// 트리 순회 : preOrder, inorder, postorder
// preorder : self, left, right
// inorder : left, self, right
// postorder : left, right, self
// 이진검색트리 성질 -> inorder -> 오름차순 정렬이 됨
public class LeetCode530 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    public static void main(String[] args) {
        LeetCode530 outer = new LeetCode530(); // 바깥 클래스 객체
        TreeNode root = outer.new TreeNode(1); // 루트 노드

        root.right = outer.new TreeNode(5);    // 루트의 오른쪽 자식 5
        root.right.left = outer.new TreeNode(3); // 5의 왼쪽 자식 3

        Solution solution = outer.new Solution();
        int result = solution.getMinimumDifference(root);
        System.out.println("최소 절댓값 차이: " + result); // 예상 출력: 2
    }


    class Solution {
        int min;
        boolean init;
        int prev;

        public int getMinimumDifference(TreeNode root) {
            init = false;
            min = Integer.MAX_VALUE;
            inorder(root);
            return min;
        }

        public void inorder(TreeNode root) {
            if(root == null) return;
            inorder(root.left);
            // self 처리
            if(!init) {
                init = true;
            } else {
                min = Math.min(min, root.val - prev);
            }
            prev = root.val;
            inorder(root.right);
        }
    }
}
