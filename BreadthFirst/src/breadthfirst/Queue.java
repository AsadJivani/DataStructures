/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breadthfirst;

/**
 *
 * @author asadj
 */
public class Queue {
    
    int size;
    int[] queArray;
    int front;
    int rear;
    
    public Queue(int size){
        this.size=size;
        queArray=new int[this.size];
        front=0;
        rear=-1;

    }
    
    public void insert(int value){
    
        if (rear==size-1) {
            rear=-1;
        }
        queArray[++rear]=value;
    
    
    }
    
    
    public int delete(){
    
        int temp=queArray[front++];
        
        if (front==size) {
            front=0;
        }
    
    return temp;
    }
    
    
    public boolean isEmpty(){
    
    return (rear+1==front || front+size-1==rear );
    
    }
    
    
}
