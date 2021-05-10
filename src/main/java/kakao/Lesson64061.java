package kakao;

import java.util.*;

public class Lesson64061 {

    public static void main(String[] args) {
        int[][] board = new int[][]
                {
                        {0, 0, 0, 0, 0},
                        {0, 0, 1, 0, 3},
                        {0, 2, 5, 0, 1},
                        {4, 2, 4, 4, 2},
                        {3, 5, 1, 3, 1}
                };
        System.out.println(solution(board, new int[]{1, 5, 3, 5, 1, 2, 1, 4}));
    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int move : moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][move - 1] != 0) {
                    if (stack.peek() == board[j][move - 1]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[j][move - 1]);
                    }
                    board[j][move - 1] = 0; // 인형 상태 변경
                    break;
                }
            }
        }
        return answer;
    }
}
