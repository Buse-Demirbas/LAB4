/**
 * TokenStack.java
 *
 * Name: Buse DEMİRBAŞ
 *Student ID: 240444050
 *Date: 27/10/2026
 */

package exercise2;

public class TokenStack {

    private class Node {
        // Data field as a String type
        String data;
        // Next pointer for Stack implementation
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Top pointer for the Stack
    private Node top;

    public TokenStack() {
        top = null;
    }

    public void push(String value) {
        // Create a new node, connect to current top, update top
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public String pop() {
        if (isEmpty()) {
            return null;
        }
        String value = top.data;
        top = top.next; // Move top to the next node
        return value;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
