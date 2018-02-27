package com.LinkedList;

public class DLLNode {
	private int data;
	private DLLNode next;
	private DLLNode previous;
	public DLLNode (int data){ 
		this.data = data;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public DLLNode getNext() {
		return next;
	}
	public void setNext(DLLNode next) {
		this.next = next;
	}
	public DLLNode getPrevious() {
		return previous;
	}
	public void setPrevious(DLLNode previous) {
		this.previous = previous;
	}
	DLLNode DLLInsert(DLLNode headNode, DLLNode nodeToInsert, int position){
		if(headNode == null)
			return nodeToInsert;
		int size = getDLLLength(headNode);
		if (position > size+1 || position < 1){
			System.out.println("position of nodeTo insert is invalid"+
						"the valid input are 1 to"+(size+1));
			return headNode;
		}
		if (position == 1){ // �Ӹ��κ� 
			nodeToInsert.setNext(headNode);
			headNode.setPrevious(nodeToInsert);
			return nodeToInsert;
		}else{
			DLLNode previousNode =headNode;
			int count = 1;
			while(count<position-1){
				previousNode = previousNode.getNext();
				count ++ ;
			}
			DLLNode currentNode = previousNode.getNext();
			nodeToInsert.setNext(currentNode);
			if(currentNode != null)
				currentNode.setPrevious(nodeToInsert);
			previousNode.setNext(nodeToInsert);
			nodeToInsert.setPrevious(previousNode);
			
			
		}
		return headNode;
	}
	DLLNode DLLDelete(DLLNode headNode,int position){
		int size = getDLLLength(headNode);
		if(position > size || position<1){
			System.out.println("invalid size");
			return headNode;
		}
		if(position ==1 ){
			DLLNode currentNode = headNode.getNext();
			headNode = null;
			currentNode.setPrevious(null);
			return currentNode;
		}else{
			DLLNode previousNode = headNode;
			int count = 1;
			while(count<position -1 ){
				previousNode = previousNode.getNext();
				count ++;
			}
			DLLNode currentNode = previousNode.getNext();
			DLLNode laterNode = currentNode.getNext();
			previousNode.setNext(laterNode);
			if(laterNode != null)
				laterNode.setPrevious(previousNode);
			currentNode = null;
		}
		return headNode;
	}
	int getDLLLength(DLLNode headNode){
		int length = 0;
		DLLNode currentNode = headNode;
		while(headNode != null){
			length  ++;
			currentNode = currentNode.getNext();
		}
		
		return length;
	}
}
