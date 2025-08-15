package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
       // ll.displayForward();
        ll.insertLast(1);
        ll.insertLast(2);
        ll.insertLast(4);
        ll.displayForward();
        LinkedList ll1 = new LinkedList();
        ll1.insertFirst(5);
        ll1.insertLast(1);
        ll1.insertLast(3);
        ll1.insertLast(4);
        //LinkedList newLL = LinkedList.merge(ll,ll1) ;
        //System.out.println(ll1.getNode(0));
        ll1.bubbleSort();
        ll1.displayForward();





       //ll.deleteFirst();
       //ll.displayForward();
       //ll.displayBackward();


    }
}