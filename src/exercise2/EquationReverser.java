/**
 * EquationReverser.java
 *
 * Name: Buse DEMİRBAŞ
 *Student ID: 240444050
 *Date: 27/10/2026
 */

package exercise2;

public class EquationReverser {

    public static String reverseEquation(String equation) {
        TokenStack stack = new TokenStack();
        int i = 0;
        int n = equation.length();

        // Traverse the equation from left to right
        while (i < n) {
            char current = equation.charAt(i);

            // If digit, extract the full number and push
            if (Character.isDigit(current)) {
                int start = i;
                while (i < n && Character.isDigit(equation.charAt(i))) {
                    i++;
                }
                String number = equation.substring(start, i);
                stack.push(number);
            }
            // Otherwise, push the operator
            else {
                stack.push(String.valueOf(current));
                i++;
            }
        }

        // Pop all items from the stack to construct the reversed equation
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }
}
