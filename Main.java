/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Umar Malik
 */
public class Main {
   
        

    public static void main(String []args){
        binary_tree obj = new binary_tree();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.insert(50);
        obj.count();
        obj.insert(60);
        obj.insert(70);
        obj.insert(80);
        obj.insert(90);
        obj.insert(100);
        obj.count();
        System.out.print("\n In-order traversal: ");
        obj.inorder();
        System.out.print("\n Pre-order traversal:");
        obj.preorder();
        System.out.print("\n Post-order traversal: ");
        obj.postorder();
        System.out.print("\n Level-order traversal: ");
        obj.levelorder();
    }
            
}




