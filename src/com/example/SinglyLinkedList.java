package com.example;

import java.util.Iterator;

/**
 * Core Java
 * Author: Nilesh Ghule
 * Time: 2023-11-02 09:50
 */

public class SinglyLinkedList<T> implements Iterable<T> {
	private static class Node<T> {
		private T data;
		private Node<T> next;
		public Node(T val) {
			data = val;
			next = null;
		}
	}
	
	private Node<T> head;
	
	public SinglyLinkedList() {
		head = null;
	}
	
	public void add(T val) {
		Node<T> newNode = new Node<T>(val);
		if(head == null)
			head = newNode;
		else {
			Node<T> trav = head;
			while(trav.next != null)
				trav = trav.next;
			trav.next = newNode;
		}
	}
	
	public java.util.Iterator<T> iterator() {
		return new ListItr();
	}
	
	private class ListItr implements Iterator<T> {
		private Node<T> cur;
		public ListItr() {
			cur = head;
		}
		@Override
		public boolean hasNext() {
			return cur != null;
		}
		@Override
		public T next() {
			T val = cur.data;
			cur = cur.next;
			return val;
		}	
	}
}

