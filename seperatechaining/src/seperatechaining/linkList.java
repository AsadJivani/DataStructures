/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seperatechaining;

/**
 *
 * @author Omar Faheem
 */
public class linkList {
    
    private node head;
    
    public void linkList()
    {
        this.head=null;
    }
    public boolean isEmpty()
    {
        return this.head==null;
    }
    
    public void insert(int data)
    {
        node newNode = new node(data);
        node current=this.head;
        node previous=null;
        if(current != null && current.getdata()< data)
        {
            previous=current;
            current=current.getnextNode();
        }
        if(previous == null)
        {
            this.head=newNode;
        }
        else
        {
            previous.setnextNode(newNode);
            newNode.setnextNode(current);
        }
    }
    
    public void delete(int data)
    {
        node current=this.head;
        node previous=null;
        while(current != null && current.getdata() != data)
        {
            previous=current;
            current=current.getnextNode();
        }
        if(previous == null)
        {
            this.head=this.head.getnextNode();
        }
        else if(current == null)
        {
            System.out.println("item not found\n");
        }
        else
        {
            previous.setnextNode(current.getnextNode());
        }
    }
    
    public node find(int data)
    {
        node current=this.head;
        node previous=null;
        
        while(current != null && current.getdata() <= data)
        {
            if(current.getdata()==data)
            {
                System.out.println("FOUND\n");
                return current;
            }
            current=current.getnextNode();
        }
        return null;
    }
    
    public void displayList()
    {
        node current=this.head;
        System.out.println("list (1st- last)");
        while(current != null)
        {
            current.diplayNode();
            current=current.getnextNode();
        }
        System.out.println("");
    }
            
}
