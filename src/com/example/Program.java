package com.example;

import java.util.Iterator;

/**
 * Core Java
 * Author: Nilesh Ghule
 * Time: 2023-11-02 09:57
 */

public class Program {
	public static void main(String[] args) {
		SinglyLinkedList<String> list;
		list = new SinglyLinkedList<String>();
		
		list.add("Bill");
		list.add("Steve");
		list.add("Mark");
		list.add("Elon");
		
		System.out.println("Traversal using Iterator: ");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			String ele = itr.next();
			System.out.println(ele);
		}
		
		System.out.println("\nTraversal using for-each: ");
		for (String ele : list)
			System.out.println(ele);
	}
}










