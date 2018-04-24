package com.linkedList;


public class FindNNode {
	// ������ N ��° ��� ã��
	//1. for ������ �� ��� ���̸� ���� �� �ٽ� �� ���� - 2 ��ŭ �̵��Ͽ� ����
	public static Integer FindNMT(ListNode listNode,int nIndex){
		Integer data = null;
		int listLength = 0;
		ListNode currentNode = listNode;
		
		while (currentNode != null){
			listLength = listLength +1 ;
			currentNode = currentNode.getNext();
			
		}
		for(int i = 0 ; i < listLength-nIndex; i++){
			listNode = listNode.getNext();
			data = listNode.getData();
		}
		
		return data;
	}
	// ������ �ΰ� �ѹ��� �̵� 
	public static Integer FindTPointer(ListNode headNode, int nIndex){
		ListNode temp  = headNode;
		ListNode tempPN = headNode ;
		Integer data = null;
		
		for(int i = 0; i < nIndex ; i ++){
			tempPN = tempPN.getNext();
		}
		while ( tempPN != null){
			temp = temp.getNext();
			tempPN = tempPN.getNext();
			data = temp.getData();
		}
		return data;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode headNode = new ListNode(1);
		ListNode[]  lnL;
		lnL = new ListNode[10];	
	    for (int i = 1 ; i < 10 ; i ++){
	    	lnL[i] = new ListNode(i);
	    	lnL[i].setData(i);
	    }
	    
		for (int i = 1 ; i < 10 ; i ++){
			 
			headNode.InsertInLinkedList(headNode, lnL[i], i);
		}
		
		
		
		System.out.println(FindNMT(headNode , 4));
		System.out.println(FindTPointer(headNode , 4));
		
	}

}
