package com.LinkedList;

public class ListNode {
	private Integer data;
	private ListNode next;
	public ListNode(Integer data){
		this.data = data;
	}
	public void setData(Integer data){
		this.data = data;
	}
	public Integer getData(){
		return data;
	}
	public void setNext(ListNode next){
		this.next = next;
	}
	public ListNode getNext(){
		return this.next;
	}
	//���� ����Ʈ �Է¹޾� ��� ���� ���� 
	int ListLength (ListNode headNode){
		int length = 0;
		ListNode currentNode = headNode;
		while(currentNode != null){
			length ++;
			currentNode = currentNode.getNext();
		}
		return length;
	}
	ListNode  InsertInLinkedList ( ListNode headNode, ListNode nodeToInsert, int position){
		if (headNode == null)
			return nodeToInsert;
		int size = ListLength(headNode);
		if(position > size+1|| position <1){
			System.out.println("Position of node to insert is invalid the valid input are 1 to " + (size +1));
			return headNode;
 		}
		if (position == 1){
			nodeToInsert.setNext(headNode);
			return nodeToInsert;
		}else {
			ListNode previousNode = headNode;
			int count =1;
			while(count < position-1){
				previousNode = previousNode.getNext();
				count++;
			}
			ListNode currentNode = previousNode.getNext();
			nodeToInsert.setNext(currentNode);
			previousNode.setNext(nodeToInsert);
		}
		return headNode;
	}
	ListNode DeleteNodeFromLinkedList(ListNode headNode,int position){
		int size = ListLength(headNode);
		if(position > size || position < 1){
			System.out.println("position of node to delete is invalid");
			return headNode;
		}
		if (position == 1){
			ListNode currentNode = headNode.getNext();
			headNode = null;
			return currentNode;
		}else{
			ListNode previousNode = headNode;
			int count = 1;
			while(count <position -1){
				previousNode = previousNode.getNext();
				count ++;
			}
			ListNode currentNode = previousNode.getNext();
			previousNode.setNext(currentNode.getNext());
			currentNode = null;
		}
		return headNode;
	}
	void DeleteLinkedList(ListNode head){
		ListNode auxilaryNode, iterator = head;
		while(iterator != null){
			auxilaryNode = iterator.getNext();
			iterator = null;
			iterator = auxilaryNode;
		}
	}
}
