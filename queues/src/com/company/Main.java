package com.company;

import java.util.Arrays;

public class Main {
    static int front;
    static int rear;
    static int max = 5;
    public static void main(String[] args) {
        int n = 2;
        int item = 1;
        int[] queue = new int[max];
        create();
        ADDQ(item, queue, n, rear, front);
        DELETEQ(queue,n,front,rear);

        System.out.println(Arrays.toString(queue));
    }

    static void ADDQ(int item, int[] queue, int n, int rear, int front){
        if(front == ((rear+1)%n)){
            queueFull(rear, max);
        }else{
            rear = (rear+1)%n;
            queue[rear] = item;
        }
    }

    static int DELETEQ(int[] queue, int n, int front, int rear){
        int item = 0;
        if(front == rear){
            queueEmpty(front, queue);
        }else{
            front = (front+1)%n;
            item = queue[front];
        }
        return item;
    }

    static void create(){
        front = 0;
        rear = 0;
    }

    static int queueEmpty(int top, int[] stack){
        if(top == 0){
            return 1;
        }else{
            return 0;
        }
    }

    static boolean queueFull(int top, int max){
        if(top == max){
            return true;
        }else{
            return false;
        }
    }
}
