package com.javapractice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    private static final Logger log = LogManager.getLogger(App.class);
    LinkedList<Integer> list;
    Stack<Integer> stack;
    Queue<Integer> queue;
    //add new items at the start of linked list
    public void demonstrateAddNode() {

        list = new LinkedList<Integer>();
        list.add(70);
        list.add(30);
        list.add(56);//adding ll the item one by one
        log.info("printing list 1 with added items");
        list.print();
    }
    //add new items at the end of linked list
    public void demonstrateAppendNode() {
        list = new LinkedList<Integer>();
        list.append(56);
        list.append(30);
        list.append(70);
        log.info("printing list 2 with appended items");
        list.print();
    }
    //insert node at a given position in linked list
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
    //delete first node in the linked list
    public void demonstrateDeleteFirstNode() {
        list = new LinkedList<Integer>();
        list.append(56);
        list.append(30);
        list.append(70);
        log.info("printing list 4 with appended items");
        list.print();
        log.info("deleting first node");
        int deletedItem = (int)list.pop();
        if (deletedItem == -1) {
            log.info("list is empty");
        } else {
            log.info(deletedItem + " is deleted");
            log.info("list after deleting " + deletedItem);
            list.print();
        }
    }
    //delete last node in the linked list
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
    //search an item in linked list
    public void demonstrateSearchItem() {
        list = new LinkedList<Integer>();
        list.append(56);
        list.append(30);
        list.append(70);
        log.info("printing list 6 with appended items");
        list.print();
        int item = 30;
        log.info("searching item" + item);
        Node<Integer> node = list.searchItem(item);
        if (node == null) {
            log.info("item " + item + " not found");
        } else {
            log.info("item " + item + " found");
        }
    }
    //insert a node after a item in linked list
    public void demonstrateInsertNodeAfter() {
        int itemToAdd = 40;
        int itemToSearch = 30;
        log.info("printing list 6");
        list.print();

        boolean success = list.insertAfter(itemToSearch, itemToAdd);

        if (success) {
            log.info("item " + itemToSearch + "  found.added " + itemToAdd + "after it.");
        } else {
            log.info("item " + itemToSearch + " not found.unable to add " + itemToAdd);
        }
        log.info("printing list 6 after Insert operation");
        list.print();
    }
    //delete a item after a given item in linked list
    public void demonstrateDeleteItem() {
        int itemToDelete = 40;

        log.info("printing list 6");
        list.print();
        boolean success = list.delete(itemToDelete);

        if (success) {
            log.info("item " + itemToDelete + "  found. " + itemToDelete + " successfully deleted.");
        } else {
            log.info("item " + itemToDelete + " not found. unable to delete item " + itemToDelete );
        }
        log.info("printing list 6 after delete operation");
        list.print();
        int size=list.getSize();
        log.info("size of list is: "+size);
    }
    //sorting a linked list
    public void demonstrateSortedList(){
       LinkedList<Integer> list1 = new SortedLinkedList<Integer>();
        list1.add(56);
        list1.add(30);
        list1.add(70);
        list1.add(40);
        log.info("printing sorted list 7 with new items after sorting");
        list1.print();
    }
    //push a item on stack;
    public void demonstrateStackPush(){
        stack=new Stack<>();
        log.info("initialized stack");
        stack.push(70);
        stack.push(30);
        stack.push(56);
        log.info("printing pushed items in stack");
        stack.print();
    }
    //pop a item from stack
    public void demonstrateStackPop() {
        log.info("poping first item from stack");
        int removedItem=(int)stack.pop();
        log.info(removedItem+" is popped from stack");
        log.info("printing stack");
        stack.print();
    }
    //peek the first item on stack
    public void demonstrateStackPeek() {
        log.info("peeking stack");
        int top=(int)stack.peek();
        log.info(top+" is at the top of stack");
    }

    //add a item in queue;
    public void demonstrateQueueEnqueue(){
        queue=new Queue<Integer>();
        log.info("initialized queue");
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        log.info("printing enqueued items in queue");
        queue.print();
    }
    public static void main(String[] args) {
        App app = new App();
        app.demonstrateAddNode();
        app.demonstrateAppendNode();
        app.demonstrateInsertNode();
        app.demonstrateDeleteFirstNode();
        app.demonstrateDeleteLastNode();
        app.demonstrateSearchItem();
        app.demonstrateInsertNodeAfter();
        app.demonstrateDeleteItem();
        app.demonstrateSortedList();

        app.demonstrateStackPush();
        app.demonstrateStackPop();
        app.demonstrateStackPeek();

        app.demonstrateQueueEnqueue();
    }
}

