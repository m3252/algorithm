package programmers.stackAndQueue;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson42586 {

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        List<Integer> arr = new ArrayList<>();
        int[] temp = new int[progresses.length];
        int day = 0;
        int deploy = 1;

        for(int i=0; i<progresses.length; i++){
            day = (99 - progresses[i]) / speeds[i] + 1;
            temp[i] = day;
        }

        System.out.println(Arrays.toString(Arrays.stream(temp).toArray()));
        for(int i=1; i<temp.length; i++){
            if(temp[i-1] > temp[i]){
                deploy = deploy + 1;
            }else{
                deploy = 1;
            }
            arr.add(deploy);
        }

        return arr.stream().mapToInt(i->i).toArray();
    }


    private static void testCase1() {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        int[] answer = {2, 1};
        System.out.println(Arrays.toString(solution(progresses, speeds)));
    }

    private static void testCase2() {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};
        int[] answer = {1, 3, 1};
        System.out.println(Arrays.toString(solution(progresses, speeds)));
    }
}
