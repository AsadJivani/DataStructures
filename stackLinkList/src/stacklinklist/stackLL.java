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
public class stackLL {
    
    linkList list;
    
    public stackLL()
    {
        this.list=new linkList();
    }
    public void push(int data)
    
    {
        
        if (list.isEmpty()) {
        list.insertAtHead(data);    
        
        }
        else
           list.append(data);
        
    }
    public int pop()
    {
        int temp=list.gethead();
        list.deletAtHead();
        return temp;
    }
    public int peek()
    {
        return list.gethead();
    }
    
    public boolean isEmpty()
    {
        if(list.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
