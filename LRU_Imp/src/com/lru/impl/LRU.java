package com.lru.impl;

public class LRU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LRUCache lru = new LRUCache(3);
        lru.put(1, 10);
        lru.put(2, 12);
        lru.put(3, 13);
        lru.printNodeElementInOrder();
        System.out.println();
        lru.put(4, 14);
        lru.printNodeElementInOrder();
        System.out.println();
        System.out.println(lru.get(2));
        lru.printNodeElementInOrder();
        System.out.println();
	}

}
