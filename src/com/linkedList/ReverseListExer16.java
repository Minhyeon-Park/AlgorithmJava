package com.linkedList;

public class ReverseListExer16 {

	public static ListNode ReverseList(ListNode headNode) {
		ListNode reversedList = null, nextNode = null;
		try{
			while(headNode.getData() != null){
				nextNode = headNode.getNext();
				headNode.setNext(reversedList);
				reversedList = headNode;
				headNode = nextNode;
				
			}
		}catch(NullPointerException e){
			System.out.println("??????????");
		}
		
		//System.out.println(reversedList.getNext().getData());
		return reversedList;		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode headNode = new ListNode(1);
		ListNode[]  lnL;
		lnL = new ListNode[11];	
	    for (int i = 1 ; i < 11 ; i ++){
	    	lnL[i] = new ListNode(i);
	    	
	    }
	    
		for (int i = 1 ; i < 11 ; i ++){
			 
			headNode.InsertInLinkedList(headNode, lnL[i], i);
			//System.out.println(lnL[i].getData());
		}
		//lnL[10].setNext(lnL[4]);
		
//		while (headNode.getData()!=null){
//			System.out.println(headNode.getData());
//			headNode = headNode.getNext();
//		}
		ListNode revNode = ReverseList(headNode);
//		
		while (revNode.getData() != null){
			System.out.println(revNode.getData());
			revNode = revNode.getNext();
		}
		
		
		
	}

}
