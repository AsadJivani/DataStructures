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
public class node {
    
    private int data;
    private node nextNode;
    
    public node(int data)
    {
        this.data=data;
        this.nextNode=null;
    }

    
    public node getnextNode()
    {
        return nextNode;
    }
    public void setnextNode(node nextNode)
    {
        this.nextNode=nextNode;
    }
    public int getdata()
    {
        return this.data;
    }
    public void setdata(int data)
    {
        this.data=data;
    }
    
    public void diplayNode()
    {
        System.out.println("DATA :"+this.getdata());
    }
    
    
}
