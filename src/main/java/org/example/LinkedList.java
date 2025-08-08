package org.example;

class LinkedList{
   private Node head;
   private Node tail;
   private int size;
   public void display(){
       Node temp = head;
       for (int i=0;i<size;i++){
            System.out.print(temp.value+"->");
            temp = temp.next;

       }
       System.out.println("END");
   }
   public void insertFirst(int value){

       Node new_node = new Node(value);
       if (head == null){
           head = new_node;
           tail = head;
           size++;
           return;
       }
       new_node.next = head;
       head = new_node;
       size++;
   }
   public void deleteFirst() {
       if (head != null) {
           head = head.next;
           size--;
       }
   }
   public void deleteLast() {
       if (tail!=null) {
           Node temp = head;
           for (int i = 1; i < size - 1; i++) {
                temp = temp.next;
           }
           temp.next = null;
           tail = temp;
           size--;
       }
   }
   public void insertLast(int value) {
        if (tail == null){
            insertFirst(value);
            return;
        }
        Node new_node = new Node(value);
        tail.next = new_node;
        tail = new_node;
        size++;
   }
   public void insertAtIndex(int value,int index) {
       if (index == 0) {
           insertFirst(value);
           return;
       }
       if (index == size - 1) {
           insertLast(value);
           return;
       }

       Node temp = head;
       for (int i = 1; i < index; i++) {
            temp = temp.next;
       }
       Node new_node = new Node(value);
       new_node.next = temp.next ;
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
       size--;
   }
   private class Node{
           private int value;
           private Node next;

           private Node(int value){
               this.value = value;
           }

           private Node(int value, Node next){
               this.value = value;
               this.next = next;
           }
       }
   }
