package com.lru.impl;

public class Node {
	Node next, prev;
	int key, value;
	
	public Node(int _key,int _value) {
		key = _key;
		value = _value;
	}
}
