package com.sun;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		SinglyLinkedlist.Node head = new SinglyLinkedlist.Node(1);
		SinglyLinkedlist linkedlist = new SinglyLinkedlist(head);
		
		linkedlist.add(new SinglyLinkedlist.Node(2));
		linkedlist.add(new SinglyLinkedlist.Node(3));
		
		linkedlist.print();
		linkedlist.reverse();
		linkedlist.print();
		System.out.println("Total number of elements in Linkedlist are"+linkedlist.getCount());
	}

}
