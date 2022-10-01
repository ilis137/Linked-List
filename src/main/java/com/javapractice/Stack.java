package com.javapractice;

public class Stack<T> {
  private Node<T> top;
  private LinkedList<T> list = new LinkedList<T>();
  //adds item to top of stack .calls internal linked list add method for it.
  public void push(T item) {
    list.add(item);
    top = list.getHead();
  }
  //pops item from top of stack .calls internal linked list pop method for it.
  public Object pop() {
    Object removedItem=list.pop();
    top = list.getHead();
    return removedItem;
  }
  //get data at the top without removing it.
  public T peek() {
    return top.getData();
  }
  //print the stack
  public void print() {
    list.print();
  }
}
