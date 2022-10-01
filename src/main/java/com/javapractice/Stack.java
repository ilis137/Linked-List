package com.javapractice;

public class Stack<T> {
  private Node<T> top;
  private LinkedList<T> list=new LinkedList<T>();
  public void push(T item){
    list.add(item);
    top=list.getHead();
  } 

  public void print(){
    list.print();
  }
}
