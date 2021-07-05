package com.bridgelabs;

public class LinkedList {
	MyNode head;
	//Append methog
	public void append(int data) {
		
		MyNode newNode = new MyNode();
		newNode.data = data;
		newNode.next = null;
		if(head == null) {
			this.head = newNode;
		}
		else {
			MyNode tempNode = head;
			while(tempNode.next != null) {
				tempNode = tempNode.next;
			}
			tempNode.next = newNode;
		}
	}
	//Add method 
	public void add(int data) {
		MyNode newNode = new MyNode();
		newNode.data = data;
		newNode.next = null;
		newNode.next = head;
		head = newNode;
	}
	
	public void print() {
		MyNode tempNode = head;
		while(tempNode.next != null) {
			System.out.println(tempNode.data);
			tempNode = tempNode.next;
		}
		System.out.println(tempNode.data);
	}
	//inserting data in linked list
	public void insert(int data) {
		MyNode newNode = new MyNode();
		newNode.data = data;
		newNode.next = null;
		if(head == null) {
			this.head = newNode;
		}
		else {
			MyNode tempNode = head.next;
			head.next = newNode;
			newNode.next = tempNode;
		}
	}
	//Deteting top element of list 
	public MyNode delete() {
		MyNode tempNode = this.head;
		this.head = head.next;
		return tempNode;		
	}
}
