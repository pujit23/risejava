/*import java.util.*;
public class Main{
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
           static int max(int a,int b){
               return(a>=b)?a:b;
           }
           static int height (Node node) {
               if (node == null) {
                   return 0;
               } else {
                   return (1 + max(height(node.left), height(node.right)));
               }
           }
               static  boolean isBalanced(Node node){
                    int lh, rh;
                    if (node == null){
                        return true;
               }
                    if (!isBalanced(node.left)|| !isBalanced(node.right)){
                        return false;
                    }
                    lh = height(node.left);
                    rh = height(node.right);
                    return (Math.abs(lh-rh)<=1);

           }
           static Node insert(Node node, int data){
        if (node == null){
            return new Node (data);
        }
        if (data<node.data){
            node.left=insert(node.left,data);
        }
        else if(data>node.data) {
             node.right = insert(node.right,data);
        }
        return node;

           }
           public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n ,x;
        Node root = null ;
        n = sc.nextInt();
        for (int i =0 ; i<n;i++){
             x  = sc.nextInt();
             root = insert(root,x);
        }
        if (isBalanced(root)){
            System.out.println("The binary tree is height-balanced");
        }
        else {
            System.out.println("The binary tree is not balanced");
        }

    }
}*/

import java.util.Scanner;
import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Main {
    static Node newNode(int data) {
        return new Node(data);
    }

    static Node insert(Node node, int data) {
        if (node == null) return newNode(data);
        if (data < node.data)
            node.left = insert(node.left, data);
        else if (data > node.data)
            node.right = insert(node.right, data);
        return node;
    }

    static Node lca(Node root, int n1, int n2) {
        if (root == null) return null;
        if (root.data > n1 && root.data > n2) return lca(root.left, n1, n2);
        if (root.data < n1 && root.data < n2) return lca(root.right, n1, n2);
        return root;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        int n = sc.nextInt();
        int r = sc.nextInt();
        root = insert(root, r);
        for (int i = 1; i < n; i++) {
            r = sc.nextInt();
            insert(root, r);
        }

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        Node t = lca(root, n1, n2);
        System.out.println(t.data);
    }
}





