package org.example;

class LinkedList{
   private Node head;
   private Node tail;
   private int size;
   public void displayForward(){
       Node temp = this.head;
       while (temp !=null){
            System.out.print(temp.value+"->");
            temp = temp.next;

       }
       System.out.println("END");
   }

   public void displayBackward(){
       Node temp = tail;
       System.out.print("Start");
       while (temp!=null) {
           System.out.print("<-"+temp.value);
           temp = temp.previous;
       }
       System.out.println();
   }
   public void insertFirst(int value){

       Node new_node = new Node(value);

      // head.previous = new_node;
       new_node.next = head;
       head = new_node;
       size++;
       if (tail == null){
           tail = head;
       }
   }
   public void deleteFirst() {
       head = head.next;
       head.next.previous = null;
       if (head == null) {
           tail = null;
       }
       size--;
   }
   public void deleteLast() {
       if (tail == head){
           head=null;
           size--;
           return;

       }
       Node temp = head;
       for (int i = 1; i < size - 1; i++) {
            temp = temp.next;
        }
       temp.next = null;
       tail = temp;
       size--;
   }
   public void insertLast(int value) {
        if (tail == null){
            insertFirst(value);
            return;
        }
        Node new_node = new Node(value);
        tail.next = new_node;
       // tail.previous = tail;
        tail = new_node;
        size++;
   }
   public void insertAtIndex(int value,int index) {
       if (index == 0) {
           insertFirst(value);
           return;
       }
       if (index == size ) {
           insertLast(value);
           return;
       }

       Node temp = head;
       for (int i = 1; i < index; i++) {
            temp = temp.next;
       }
       Node new_node = new Node(value,temp.next,temp);
       temp.next = new_node;
       size++;
   }
   public void deleteAtIndex(int index) {
       if (index == 0) deleteFirst();
       if (index == size - 1) deleteLast();
       Node temp = head;
       for (int i = 1; i < index; i++) {
           temp = temp.next;
       }
       temp.next = temp.next.next;
       temp.next.next.previous = temp;
       size--;
   }
   public static LinkedList merge(LinkedList list1,LinkedList list2){

       LinkedList newList = new LinkedList();
       Node head1 = list1.head;
       Node head2 = list2.head;
       while (head1!=null & head2!=null){
           if (head1.value < head2.value){
               newList.insertLast(head1.value);
               head1 = head1.next;

           }
           else{
               newList.insertLast(head2.value);
               head2 = head2.next;
           }
       }
       if (head1 == null){
           while (head2!=null){
               newList.insertLast(head2.value);
               head2 = head2.next;

           }
       }
       if (head2 ==null){
           while (head1!=null){
               newList.insertLast(head1.value);
               head1 = head1.next;
           }
       }
       return newList;

   }
   public Node getNode(int index){
       Node temp = head;
       for (int ind=0;ind<index;ind++){
            temp = temp.next;
      }
       return temp;
   }
   public void bubbleSort(){
       Node first;
       Node second;
       Node previous = null;
       for (int row=size-1; row >-1;row--){
           for (int col = 0; col <row; col++){
               first = this.getNode(col);
               second = this.getNode(col+1);

               if (first.value > second.value){
                   if (first == head){
                       head = second;
                       first.next = second.next;
                       second.next = first;
                   }
                   else {

                       previous.next = second;
                       first.next = second.next;
                       second.next = first;
                   }
               }

               previous = second;
           }
       }
       this.displayForward();
   }
   private class Node{
           private int value;
           private Node next;
           private Node previous;
           private Node(int value){
               this.value = value;
           }

           private Node(int value, Node next){
               this.value = value;
               this.next = next;
           }

           private Node(int value,Node next, Node previous){
               this.value = value;
               this.next = next;
               this.previous = previous;
           }
       }
   }
