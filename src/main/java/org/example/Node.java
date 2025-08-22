package org.example;

import java.util.Scanner;

public class Node {
     int val;
     Node left;
     Node right;
     public Node(int val){
         this.val = val;
     }
     public void insertLeft(int val){
         Node temp = new Node(val);
         this.left = temp;
     }
     public void insertRight(int val){
         Node temp = new Node(val);
         this.right = temp;
     }
     public void display(Node root, int lvl){
         if (root == null) return;
         display(root.right,lvl+1);

         if (lvl == 0){
             System.out.println(root.val);
         }
         else {
             for (int i =1; i < lvl; i++){
                 System.out.print("           ");

             }
             System.out.println("|-------->"+root.val+"|");
         }
         display(root.left,lvl+1);

     }
     public static Node growTree(Scanner scanner,Node root){
         System.out.println("current root: "+root.val);
         System.out.println("Add left leaf?");
         boolean choice = scanner.nextBoolean();
         if (choice){
             System.out.println("Enter value: ");
             int left = scanner.nextInt();
             root.left = new Node(left);
             growTree(scanner,root.left);

         }
         System.out.println("current root: "+root.val);
         System.out.println("Add right leaf?");
         choice = scanner.nextBoolean();
         if (choice){
             System.out.println("Enter value: ");
             int right = scanner.nextInt();
             root.right = new Node(right);
             growTree(scanner,root.right);
         }
         return root;
     }

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter value: ");
         int val = scanner.nextInt();
         Node root= new Node(val);
         Node.growTree(scanner,root);
         root.display(root,0);

    }
}
