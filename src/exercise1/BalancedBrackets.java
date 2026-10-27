/**
 * BalancedBrackets.java
 *
 * Name: Buse DEMİRBAŞ
 *Student ID: 240444050
 *Date: 27/10/2026
 */

package exercise1;

public class BalancedBrackets {

    public static boolean isBalanced(String s) {
        // Create a stack
        BracketStack stack = new BracketStack();

        // Traverse the string character by character
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            // If opening bracket, push to stack
            if (current == '(' || current == '{' || current == '[') {
                stack.push(current);
            }
            // If closing bracket
            else if (current == ')' || current == '}' || current == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char topChar = stack.pop();
                if (!isMatchingPair(topChar, current)) {
                    return false;
                }
            }
        }

        // At the end, check whether the stack is empty
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char opening, char closing) {
        if (opening == '(' && closing == ')') return true;
        if (opening == '[' && closing == ']') return true;
        if (opening == '{' && closing == '}') return true;
        return false;
    }
}
