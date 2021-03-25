package programmers.stackAndQueue;

import java.util.Arrays;

public class Lesson42586 {

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        return answer;
    }


    private static void testCase1() {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        int[] answer = {2, 1};
        System.out.println(Arrays.toString(new boolean[]{solution(progresses, speeds).equals(answer)}));
    }

    private static void testCase2() {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};
        int[] answer = {1, 3, 1};
        System.out.println(Arrays.toString(new boolean[]{solution(progresses, speeds).equals(answer)}));
    }
}
