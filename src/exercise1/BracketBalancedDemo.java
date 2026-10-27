/**
 * BracketBalancedDemo.java
 *
 *  *Name: Buse DEMİRBAŞ
 *  *Student ID: 240444050
 *  *Date: 27/10/2026
 */

package exercise1;

public class BracketBalancedDemo {

    public static void main(String[] args) {

        System.out.println("========== BALANCED BRACKET TEST ==========");

        String[] expressions = {
                "[{()}]",
                "[()()]{}",
                "([]",
                "([{]})",
                "abc{defg(ijk)l[mn]op}qr",
                "a(bc)def]"
        };

        for (String expression : expressions) {
            boolean result = BalancedBrackets.isBalanced(expression);
            System.out.println("Input: " + expression + " -> Output: " + result);
        }
    }
}