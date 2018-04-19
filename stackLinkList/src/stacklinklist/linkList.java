/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacklinklist;

/**
 *
 * @author Omar Faheem
 */
public class linkList {
    
    private node head;
    
    public linkList()
    {
        this.head=null;
    }
    
    public boolean isEmpty()
    {
        return this.head==null;
    }
    public void insertAtHead(int data)
    {
        node newNode = new node(data);
        newNode.setnextNode(this.head);
        this.head=newNode;
    }
    public int length()
    {
        int length=0;
        if(this.isEmpty())
        {
            System.out.println("link list is empty");
            
        }
        else
        {
            node current = this.head;
            while(current != null)
            {
                length++;
                current=current.getnextNode();
            }
            
        }
        return length;
    }
    public node deletAtHead()
    {
        if(this.isEmpty())
        {
            System.out.println("link list is empty");
        }
        else
        {
//            node current = this.head;
//            while(current != null)
//            {
//                this.head=current.getnextNode();
//            }
//            return current;
            this.head=head.getnextNode();
            
        }
        return null;
    }
    public node find(int data)
    {
        if(this.isEmpty())
        {
            System.out.println("link list is empty");
        }
        else
        {
            node current = this.head;
            while(current != null)
            {
                if(current.getdata()==data)
                {
                    System.out.println("FOUND/n");
                }
                else
                {
                    current= current.getnextNode();
                }
            }
        }
        System.out.println("not found/n");
        return null;
    }
    public void displayList()
    {
        if(this.isEmpty())
        {
            System.out.println("link list is empty");
        }
        else
        {
            node current= this.head;
            while(current != null)
            {
                current.displayNode();
                current = current.getnextNode();
            }
        }
    }
    public void append(int data)
    {
        node newNode = new node(data);
        if(this.isEmpty())
        {
            this.head=newNode;
        }
        else
        {
            node current = this.head;
        while(current.getnextNode() != null)
        {
            current= current.getnextNode();
        }
        current.setnextNode(newNode);
    }
}
    public node delete(int data)
    {
        node current = this.head;
        node previous = this.head;
        
        if(this.isEmpty())
        {
            System.out.println("link list is empty");
        }
        else
        {
            while(current != null)
            {
             
                
                    previous.setnextNode(current.getnextNode());
                    System.out.println("deleted");
                    return current;
            }
             previous=   current;
             current = current.getnextNode();
            }
        System.out.println("not found");
        return null;
        }
    public void insertAt(int key, int data)
    {
        if(this.isEmpty())
        {
            System.out.println("link list is empty");
        }
        else
        {
            node current = this.head;
            while(current != null)
            {
                   
            if(current.getdata()==key)
            {
             current.setdata(data);
            }
            current=current.getnextNode();
        }
    }
}
    public void insertAfter(int data, int key)
    {
        node current = this.head;
        node newNode = new node(data);
        if(this.isEmpty())
        {
            System.out.println("link ist is empty");
        }
        else
        {
            while(current != null)
            {
                if(current.getdata()==key)
                {
                    newNode.setnextNode(current.getnextNode());
                    current.setnextNode(newNode);
                    return;
                }
                current=current.getnextNode();
            }
        }
        System.out.println("key not found");
    }
    public int gethead()
    {
        return this.head.getdata();
    }
}

