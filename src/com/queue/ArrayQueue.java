package com.queue;

public class ArrayQueue {
    private int front;
    private int rear;
    private int capacity;
    private int [] array;
    public ArrayQueue(int size) {
        capacity = size;
        front = -1;
        rear = -1;
        array = new int [size];
    }
    public static ArrayQueue createQueue(int size){
        return new ArrayQueue(size);
    }

    public boolean isEmpty(){
        return(front == -1);
    }
    public boolean isFull(){
        return((rear+1)%capacity == front);
    }
    public int getQueueSize(){
        return((capacity - front + rear + 1)% capacity);
    }
    public void enQueue(int data){
        if(isFull()){
            throw new QueueOverFlowException("queue Overflow");
        }else{
            rear = (rear+1)%capacity;
            array[rear] = data;
            if(front == -1){
                front =rear;
            }
        }
    }
    public int deQueue(){
        int data ;
        if(isEmpty()){
            throw new EmptyQueueException("queue empty");
        }else{
            data = array[front];
            if(front == rear){
                front = rear-1;
            }else {
                front = (front + 1) % capacity;
            }
        }
        return data;
    }


}
