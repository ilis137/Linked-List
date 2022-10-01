package com.javapractice;

public class Queue<T> {
  Node<T> front;
  private LinkedList<T> list = new LinkedList<T>();

  //adds item to rear of queue .calls internal linked list append method for it.
  public void enqueue(T item) {
    list.append(item);
    front = list.getHead();
  }
  //remove first element from queue.call internal linked list pop method.
  public Object dequeue() {
    Object removedItem=list.pop();
    front = list.getHead();
    return removedItem;
  }
  //print the queue
  public void print() {
    list.print();
  }
}
