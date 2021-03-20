package programmers.hash;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Lesson42576 {

    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
        testCase4();
    }

    public static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        String answer = participant[participant.length - 1];

        for(int i = 0; i < participant.length - 1 ; i++){
            if(!participant[i].equals(completion[i])){
                answer = participant[i];
                break;
            }
        }
        return answer;
    }


    private static void testCase1(){
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        String answer = "leo";
        System.out.println(answer.equals(solution(participant, completion)));
    }

    private static void testCase2(){
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        String answer = "vinko";
        System.out.println(answer.equals(solution(participant, completion)));
    }

    private static void testCase3(){
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        String answer = "mislav";
        System.out.println(answer.equals(solution(participant, completion)));
    }

    private static void testCase4(){
        String[] participant = {"mislav", "mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav", "mislav"};
        String answer = "mislav";
        System.out.println(answer.equals(solution(participant, completion)));
    }
}
