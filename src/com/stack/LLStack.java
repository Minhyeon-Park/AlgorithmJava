package com.stack;
import java.util.EmptyStackException;

import com.linkedList.ListNode;
public class LLStack {
	private ListNode headNode;
	public LLStack(){
		this.headNode = new ListNode(null);
	}
	public void Push (Integer data){
		if (headNode == null){
			headNode = new ListNode(data);
		}else if(headNode.getData()==null){
			headNode.setData(data);
		}else{
			ListNode listNode = new ListNode(data);
			listNode.setNext(headNode);
			headNode = listNode;
		}
	}
	public Integer top(){
		if(headNode == null) return null;
		else return headNode.getData();
	}
	public Integer pop(){
		if(headNode == null){
			throw new EmptyStackException();
		}else{
			Integer data = headNode.getData();
			headNode = headNode.getNext();
			return data;
		}
	}
	public boolean isEmpty(){
		if(headNode == null) return true;
		else return false;
	}
	public void deleteStack(){
		headNode = null;
	}
}
