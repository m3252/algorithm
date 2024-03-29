package infearn.string;

import java.util.Scanner;

/**
 * 설명
 * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
 * 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
 *
 * 입력
 * 첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
 * 문자열은 영어 알파벳으로만 구성되어 있습니다.
 *
 *
 * 출력
 * 첫 줄에 해당 문자의 개수를 출력한다
 */


public class String2 {

    public static int solution(String input1, String input2){
        int count = 0;

        /*for(int i=0; i<input1.length(); i++){
            if(input1.charAt(i) == input2.charAt(0)){
                count++;
            }
        }*/

        for(char i : input1.toCharArray()){
            if(i == input2.charAt(0)){
                count++;
            }
        }

        return count;
    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        String input2 = in.nextLine();
        input1 = input1.toLowerCase();
        input2 = input2.toLowerCase();

        System.out.println(solution(input1, input2));
    }

}
