package org.example;

public class LinkedList{
   private Node head;
   private Node tail;
   private int size;

   public void insertFirst(int value){
       Node newNode = new Node(value);
       if (this.head == null){
           this.head = newNode;
           this.tail = newNode;
           this.size++;
           return;

       }
       newNode.next = this.head;
       this.head = newNode;
       this.size ++;
   }
   public void insertLast(int value) {
       Node newNode = new Node(value);
       if (head == null){
           insertFirst(value);
           return;
       }
       this.tail.next = newNode;
       this.tail = newNode;
       this.size++;
   }
   public void insertMiddle(int value,int index){
       if (index == 0){
           insertFirst(value);
       }
       else if (index == this.size) insertLast(value);
       else{
           Node temp = this.head;
           Node current = temp;
           int tempIndex = 0;
           while (temp !=null && tempIndex <  index){
               current = temp;
               temp = temp.next;
           }
           Node newNode = new Node(value);
           current.next = newNode;
           newNode.next = temp;
           this.size++;
       }
   }
   public void deleteFirst(){
       if (this.head != null) {
           this.head = this.head.next;
           if (this.head == null) {
               this.tail = null;
           }
           this.size--;
       }
   }
   public void deleteLast(){
       if (this.tail != null){
           if (this.head == this.tail) {
               deleteFirst();
               return;
           }
           Node temp = this.head;
           Node previous = temp;
           int index = 0;
           while (temp != null && index <=this.size -2){
               previous = temp;
               temp = temp.next;
               index+=1;

           }
           if (previous !=null) {
               previous.next = null;
               this.tail = previous;
               this.size--;
           }


       }
   }
   public void deleteMiddle(int index){
       if (index==0) {
           deleteFirst();
           return;
       }
       if (index == this.size-1){
           deleteLast();
           return;
       }
       Node temp = this.head;
       for (int i =1; i < index && temp!=null;i++){
           temp = temp.next;
       }
       if (temp != null && temp.next !=null){
           temp.next = temp.next.next;
       }
   }
   public void displayForward(){
       Node temp = head;
       while(temp !=null){
           System.out.print(temp.value + "-->");
           temp = temp.next;
       }
       System.out.println("END");
   }
   public class Node{
       private int value;
       private Node next;

       Node (){

       }
       Node (int value){
           this.value = value;
       }

       Node (int value, Node next){
           this.value = value;
           this.next = next;
       }
   }
}