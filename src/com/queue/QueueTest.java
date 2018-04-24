package com.queue;

public class QueueTest {
    public static void main (String[] args){
        ArrayQueue aq = new ArrayQueue(5);
        System.out.println(aq.isEmpty());
        aq.enQueue(99);
        aq.enQueue(88);
        aq.enQueue(77);
        //aq.enQueue(77);
        //aq.enQueue(77);
        //aq.enQueue(77);
        for (int i = 0 ; i < 5 ; i ++){
            System.out.println(aq.deQueue());
        }

    }


}
