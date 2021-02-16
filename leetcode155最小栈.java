package com.example;

import java.util.Deque;
import java.util.LinkedList;

public class MinStack {
    /** initialize your data structure here. */
    Deque<Integer> StackA;//普通栈
    Deque<Integer> StackB;//存放最小数的栈
    public MinStack() {
        StackA=new LinkedList<>();
        StackB=new LinkedList<>();
    }

    public void push(int x) {
       StackA.push(x);
       if(StackB.isEmpty()){
           StackB.push(x);
       }else if(x<=StackB.peek()){
           StackB.push(x);
       }else {
           StackB.push(StackB.peek());
       }
    }

    public void pop() {
if(!StackA.isEmpty()&&!StackB.isEmpty()){
    StackA.pop();
    StackB.pop();
}
    }

    public int top() {
       return StackA.peek();
    }

    public int getMin() {
return StackB.peek();
    }
}
