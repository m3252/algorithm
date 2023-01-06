package codinginterview.arraysandstrings;

import java.util.Arrays;

/**
 * 순열 확인
 * 문자열 두 개가 주어졌을 때 이 둘이 서로 순열 관계에 있는지 확인하는 메서드를 작성하라.
 * 단 대소문자를 구별하며, 공백도 하나의 문자로 취급한다.
 *
 * 확인 사항
 * 1. 대소문자 구별 여부
 * 2. 공백 비교 여부
 */
public class Q2 {

    public static void main(String[] args) {
        String a = "doog";
        String b = "good";
        System.out.println(정렬_비교(a, b));
        System.out.println(출현_횟수_비교(a, b));

    }

    private static boolean 출현_횟수_비교(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        int[] letters = new int[128]; // ASCII로 가정한다.

        char[] chars = a.toCharArray();
        for (char c : chars) { // 문자열 'a'의 문자 출현 횟수를 아스키코드 배열에 저장한다.
            letters[c]++;
        }

        for (int i = 0; i < b.length(); i++) {
            int c = b.charAt(i);
            letters[c] --;
            if (letters[c] < 0) {
                return false;
            }
        }

        return true;

    }

    private static boolean 정렬_비교(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        return sort(a).equals(sort(b));
    }

    private static String sort(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars); // DualPivotQuicksort
        return Arrays.toString(chars);
    }

}
