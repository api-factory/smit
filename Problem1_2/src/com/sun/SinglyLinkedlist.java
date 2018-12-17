package com.sun;

public class SinglyLinkedlist {

	
	static class Node
	{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		} 
		
		
	}
	
	private Node head;
	
	public SinglyLinkedlist(Node head) {
	 this.head = head;
	}
	
	public void add(Node node)
	{
		Node current = head;
		while(current!= null)
		{
			if(current.next==null)
			{
				current.next = node;
				break;
			}
			current = current.next;
		}
	}

	public void print()
	{
		Node current = head;
		while(current!= null)
		{
			System.out.println("Data is ==>"+current.data);
			current = current.next;
		}
	}
	
	public void reverse()
	{
		Node pointer = head;
		Node current = null;
		Node previous = null;
		
		while(pointer != null)
		{
			current = pointer;
			pointer = pointer.next;
			
			current.next = previous;
			previous = current;
			head = current;
		}
	}
	
	public int getCount()
	{
		Node pointer = head;
		int count = 0;
		while(pointer != null)
		{
		  count++;
		  pointer = pointer.next;
		}
		
		return count;
	}
}
