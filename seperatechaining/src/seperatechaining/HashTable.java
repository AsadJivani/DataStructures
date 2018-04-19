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
public class HashTable {
    
    public int arraySize;
    public int nItems;
    public linkList[] hashArray;
    
    public HashTable(int size)
    {
        this.arraySize=size;
        hashArray= new linkList[arraySize];
        this.nItems=0;
        for(int i=0; i< arraySize;i++)
        {
            hashArray[i]= new linkList();
        }
    }
    public void displayTable()
    {
        for(int i=0; i <arraySize;i++)
        {
            System.out.println(i+",");
            hashArray[i].displayList();
        }
    }
    public int hashFunc(int data)
    {
        return data %= arraySize;
    }
    public void insert(node item)
    {
        int data=item.getdata();
        int key=hashFunc(data);
        
        hashArray[key].insert(data);
    }
    public node find(int data)
    {
        node temp;
        int key=hashFunc(data);
        temp=hashArray[key].find(data);
        return temp;
    }
    public void delete(int data)
    {
        int key=hashFunc(data);
        hashArray[key].delete(data);
    }
            
    
    
}
