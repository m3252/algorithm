package programmers.stackAndQueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Lesson42583 {
    public static void main(String[] args) {

        testCase1(); //7
        testCase2(); //101
        testCase3(); //110
    }


    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int total = 0;
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < truck_weights.length; i++) {
            while (true) {
                if (q.isEmpty()) {
                    q.offer(truck_weights[i]);
                    total += truck_weights[i];
                    answer++;
                    break;
                } else if (q.size() == bridge_length) {
                    total -= q.poll();
                } else {
                    if (total + truck_weights[i] > weight) {
                        q.offer(0);
                        answer++;
                    } else {
                        q.offer(truck_weights[i]);
                        answer++;
                        total += truck_weights[i];
                        break;
                    }
                }
            }
        }
        return answer + bridge_length;
    }

    private static void testCase1() {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};
        System.out.println(solution(bridge_length, weight, truck_weights));
    }

    private static void testCase2() {
        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = {10};
        System.out.println(solution(bridge_length, weight, truck_weights));
    }

    private static void testCase3() {
        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        System.out.println(solution(bridge_length, weight, truck_weights));
    }


}
