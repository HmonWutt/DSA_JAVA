package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertFirst(1);
        ll.deleteFirst();
        ll.insertLast(2);

        ll.insertMiddle(3,0);
        ll.displayForward();
        ll.deleteLast();
        ll.insertLast(5);
        ll.insertLast(6);
        ll.insertFirst(0);
        ll.displayForward();
        ll.deleteMiddle(3);
        ll.displayForward();



    }
}