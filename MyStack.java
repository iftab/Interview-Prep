package com.problem.stackImplementation;

import java.util.EmptyStackException;

/*
 * A stack uses LIFO(last in first out) ordering. 
*/

public class MyStack<T> {
	
	// private static node class 
	private static class StackNode<T>{
		private T data;
		private StackNode<T> next;
		
		public StackNode(T data) {
			this.data = data;
		}
	}
	
	/*  Set of operations
	 * 1. pop() - Remove the top item from the stack
	 * 2. push(item) - Adding item to the list.
	 * 3. peek() - Return the top of the stack.
	 * 4. isEmpty() - Return true, if and only if the stack is empty.
	 * 
	 * */
	
	private StackNode<T> top;
	
	public T pop() {
		if(top == null) {
			throw new EmptyStackException();
		}
		
		T item = top.data;
		top = top.next;
		return item;
	}
	
	public void push(T item) {
		StackNode<T> newNode = new StackNode<T>(item);
		
		newNode.next = top;
		top = newNode;
 	}
	
	public T peek() {
		if(top == null) throw new EmptyStackException();
		return top.data;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		StackNode<T> current = top;
		while(current != null) {
			builder.append(current.data);
			current = current.next;
			builder.append(" ");
		}
		
		return builder.toString();
	}
}
