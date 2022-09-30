package com.javapractice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LinkedList<T> {
  private Node<T> head;
  private static final Logger log = LogManager.getLogger(App.class);

  public boolean isEmpty() {
    if (head == null) {
      return true;
    }
    return false;
  }

  public int getSize(){
    int size=0;
    Node<T> temp=head;
    while(temp!=null){
      temp=temp.getNext();
      size++;
    }
    return size;
  }

  public void add(T data) {
    Node<T> newNode = new Node<T>(data);

    if (this.isEmpty()) {
      this.head = newNode;
      return;
    }
    newNode.setNext(head);
    head = newNode;
  }

  public void append(T data) {
    Node<T> newNode = new Node<T>(data);

    if (this.isEmpty()) {
      this.head = newNode;
      return;
    }
    Node<T> temp = head;
    while (temp.getNext() != null) {
      temp = temp.getNext();
    }
    temp.setNext(newNode);
  }

  public void insert(T data, int position) {
    Node<T> newNode = new Node<T>(data);
    int count = 1;
    if (this.isEmpty()) {
      if (position == 1)
        this.add(data);

      return;
    }
    Node<T> firstNode = null;
    Node<T> secondNode = head;
    while (count < position) {
      firstNode = secondNode;
      secondNode = secondNode.getNext();
      count++;
    }
    firstNode.setNext(newNode);
    newNode.setNext(secondNode);
  }

  public int pop(){
    if(isEmpty()){
      return -1;
    }
    Node<T> temp=head;
    head=head.getNext();
    temp.setNext(null);
    return (int)temp.getData();
  }


  public int popLast(){
    Node<T> temp=head;
    if(isEmpty()){
      return -1;
    }
    if(temp.getNext()==null){
      head=null;
      return (int)temp.getData();
    }
    while(temp.getNext().getNext()!=null){
      temp=temp.getNext();
    }
    int deletedItem=(int)temp.getNext().getData();
    temp.setNext(null);
    return deletedItem;
  }

  public Node<T> searchItem(T item){
      Node<T> temp=head;
      if(this.isEmpty())
        return null;
      while(temp!=null){
        if(temp.getData().equals(item)){
          return temp;
        }
        temp=temp.getNext();
      }
      return null;
  }
  public void print() {
    if (this.isEmpty()) {
      log.info("List is empty!");
    }
    Node<T> temp = head;

    while (temp != null) {
      log.info(temp.getData());
      temp = temp.getNext();
    }
  }
}
