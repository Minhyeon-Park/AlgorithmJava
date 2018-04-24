package com.linkedList;

public class CLLNode {
	private int data;
	private CLLNode next;
	public int getData() {
		return data;
	}
	public CLLNode(int data){
		this.data = data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public CLLNode getNext() {
		return next;
	}
	public void setNext(CLLNode next) {
		this.next = next;
	}
	
	int CircularListLength(CLLNode headNode){
		int length = 0;
		CLLNode currentNode = headNode;
		while(currentNode != null){
			length ++;
			currentNode = currentNode.getNext();
			if(currentNode == headNode)
				break;
		}
		return length;
	}
	void PrintCircularListData(CLLNode headNode){
		CLLNode CLLNode = headNode;
		while(CLLNode !=null){
			System.out.println(CLLNode.getData()+"->");
			CLLNode = CLLNode.getNext();
			if(CLLNode == headNode) 
				break;
		}
		System.out.println("("+CLLNode.getData()+")headNode");
	}
	void InsertAtEndInCLL (CLLNode headNode,CLLNode nodeToInsert){
		CLLNode currentNode = headNode;
		while(currentNode.getNext()!=headNode){
			currentNode.setNext(currentNode.getNext());
		}
		nodeToInsert.setNext(nodeToInsert);
		if(headNode == null)
			headNode = nodeToInsert;
		else{
			nodeToInsert.setNext(headNode);
			currentNode.setNext(nodeToInsert);
		}
	}
	void InsertAtBeginInCLL(CLLNode headNode,CLLNode nodeToInsert){
		CLLNode currentNode = headNode;
		while (currentNode.getNext()!=headNode){
			currentNode.setNext(currentNode.getNext());
		}
		nodeToInsert.setNext(headNode);
		currentNode.setNext(nodeToInsert);
		headNode = nodeToInsert;
	}
	void DeleteFrontNodeFromCLL(CLLNode head){
		CLLNode temp =head;
		CLLNode current =head;
		if(head == null){
			System.out.println("listEMPT");
			return;
		} 
		while(current.getNext()!= head){
			current.setNext(current.getNext());
		}
		current.setNext(head.getNext());
		head = head.getNext();
		temp = null;
		return;
	}
	
}
