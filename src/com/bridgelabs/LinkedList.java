package com.bridgelabs;

public class LinkedList {
	MyNode head;
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
}
