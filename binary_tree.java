
import java.util.LinkedList;
import java.util.Queue;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Umar Malik
 */
public class binary_tree {
    Node root;
    
    public void insert(int data){
        root = insertRec(root,data);
    }
    public Node insertRec(Node root,int data){
        if(root == null){
            root = new Node(data);
        }
        else if(data<root.data){
            root.left = insertRec(root.left,data);
        }else{
            root.right = insertRec(root.right,data);
        }
        return root;
    }
    
    public boolean isEmpty(){
        return root== null;
    }
     public void count(){
         if(root == null){
             System.out.println(" it's empty "); return;
         }
         int count = 0;
         Queue<Node> queue = new LinkedList<>();
         queue.add(root);
         while(!queue.isEmpty()){
             Node current = queue.poll();
             ++count;
             if(current.left != null){
                 queue.add(current.left);
             }
             if(current.right != null){
                 queue.add(current.right);
             }
         }
         System.out.print("\n Total nodes: ");
         System.out.print(count);
         //return count; 
     }
    
    //Inorder 
    public void inorder(){
        inorderRec(root);
    }
    public void inorderRec(Node root){
    if(root != null){
        inorderRec(root.left);
        System.out.print(root.data+" ");
        inorderRec(root.right);
    }    
    }
    
   public void preorder(){
        preorderRec(root);
    }
    public void preorderRec(Node root){
        if(root != null){
            System.out.print(root.data+" ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }
    
    
    public void postorder(){
        postorderRec(root);
    }
    public void postorderRec(Node root){
        if(root!= null){
            preorderRec(root.left);
            preorderRec(root.right);
            System.out.print(root.data+" ");
        }
    }
    
    public void levelorder(){
     int height = treeHeight(root);
     for(int i=0; i<= height; i++){
         CurrentLevel(root,i);
     }
        System.out.print(" ");
    }
    private int treeHeight(Node node){
        if(node == null) return 0;
        return 1+Math.max(treeHeight(node.left),treeHeight(node.right));
    }
    private void CurrentLevel(Node node,int level){
        if(node == null) return;
        if(level == 1) System.out.print(node.data+" ");
        else{
            CurrentLevel(node.left,level-1);
            CurrentLevel(node.right,level-1);
        }
    }
    
   
 
}

class Node{
    int data;
    Node left;
    Node right;
    Node (int data){
        this.data = data;
        
    }
}

