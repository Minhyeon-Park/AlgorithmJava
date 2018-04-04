package com.Stack;

public class ArrayStack {
	private int top;
	private int capacity;
	private String[] array;
	public ArrayStack(){
		capacity = 1;
		array = new String [capacity];
		top = -1;
	}
	public boolean isEmpty(){
		return(top==-1);
	}
	public boolean isStackFull(){
		return( (top==capacity -1) );
	}
	public void push(String data){
		if(isStackFull()) System.out.println("stack overflow");
		else
			array[++top] = data;
	}
	public String pop(){
		if(isEmpty()){
			System.out.println("stack is empty");
			return null;
		}
		else return(array[top--]);
	}
	public void deleteStack(){
		top = -1;
	}
}
