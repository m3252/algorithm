package leetcode;

import java.util.Stack;

// 주어진 문자열에서 에서 괄호가 순서대로 닫혔는지 여부를 확인하여 반환하는 문제입니다.
// '(', '{', '['는 여는 괄호이고, ')', '}', ']'는 닫는 괄호입니다.
public class LeetCode20 {
    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            char[] chars = s.toCharArray();
            for (char c : chars) {
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.size() == 0 || stack.pop() != '(') {
                        return false;
                    }
                } else if (c == '}') {
                    if (stack.size() == 0 || stack.pop() != '{') {
                        return false;
                    }
                } else if (c == ']') {
                    if (stack.size() == 0 || stack.pop() != '[') {
                        return false;
                    }
                } else {
                    return false;
                }
            }

            return stack.isEmpty();
        }
    }

    public static void main(String[] args) {
        LeetCode20 outer = new LeetCode20();
        Solution solution = outer.new Solution();

        String[] tests = {
                "()",       // true
                "()[]{}",   // true
                "(]",       // false
                "([)]",     // false
                "{[]}",     // true
                "([{}])",   // true
                "(",        // false
                "]"         // false
        };

        for (String test : tests) {
            boolean result = solution.isValid(test);
            System.out.println("입력: " + test + " → 결과: " + result);
        }
    }
}
