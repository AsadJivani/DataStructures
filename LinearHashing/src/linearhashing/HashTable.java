/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearhashing;

/**
 *
 * @author Omar Faheem
 */
public class HashTable {
    
    private int arraySize;
    private DataItem[] hashArray;
    private DataItem nonItems;
    private int nItems;
    
    public HashTable(int size)
    {
        this.arraySize=size;
        hashArray=new DataItem[arraySize];
        nonItems=new DataItem(-1);
        this.nItems=0;
    }
    public boolean isFull()
    {
        return nItems==arraySize;
    }
    public void display()
    {
        //System.out.println("TABLE:\n");
        for(int i=0; i< arraySize; i++)
        {
            if(hashArray[i] != null)
            System.out.println(hashArray[i].getdata()+" ");
            
            else
            {
                System.out.println("** ");
            }
        }
        System.out.println("");
    }
    
    public int hashFunc(int data)
    {
        return data %= arraySize;
    }
    public void insert(DataItem item)
    {
        if(!isFull())
        {
        int data= item.getdata();
        int key= hashFunc(data);
        
        while(hashArray[key] != null && hashArray[key].getdata() != -1)
        {
            ++key;
            key %= arraySize;
        }
        hashArray[key]=item;
        nItems++;
        }
        else
        {
            System.out.println("ARRAY FULL\n");
        }
    }
    
    public void delete(int data)
    {
        int key= hashFunc(data);
        int count=0;
        boolean delflag= false;
        
        while(count < arraySize && hashArray[key] != null)
        {
            if(hashArray[key].getdata() == data)
            {
                hashArray[key] = this.nonItems;
                System.out.println("Deleted successfully");
                delflag = true;
                this.nItems --;
                break;
            }
            ++key;
            key %= arraySize;
            count++;
        }
        if(!delflag)
        {
            System.out.println("item not found\n");
        }
    }
    public void find(int data)
    {
        int key = hashFunc(data);
        int count=0;
        boolean foundflag = false;
        while(count < arraySize && hashArray[key] != null)
                {
                    if(hashArray[key].getdata()==data)
                    {
                        System.out.println("FOUND\n");
                        foundflag=true;
                        break;
                    }
                        ++key;
                        key %= arraySize;
                        count++;
                }
        if(!foundflag)
        {
            System.out.println("item not found\n");
        }
    }
}
