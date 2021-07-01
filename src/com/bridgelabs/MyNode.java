package com.bridgelabs;


public class MyNode {
	int data;
	MyNode next;
	
	public MyNode(int data, MyNode next) {
		super();
		this.data = data;
		this.next = next;
	}
	public MyNode() {
		
	}
	public void setData(int data) {
		this.data = data;
	}
	public void setNext(MyNode next) {
		this.next = next;
	}
	public int getData() {
		return data;
	}
	public MyNode getNext() {
		return next;
	}

	
}
