package com.javapractice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
  private static final Logger log = LogManager.getLogger(App.class);

    public static void main( String[] args ){
        LinkedList<Integer> list1=new LinkedList<Integer>();
        list1.add(70);
        list1.add(30);
        list1.add(56);
        log.info("printing list 1 with added items");
        list1.print();

        LinkedList<Integer> list2=new LinkedList<Integer>();
        list2.append(56);
        list2.append(30);
        list2.append(70);
        log.info("printing list 2 with appended items");
        list2.print();

        LinkedList<Integer> list3=new LinkedList<Integer>();
        list3.append(56);
        list3.append(70);
        log.info("printing list 3 with appended items");
        list3.print();
        list3.insert(30, 2);
        log.info("printing list 3 after inserting item at 2nd position");
        list3.print();
    }
}
