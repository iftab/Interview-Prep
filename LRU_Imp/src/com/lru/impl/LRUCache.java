package com.lru.impl;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
   
   Node head = new Node(0, 0), tail = new Node(0, 0);
   Map<Integer, Node> map = new HashMap<>();
   int capacity;
   
   public LRUCache(int _capacity) {
	   capacity = _capacity;
	   head.next = tail;
	   tail.prev = head;
   }
   /* Remove a node and adjust the corresponding previous
    * node->prev->next = node->next
    * node->next->prev = node->next
    */
   
   private void remove(Node node) {
	   map.remove(node.key);
	   node.prev.next = node.next;
	   node.next.prev = node.prev;   
   }
   
   /*Insert into DLL
    * Add item into Map O(1) time complexity for retrieval.
    * Insert node next to head. 
    * */
   
   private void insert(Node node) {
	   map.put(node.key, node);
	   node.next = head.next;
	   node.next.prev = node;
	   node.prev = head;
	   head.next = node;
   }
   
   /*Get function gives result of value if contain then value else -1
    * Once node found move. Then remove from DDL and insert towards the head.
    * */
   
   public int get(int key) {
	   if(map.containsKey(key)) {
		   Node node = map.get(key);
		   remove(node);
		   insert(node);
		   return node.value;
	   }
	   return -1;
   }
   
   public void put(int key, int value) {
	   if (map.containsKey(key)) {
           remove(map.get(key));
       }
       if (map.size() == capacity) {
           remove(tail.prev);
       }
       insert(new Node(key, value));
   }
   
   public void printNodeElementInOrder() {
	   Node current = head;
	   while(current!=null) {
		   System.out.print(current.key + "="+current.value + "\t");
		   current = current.next;
	   }
   }
}
