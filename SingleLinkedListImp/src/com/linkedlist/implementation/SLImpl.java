package com.linkedlist.implementation;

public class SLImpl {
	public static void main(String[] args) {
		SinglyLinkedList sl = new SinglyLinkedList();
		sl.add(11);
		sl.add(42);
		
		sl.printElements();
		sl.remove(11);
		sl.printElements();
		System.out.println("\n"+sl.size());
	}

}
