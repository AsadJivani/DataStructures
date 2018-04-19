/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtable;

/**
 *
 * @author asadj
 */

public class HashList {

    DataItem[] Hashlist;
    int Size;
    int nCount;
    
    
    
    public HashList(int Size){
    
        this.Size=Size;
        Hashlist=new DataItem[Size];
        nCount=0;
    
    
    }
    
    
    
    public boolean isFull(){
    
    return (nCount==Size);
    
    }
    
    public boolean isEmpty(){
    
    return (nCount==0);
    
    }
    public int getkey(int data){
    
        int key=data%Size;
    
        return key;
    }
    
    
    
    public void insert(int data){
    
        int key=getkey(data);
        if (!isFull()) {
            
        
        while (Hashlist[key] != null) {            
            
            key++;
            key=key%Size;
        
            
        }
        DataItem tobeinsert=new DataItem(data);
        Hashlist[key]=tobeinsert;
        System.out.println("Inserted Succesfully");
      }else
            System.out.println("Hashtable is full");
        
    }
    
    
    public void delete(int data){
    
        int key=getkey(data);
        int count=0;
        boolean isdel=false;
        
        while(nCount>key && Hashlist[key] != null) {
                
                if(Hashlist[key].data==data)
                  {            
           
                      Hashlist[key].data=-1;
                      isdel=true;
                      nCount--;
                      System.out.println("Deleted Successfully");
                      break;
                      
                      
                  }
                
                key++;
                key=key%Size;
                count++;
        }
        
            if (!isdel) {
                System.out.println("not found");
        }
        
        
    
    
    
    }
    
    
}
