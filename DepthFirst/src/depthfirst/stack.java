/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depthfirst;

/**
 *
 * @author Omar Faheem
 */
public class stack {
    private int maxSize;
    private int[] stackArray;
    private int top;
    
    public stack()
    {
        this.maxSize=0;
        this.stackArray=null;
    }
    public stack(int maxSize)
    {
        this.maxSize=maxSize;
        stackArray= new int[maxSize];
        top=-1;
    }
    public int getmaxSize()
    {
        return maxSize;
    }
    public int[] getstackArray()
    {
        return stackArray;
    }
    
    public int gettop()
    {
        return top;
    }
    public void setmaxSize(int maxSize)
    {
        this.maxSize=maxSize;
    }
    public void setstackArray(int[] stackArray)
    {
        this.stackArray=stackArray;
    }
    public void settop(int top)
    {
        this.top=top;
    }
    public void push(int val)
    {
        stackArray[++top]=val;
    }
    public int pop()
    {
        return stackArray[top--];
    }
    public boolean isEmpty()
    {
        return top==-1;
    }
    public int peek()
    {
        return stackArray[top];
    }
}
