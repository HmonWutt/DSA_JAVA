package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertFirst(3);
        ll.insertFirst(5);
        ll.insertLast(99);
        ll.display();
        ll.insertAtIndex(100,0);
        ll.display();
        ll.insertAtIndex(30,3);
        ll.display();
        ll.deleteFirst();
        ll.deleteLast();
        ll.display();


    }
}