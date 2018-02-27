package com.LinkedList;

public class ListEndNullCheckExerc14 {
	public static int findLoopLength (ListNode headNode){
		ListNode slowPtr = headNode, fastPtr = headNode;
		int loopLength = 0;
		boolean loopExist = false;
		while(slowPtr != null || fastPtr !=null){
			fastPtr = fastPtr.getNext();
			if(fastPtr == slowPtr ) loopExist = true;
			//if(fastPtr == null) {loopExist = false; break;}
			fastPtr = fastPtr.getNext();
			slowPtr = slowPtr.getNext();
			if(fastPtr == slowPtr ) {loopExist = true; break;}
			if(fastPtr == null) {loopExist = false; break;}
			
		}
		if (loopExist){
			System.out.println(loopExist);
			fastPtr = fastPtr.getNext();
			while(slowPtr != fastPtr ){
				fastPtr = fastPtr.getNext();
				loopLength = loopLength + 1 ;
			}	
		}
		return loopLength;
	}
	
	public static void main(String ar[]){
		// TODO Auto-generated method stub
		ListNode headNode = new ListNode(0);
		ListNode[]  lnL;
		lnL = new ListNode[11];	
	    for (int i = 1 ; i < 11 ; i ++){
	    	lnL[i] = new ListNode(i);
	    	lnL[i].setData(i);
	    }
	    
		for (int i = 1 ; i < 11 ; i ++){
			 
		headNode.InsertInLinkedList(headNode, lnL[i], i);
		System.out.println(lnL[i].getData());
		}
	    //lnL[10].setNext(lnL[4]);
			
	    System.out.println(findLoopLength(headNode));
	}

}
