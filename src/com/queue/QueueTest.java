package com.queue;

public class QueueTest {
    public static void main (String[] args){
        System.out.println("ArrayQueue Test");
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

        System.out.println("DynArrayQueue Test");
        DynArrayQueue dq = DynArrayQueue.createDynArrayQueue();
        System.out.println("QueueSize : "+ dq.getQueueSize());
        dq.enQueue(3);
        System.out.println("QueueSize : "+dq.getQueueSize());
        dq.enQueue(4);
        System.out.println("QueueSize : "+dq.getQueueSize());
        dq.enQueue(5);
        System.out.println("QueueSize : "+dq.getQueueSize());
        dq.enQueue(6);
        System.out.println("QueueSize : "+dq.getQueueSize());
        dq.enQueue(7);
        System.out.println("QueueSize : "+dq.getQueueSize());
        dq.enQueue(8);
        System.out.println("QueueSize : "+dq.getQueueSize());
        dq.enQueue(9);
        System.out.println("QueueSize : "+dq.getQueueSize());
        int dqSize = dq.getQueueSize();
        for (int i = 0 ; i <dqSize; i ++){
            System.out.println(dq.deQueue());
        }

        System.out.println("LLQueue Test");
        LLQueue lq = LLQueue.createQueue();

        lq.enQueue(3);

        lq.enQueue(4);

        lq.enQueue(5);

        lq.enQueue(6);

        lq.enQueue(7);

        lq.enQueue(8);

        lq.enQueue(9);


        while (!lq.isEmpty()){
            System.out.println(lq.deQueue());
        }
    }


}
