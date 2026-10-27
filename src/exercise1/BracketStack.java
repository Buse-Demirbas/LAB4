/**
 * BracketStack.java
 *
 *Name: Buse DEMİRBAŞ
 *Student ID: 240444050
 *Date: 27/10/2026
 */

package exercise1;

public class BracketStack {

    private class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public BracketStack() {
        top = null;
    }

    //Add an element to the top of the stack
    public void push(char value) {
        // Create new node and link it to current top, then update top
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    //Remove and return the top element
    public char pop() {
        if (isEmpty()) {
            return '\0';
        }
        char poppedData = top.data;
        top = top.next; // Move top to the next node
        return poppedData;
    }

    //Return the top element without removing it
    public char peek() {
        if (isEmpty()) {
            return '\0';
        }
        return top.data;
    }

    //Check whether the stack is empty
    public boolean isEmpty() {
        return top == null;
    }
}
