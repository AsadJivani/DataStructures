/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringreversestack;

/**
 *
 * @author Omar Faheem
 */
public class stack {
    private int maxSize;
    private char[] stackArray;
    private int top;
    
    public stack()
    {
        this.maxSize=0;
        this.stackArray=null;
    }
    public stack(int maxSize)
    {
        this.maxSize=maxSize;
        stackArray= new char[maxSize];
        top=-1;
    }
    public int getmaxSize()
    {
        return maxSize;
    }
    public char[] getstackArray()
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
    public void setstackArray(char[] stackArray)
    {
        this.stackArray=stackArray;
    }
    public void settop(int top)
    {
        this.top=top;
    }
    public void push(char val)
    {
        stackArray[++top]=val;
    }
    public char pop()
    {
        return stackArray[top--];
    }
    public boolean isEmpty()
    {
        return top==-1;
    }
    public char peek()
    {
        return stackArray[top];
    }
}
