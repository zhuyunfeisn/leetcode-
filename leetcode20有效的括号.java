package com.example;
import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {
String s="([)]";

        System.out.println(isValid(s));

    }
    public static Boolean isValid(String s) {
      Deque<Character> Stack=new LinkedList<>();
      char[]arr=s.toCharArray();
        for (int i = 0; i <arr.length ; i++) {
            switch (arr[i]){
                case '(':
                case '[':
                case '{':
           //无break，所以一定执行下列操纵
                    Stack.push(arr[i]);
                    break;
                default://一定是右括号
                    if(Stack.isEmpty()){
                        //栈是空的
                        return false;
                    }else {
                        //不是空取出栈顶元素
                        char left=Stack.pop();
                        //进行比较
                        if(!compare(left, arr[i])){
                            return false;
                        }
                    }
            }
        }
        if(Stack.isEmpty()){
            return true;
        }else {
            //左括号多了
            return false;
        }
    }

    public static boolean compare(char left,char c){
        if(left=='('&&c==')'){
            return true;
        }
        if(left=='['&&c==']'){
            return true;
        }
        if(left=='{'&&c=='}'){
            return true;
        }
        return false;
    }
}
