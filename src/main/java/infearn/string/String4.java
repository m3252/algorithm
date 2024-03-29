package infearn.string;

import java.util.Scanner;

import static programmers.hash.Lesson42577.solution;

/*설명
N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.

입력
첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.

출력
N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.

예시
3
good > doog
Time > emiT
Big > giB

*/
public class String4 {

    public static void solution(String[] strings){
        for (int i = 0; i < strings.length; i++) {
            String str = "";
            for (int j = strings[i].length(); j > 0; j--) {
                str += strings[i].charAt((j-1));
            }
            System.out.println(str);
        }
    }

    public static void solution2(String[] strings){
        for (int i = 0; i < strings.length; i++) {
            System.out.println(new StringBuilder(strings[i]).reverse());
        }
    }

    public static void solution3(String[] strings){
        for (int i = 0; i < strings.length; i++) {
            char[] chars = strings[i].toCharArray();
            int lt = 0;
            int rt = strings[i].length()-1;
            while (lt < rt) {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt ++;
                rt --;
            }
            System.out.println(String.valueOf(chars));
        }
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int size = in.nextInt();
        String[] strings = new String[size];
        for (int i = 0; i < size; i++) {
            strings[i] = in.next();
        }
        solution3(strings);
    }
}