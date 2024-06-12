package com.jiat.wickramage_uthila;

public class Queue {
    public int[] data;
    public int FRONT;
    public int REAR;
    public int size;
    public int capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.FRONT = -1;
        this.REAR = -1;
        this.data = new int[capacity];
    }

    public boolean isFull(){
        return REAR==capacity-1;
    }

    public boolean isEmpty(){
        return REAR==-1;
    }
    public void enqueue(int value){
if(!isFull()){
    if(!isEmpty()){

    }
}
    }
}
