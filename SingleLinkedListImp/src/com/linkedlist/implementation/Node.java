package com.linkedlist.implementation;

public class Node {
     Node next;
     Integer data;
     
     // Constructor
     public Node(int data) {
    	 this.data = data;
    	 this.next = null;
     }
     
     @Override
     public String toString() {
    	 return String.valueOf(data);
     }
}
