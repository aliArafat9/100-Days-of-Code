package day65;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        if (s.isEmpty()) {
            return true;  // An empty string is considered valid
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (st.isEmpty()) {
                return false;
            } else if ((ch == ')' && st.peek() != '(') || (ch == ']' && st.peek() != '[') || (ch == '}' && st.peek() != '{')) {
                return false;
            } else if ((st.peek() == '(' && ch == ')') || (st.peek() == '{' && ch == '}') || (st.peek() == '[' && ch == ']')) {
                st.pop();
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("abc"));
    }
}
