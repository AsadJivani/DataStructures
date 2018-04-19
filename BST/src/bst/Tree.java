/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

/**
 *
 * @author asadj
 */
public class Tree {
    
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
    
    public Node find(int data){
    
    Node current=root;
    
    while(current.data!=data){
        
        if (current.data>data) {
            
            current=current.lchild;
        }
        else if (current.data<data) {
            current=current.rchild;
        }
        
        if (current==null) {
            
            return null;
        }
    
    }
         return current;
        
        
        
    }
    
    public void insert(int data){
    
        Node NewNode=new Node();
        NewNode.data=data;
        
        Node current=root;
        
        while(true){

            Node currentroot=current;
            
            if (root==null) {
                
                root=NewNode;
                break;
            }
            else{
            
                if (current.data>data) {
                    
                    current=current.lchild;
                     
                    if (current==null) {

                        currentroot.lchild=NewNode;
                        break;
                    }
                
                }
                else{
                
                    current=current.rchild;
                     
                    if (current==null) {

                        currentroot.rchild=NewNode;
                        break;
                    }
                             
                }           
            }
        }
        
    
    }
    
    public boolean delete(int data){
        
 
         
    Node current=root;
    Node parent=root;
    Node Address;
    
    boolean isleft=false;
   
    while(current.data != data){
        
        parent=current;
        
        if (current.data>data) {
            
            isleft=true;
            current=current.lchild;
        }
        else if (current.data<data) {
            
            current=current.rchild;
            isleft=false;
        }
        
        if (current==null) {
            
            return false;
        }
    
    }
         Address=current;
 
        //CASE 1
         
         
        if (Address.lchild == null  && Address.rchild==null) {
            
            if(current == root)
            {
                root = null;
            }
            else if (isleft) {
                parent.lchild=null;
            }
            else  {
                parent.rchild=null;
            }
            return true;
        }
        
        
        //CASE 2
        
        if (Address.lchild == null && Address.rchild != null) {
            
            if (Address==root) {
                
                root=Address.rchild;
            }
            
            else if (isleft) {
                parent.lchild=Address.rchild;
            }
            else  {
                parent.rchild=Address.rchild;
            }
            
            return true;
        }
        
        if (Address.rchild == null && Address.lchild != null) {
            
            if (Address==root) {
                
                root=Address.lchild;
            }
            
              
            if (isleft) {
                parent.lchild=Address.lchild;
            }
            else  {
                parent.rchild=Address.lchild;
            }
            
            return true;
        }
         
        
      
      //CASE 3
         if (Address.rchild != null && Address.lchild != null) {
             Node Successor=getsuccessor(Address);
            if (Address==root) 
                   root=Successor;       
            else if (isleft) 
                parent.lchild=Successor;
            else  
                parent.rchild=Successor;
 
                Successor.lchild=Address.lchild;
            return true;
        }
         
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        return false;
        
        
    }
    
    
    public void Inorder(Node root) 
    { 
        if(root != null) 
        { 
        
        Inorder(root.lchild);
           
        System.out.print(root.data+" "); 
        
        Inorder(root.rchild);
                
        } 
     }
    
    
     
      public void postorder(Node root) 
    { 
        if(root != null) 
        { 
            
        postorder(root.lchild);
            
        postorder(root.rchild);    
        
        System.out.print(root.data+" "); 
            
       
                
        } 
     }
      
      
    private Node getsuccessor(Node node){
     
    Node Successor=node.rchild;
    Node SuccessorParent=node.rchild ;
    Node Current=node.rchild;
    
        if (node.rchild.lchild==null) 
            return node.rchild;
        else{
            while (Current != null) {                
                
                SuccessorParent=Successor;
                Successor=Current;
                Current=Current.lchild;
                
                        
            }
            
                SuccessorParent.lchild=Successor.rchild;
                Successor.rchild=node.rchild;
        }
            
            
         return Successor;   
            
} 
    
}
