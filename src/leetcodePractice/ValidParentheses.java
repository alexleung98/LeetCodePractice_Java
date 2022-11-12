package leetcodePractice;

import java.util.Stack;

/**
 * <h3>Leetcode Problems #20</h3>
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * <br>
 * Example 1:
 *
 * Input: s = "()"
 * Output: true
 * <br>
 * Example 2:
 *
 * Input: s = "()[]{}"
 * Output: true
 * <br>
 * Example 3:
 *
 * Input: s = "(]"
 * Output: false
 * <br>
 * Constraints:<br>
 *
 * 1 <= s.length <= 104
 * <br>
 * s consists of parentheses only '()[]{}'.
 *
 */
public class ValidParentheses {
    public static boolean isValid(String s){
        //stack 用法！！
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if(a == '(' || a == '[' || a == '{') {
                stack.push(a);
            }
            else if(stack.empty()){return false;}
            else if(a == ')' && stack.pop() != '('){return false;}
            else if(a == ']' && stack.pop() != '['){return false;}
            else if(a == '}' && stack.pop() != '{'){return false;}
        }
        return stack.empty();
    }
}
