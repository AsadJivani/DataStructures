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
public class node {
    private int data;
    private node nextNode;
    
    public node()
    {
        this.data=0;
        this.nextNode=null;
    }
    public node(int data)
    {
        this.data=data;
        this.nextNode=null;
    }
    public node(int data,node nextNode)
    {
        this.data=data;
        this.nextNode=nextNode;
    }
    public int getdata()
    {
        return data;
    }
    public node getnextNode()
    {
        return nextNode;
    }
    public void setdata(int data)
    {
        this.data=data;
    }
    public void setnextNode(node nextNode)
    {
        this.nextNode=nextNode;
    }
    public void displayNode()
    {
        System.out.println(this.data);
    }
            
}
