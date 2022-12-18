package structure.string.questions;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {

    public static boolean 아스키코드_솔루션(String str) {
        if (str.length() > 128) {
            return false;
        }
        boolean[] booleans = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int code = str.charAt(i);
            if (booleans[code]){
                return false;
            }
            booleans[code] = true;
        }
        return true;
    }

    public static boolean 비트조작_솔루션(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int code = str.charAt(i) - 'a';
            if ((checker & 1 << code) > 0) {
                return false;
            }
            checker |= (1 << code);
        }
        return true;
    }

    public static boolean 해쉬맵_솔루션(String str) {
        Map<Character, Boolean> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character code = str.charAt(i);
            if (map.containsKey(code)) {
                return false;
            }
            map.put(code, true);
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "abcddfeg";
        String str2 = "abcdefgh";

        System.out.println(아스키코드_솔루션(str1));
        System.out.println(아스키코드_솔루션(str2));

        System.out.println(해쉬맵_솔루션(str1));
        System.out.println(해쉬맵_솔루션(str2));

        System.out.println(비트조작_솔루션(str1));
        System.out.println(비트조작_솔루션(str2));

        /*
            자료구조를 사용하지 않는다면

            N을 N만큼 돌려서 찾거나 O(n2)

            정렬을 할 수 있다면 퀵 정렬을 통해 O(n log n)

            을 만들 수 있다.
        */
    }
}
