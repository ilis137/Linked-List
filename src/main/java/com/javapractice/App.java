package com.javapractice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    private static final Logger log = LogManager.getLogger(App.class);
    LinkedList<Integer> list;

    public void demonstrateAddNode() {

        list = new LinkedList<Integer>();
        list.add(70);
        list.add(30);
        list.add(56);
        log.info("printing list 1 with added items");
        list.print();
    }

    public void demonstrateAppendNode() {
        list = new LinkedList<Integer>();
        list.append(56);
        list.append(30);
        list.append(70);
        log.info("printing list 2 with appended items");
        list.print();
    }

    public void demonstrateInsertNode() {
        list = new LinkedList<Integer>();
        list.append(56);
        list.append(70);
        log.info("printing list 3 with appended items");
        list.print();
        list.insert(30, 2);
        log.info("printing list 3 after inserting item at 2nd position");
        list.print();
    }

    public void demonstrateDeleteFirstNode() {
        list = new LinkedList<Integer>();
        list.append(56);
        list.append(30);
        list.append(70);
        log.info("printing list 4 with appended items");
        list.print();
        log.info("deleting first node");
        int deletedItem = list.pop();
        if (deletedItem == -1) {
            log.info("list is empty");
        } else {
            log.info(deletedItem + " is deleted");
            log.info("list after deleting " + deletedItem);
            list.print();
        }
    }

    public void demonstrateDeleteLastNode() {
        list = new LinkedList<Integer>();
        list.append(56);
        list.append(30);
        list.append(70);
        log.info("printing list 5 with appended items");
        list.print();
        log.info("deleting last node");
        int deletedItem = list.popLast();
        if (deletedItem == -1) {
            log.info("list 5 is empty");
        } else {
            log.info(deletedItem + " is deleted");
            log.info("list 5 after deleting " + deletedItem);
            list.print();
        }
    }

    public void demonstrateSearchItem() {
        list = new LinkedList<Integer>();
        list.append(56);
        list.append(30);
        list.append(70);
        log.info("printing list 6 with appended items");
        list.print();
        int item=30;
        log.info("searching item"+item);
       Node<Integer> node= list.searchItem(item);
       if(node==null){
        log.info("item "+item+ " not found");
       }else{
        log.info("item "+item+ " found");
       }
    }

    public static void main(String[] args) {
        App app = new App();
        app.demonstrateAddNode();
        app.demonstrateAppendNode();
        app.demonstrateInsertNode();
        app.demonstrateDeleteFirstNode();
        app.demonstrateDeleteLastNode();
        app.demonstrateSearchItem();
    }
}
