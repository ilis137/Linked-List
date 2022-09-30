package com.javapractice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {
    private static final Logger log = LogManager.getLogger(App.class);
    public static void main( String[] args ){
        Node<Integer> node1=new Node<Integer>(56);
        Node<Integer> node2=new Node<Integer>(30);
        Node<Integer> node3=new Node<Integer>(70);

        node1.next=node2;
        node2.next=node3;
        Node<Integer> temp=node1;
        while(temp!=null){
            log.info(temp.data);
            temp=temp.next;
        }
    }
}
