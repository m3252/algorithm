package leetcode.array;

public class SearchInsertPosition {
    /*고유한 정수의 정렬된 배열과 대상 값이 주어지면 대상이 발견되면 인덱스를 반환합니다. 그렇지 않은 경우 순서대로 삽입된 경우 인덱스를 반환합니다.
    O(log n)런타임 복잡성이 있는 알고리즘을 작성해야 합니다. */

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5)); // 2
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2)); // 1
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7)); // 4
    }

    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= target)
                return i;
        }
        return n;
    }
}



