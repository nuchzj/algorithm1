package com.hzj.alg;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 20.有效的括号
 */
public class isValid {
    public static void main(String[] args) {
        new isValid().isValid("(]");
    }
    public Boolean isValid(String s) {
        int n = s.length();
        if (n % 2 ==1) {
            return false;
        }
        Map<Character,Character> pairs = new HashMap<Character,Character>() {{
           put(')','(');
           put(']','[');
           put('}','{');
        }};
        Deque<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)){
                if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                    return false;
                }
                stack.pop();
            }else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
