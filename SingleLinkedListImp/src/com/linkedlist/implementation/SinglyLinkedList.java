package com.linkedlist.implementation;

public class SinglyLinkedList {
	Node head;
	int size = 0;

	/* Add Node next to singlylinkedList head Node */
	public Node add(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
		}
		head = newNode;
		size++;
		return head;
	}

	public int size() {
		return size;
	}

	/* Remove element from head node */
    public void remove(int item) {
    	
    	// find the node
    	Node current = head, preNode = null;
    	
    	if(current != null && current.data == item) {
    		size--;
    		head = current.next;
    	}
    	
    	// Search for the key to be deleted, keep track of 
        // the previous node as we need to change temp.next 
    	while(current != null && current.data != item) {
    		preNode = current;
    		current = current.next;
    	}
    	
    	// If key was not present in linked list 
    	if(current == null) {
    		return;
    	}
    	
    	// Unlink the node from linked list 
        preNode.next = current.next;
        size--;
    }
	
	
	
	/* Print SingleLinkedList and Traversing LinkedList */
	public void printElements() {
		Node currentNode = head;
		System.out.println();
		while (currentNode != null) {
			System.out.print(currentNode+" -> ");
			currentNode = currentNode.next;
		}
		System.out.print("null");
	}
}
