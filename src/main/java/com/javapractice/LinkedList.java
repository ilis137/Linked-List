package com.javapractice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LinkedList<T> {
  protected Node<T> head;
  private static final Logger log = LogManager.getLogger(App.class);
  //check if list is empty
  public boolean isEmpty() {
    if (head == null) {//if head is null list is size 0
      return true;
    }
    return false;
  }
  //returns size of the linked list
  public int getSize() {
    int size = 0;
    Node<T> temp = head;
    while (temp != null) {
      temp = temp.getNext();
      size++;
    }
    return size;
  }
  //add new item to list in the beginning
  public void add(T data) {
    Node<T> newNode = new Node<T>(data);

    if (this.isEmpty()) {//check if list is empty,then create head=newnode
      this.head = newNode;
      return;
    }
    newNode.setNext(head);//update head as the new node
    head = newNode;
  }
  //append item to the end
  public void append(T data) {
    Node<T> newNode = new Node<T>(data);

    if (this.isEmpty()) {
      this.head = newNode;
      return;
    }
    Node<T> temp = head;
    //find end of linked list then append new node to last node
    while (temp.getNext() != null) {
      temp = temp.getNext();
    }
    temp.setNext(newNode);
  }
  //insert new item in between the list
  public void insert(T data, int position) {
    Node<T> newNode = new Node<T>(data);
    int count = 1;
    if (this.isEmpty()) {
      if (position == 1)
        this.add(data);

      return;
    }
    // iterate to the position then change the linkages of the nodes and new node
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
 //insert item after a given item
  public boolean insertAfter(T itemToSearch, T itemToAdd) {
    log.info("searching item"+itemToSearch);

    Node<T> oldNode = this.searchItem(itemToSearch);//find node of item to enter the new item after
    if (oldNode != null) {
      Node<T> newNode = new Node<T>(itemToAdd);//change the linkages
      Node<T> tempNode = oldNode.getNext();
      oldNode.setNext(newNode);
      newNode.setNext(tempNode);
      return true;
    }else{
      return false;
    }
  }
  //delete first node
  public int pop() {
    if (isEmpty()) {
      return -1;
    }
    Node<T> temp = head;
    head = head.getNext();
    temp.setNext(null);
    return (int) temp.getData();
  }
  //delete last node
  public int popLast() {
    Node<T> temp = head;
    if (isEmpty()) {
      return -1;
    }
    if (temp.getNext() == null) {
      head = null;
      return (int) temp.getData();
    }
    while (temp.getNext().getNext() != null) {
      temp = temp.getNext();
    }
    int deletedItem = (int) temp.getNext().getData();
    temp.setNext(null);
    return deletedItem;
  }
  //deletea node after a given node
  public boolean delete(T itemToDelete){
    Node<T> foundNode = this.searchItem(itemToDelete);
    log.info("deleting item "+itemToDelete+" in list 6");
    Node<T> firstNode=null;
    Node<T> secondNode=head;
    //search the node if found then change linkages of previous and next node
    if(foundNode!=null){
      while (secondNode!=null&&!secondNode.getData().equals(foundNode.getData())) {
        firstNode = secondNode;
        secondNode = secondNode.getNext();
      }  
      firstNode.setNext(secondNode.getNext());
      secondNode.setNext(null);
      return true;
    }
    
    return false;

  }


  //search the item in linked list
  public Node<T> searchItem(T item) {
    Node<T> temp = head;
    if (this.isEmpty())
      return null;
    while (temp != null) {
      if (temp.getData().equals(item)) {
        return temp;
      }
      temp = temp.getNext();
    }
    return null;
  }

   //print the linked list
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

//class for ordered linked list
class SortedLinkedList<T extends Comparable<T>> extends LinkedList<T>{
  SortedLinkedList(){
    super();
  }
  //sort the linked list
  public void bubbleSort(){
    Node<T> current = head;
    while (current != null) {

        Node<T> second = current.getNext();
        while (second != null) {

            if (current.getData().compareTo(second.getData())>0) {
                T temp = current.getData();
                current.setData(second.getData());
                second.setData(temp);
            }
            second = second.getNext();
        }
        current = current.getNext();
    }
  }
//add item in sorted linked list
  public void add(T data){
    super.add(data);
    this.bubbleSort();
  }
//append item in sorted linked list
  public void append(T data){
    super.add(data);
    this.bubbleSort();
  }


}
