package com.javapractice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LinkedList<T> {
  private Node<T> head;
  private static final Logger log = LogManager.getLogger(App.class);

  public void add(T data) {
    Node<T> newNode = new Node<T>(data);

    if(this.head==null){
      head=newNode;
      return;
    }
    newNode.setNext(head);
    head=newNode;

  }

  public void print(){
    Node<T> temp=head;
    while(temp!=null){
      log.info(temp.getData());
      temp=temp.getNext();
    }
  }
}
