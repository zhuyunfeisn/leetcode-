package com.example;

import java.util.Deque;
import java.util.LinkedList;

public class MyQueue {
    /** Initialize your data structure here. */
    private Deque<Integer> StackA;//入
    private Deque<Integer> StackB;//出
    public MyQueue() {
        StackA=new LinkedList<>();
        StackB=new LinkedList<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
          StackA.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(StackB.isEmpty()) {
            while (!StackA.isEmpty()) {
                Integer e = StackA.pop();
                StackB.push(e);
            }

        }
        return StackB.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(StackB.isEmpty()) {
            while (!StackA.isEmpty()) {
                Integer e = StackA.pop();
                StackB.push(e);
            }
        }
        return StackB.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
      return StackB.isEmpty()&&StackA.isEmpty();
    }
}
