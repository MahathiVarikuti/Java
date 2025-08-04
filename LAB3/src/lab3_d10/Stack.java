package lab3_d10;
import java.util.*;
public class Stack {
	    private int[] stackArray;
	    private int tos;
	    // Constructor to initialize the stack
	    public Stack(int size) {
	        stackArray = new int[size];
	        tos = -1; // Top of stack is initially set to -1 indicating an empty stack
	    }
	    // Method to push an element to the stack
	    public void push(int value) {
	        if (tos == stackArray.length - 1) {
	            System.out.println("Stack Overflow");
	        } else {
	            stackArray[++tos] = value;
	        }
	    }
	    // Method to pop an element from the stack
	    public int pop() {
	        if (tos < 0) {
	            System.out.println("Stack Underflow");
	            return -1; // Returning -1 to indicate stack underflow
	        } else {
	            return stackArray[tos--];
	        }
	    }
	    // Method to display the contents of the stack
	    public void display() {
	        if (tos < 0) {
	            System.out.println("Stack is empty");
	        } else {
	            System.out.print("Stack contents: ");
	            for (int i = 0; i <= tos; i++) {
	                System.out.print(stackArray[i] + " ");
	            }
	            System.out.println();
	        }
	    }
	    public static void main(String[] args) {
	        Stack stack = new Stack(5); // Creating a stack of size 5
	        stack.push(10);
	        stack.push(20);
	        stack.push(30);
	        stack.push(40);
	        stack.display(); // Displaying stack contents
	        stack.pop();
	        stack.display(); // Displaying stack contents after pop
	    }
	}





o/p:
Stack contents: 10 20 30 40 
Stack contents: 10 20 30 
