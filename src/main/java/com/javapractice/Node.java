package com.javapractice;

public class Node<T>{
    private T data;//key
    private Node <T> next;//next node
    
      Node(T data){
        this.data=data;
        this.next=null;
      }

      public T getData() {
        return data;
      }

      public void setData(T data) {
        this.data = data;
      }

      public Node<T> getNext() {
        return next;
      }

      public void setNext(Node<T> next) {
        this.next = next;
      }
    }

