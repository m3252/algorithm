package codinginterview.arraysandstrings;

/**
 * 문자열 압축
 * 반복되는 문자의 개수를 세는 방식의 기본적인 문자열 압축 메서드를 작성하라.
 * 예를 들어 'aabccccaaa'를 압축하면 'a2b1c5a3'가 된다.
 * 만약 압축된 문자열의 길이가 기존 문자열의 길이보다 길다면 기존 문자열을 반환해야 한다.
 * 문자열은 대소문자 알파벳으로만 이루여져 있다.
 */
public class Q6 {

    private static String solution(String str) {
        StringBuilder answer = new StringBuilder();
        int repetition = 1;

        char aChar = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (aChar == str.charAt(i)) {
                repetition++;
            } else {
                answer.append(aChar).append(repetition);
                aChar = str.charAt(i);
                repetition = 1;
            }
        }
        answer.append(aChar).append(repetition);
        return str.length() < answer.length() ? str : answer.toString();
    }

    private static String compress(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;

            // 다음 문자와 현재 문자가 같지 않다면 현재 문자를 결과 문자열에 추가한다. + 마지막 인덱스 순회
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append(str.charAt(i)).append(count);
                count = 0;
            }
        }
        return str.length() < compressed.length() ? str : compressed.toString();
    }

    private static String compress2(String str) {
        // 압축된 문자열의 길이가 입력 문자열보다 길다면 입력 문자열을 반환한다.
        int finalLen = countCompression(str);
        if (finalLen >= str.length()) return str;

        StringBuilder compressed = new StringBuilder(finalLen); // 크기 설정
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;

            // 다음 문자와 현재 문자가 같지 않다면 현재 문자를 결과 문자열에 추가한다. + 마지막 인덱스 순회
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append(str.charAt(i)).append(count);
                count = 0;
            }
        }
        return compressed.toString();

    }

    private static int countCompression(String str) {
        int compressedLen = 0;
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            count++;

            // 다음 문자와 현재 문자가 같지 않다면 현재 문자를 결과 문자열에 추가한다. + 마지막 인덱스 순회
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressedLen += 1 + String.valueOf(count).length();
                count = 0;
            }

        }
        return compressedLen;
    }


    public static void main(String[] args) {
        System.out.println(solution("aabccccaaa"));
        System.out.println(solution("abcd"));
        System.out.println(compress("aabccccaaa"));
        System.out.println(compress("abcd"));
        System.out.println(compress2("aabccccaaa"));
        System.out.println(compress2("abcd"));
    }

}
