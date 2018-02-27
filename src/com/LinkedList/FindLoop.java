package com.LinkedList;

public class FindLoop {

	public static boolean fluidCycleFindAlgo(ListNode headNode){
		ListNode currentNode = headNode;
		ListNode rabbitNode = headNode;
		int loop = 1;
		while (currentNode != null && rabbitNode != null){
			System.out.println(loop);
			loop += 1;
			
			rabbitNode = rabbitNode.getNext();
			if(currentNode == rabbitNode ) return true;
			if(rabbitNode == null) return false;
			rabbitNode = rabbitNode.getNext();
			
			currentNode = currentNode.getNext();
			if(currentNode == rabbitNode)return true;
		}
		return false;
	}
	
	public static Integer findLoopStart (ListNode headNode){
		ListNode currentNode = headNode;
		ListNode rabbitNode = headNode;
		boolean loopFlag = false;
		
		while (currentNode != null && rabbitNode != null){
			
			rabbitNode = rabbitNode.getNext();
			
			if(rabbitNode == null) loopFlag =  false;
			
			rabbitNode = rabbitNode.getNext();
			currentNode = currentNode.getNext();
			if(currentNode == rabbitNode) {
				loopFlag = true;
				break;
			}
		}
		if(loopFlag){
			ListNode nhead = headNode;
			int loop2 = 1;
			while(nhead != rabbitNode){
				//System.out.println(loop2);
				if(nhead == rabbitNode){
					System.out.println("good");
					break;
				}
				loop2 += 1;
				nhead = nhead.getNext();
				rabbitNode = rabbitNode.getNext();
			}
			return nhead.getData();
		}
		return null;
	}
	
	public static void main(String[] args) {
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
			//System.out.println(lnL[i].getData());
		}
		lnL[10].setNext(lnL[4]);
		
		
		
		//System.out.println(fluidCycleFindAlgo(headNode));
		System.out.println(findLoopStart(headNode));
		
	}
	
}
