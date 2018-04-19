/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author asadj
 */
public class Linked {
    
    Node root;
    
    
    public Linked(){
    
        root=null;
        
    }
    
    
    public boolean isEmpty(){
    
        return (root==null);
    
    }
    
    
    public void insertatFirst(int data){
        
        Node temp=new Node(data);
        temp.Next=root;
        root=temp;
 
    }
    
    
    public Node deleteatfirst(){
    
     Node temp=root;   
     root=root.Next;
    
     return temp;
    }
    
    
    public Node find(int value){
    
    Node temp=root;
    
    
    while(temp != null){
    
        if (temp.data==value) {
            
            return temp;
        }
        else
            temp=temp.Next;
    
    
    }
        return null;
    }
    
    
    public Node deleteat(int data){
    
      Node temp=root;  
      Node previous=null;
        
        while (temp != null) {            
            
            if (temp.data == data) {
             
                previous.Next=temp.Next;
                return temp;
                
            }
            else{
                previous=temp;
                temp=temp.Next;
            }
            
        }
    
    
    return null;
    
    }
    
    
    public void append(int data){
    
        Node TobeInsert=new Node(data);
        Node temp=root;
        
        while (true) {   
            
            if (temp.Next==null) {
               temp.Next=TobeInsert;
               break;
            }
            temp=temp.Next;
        }
        
        
        
        
        
    
    
    
    }
    
    
    
    
    
    
    
    
    
    public void insertafter(int data,int value)
    {
        
        Node Tobeinsert=new Node(data);
        Node current=root;
        
      while(current.data != value)
      {
             
        current=current.Next;

      }  
      
      Tobeinsert.Next=current.Next;
      current.Next=Tobeinsert;
      
        
    
    }
    
}
