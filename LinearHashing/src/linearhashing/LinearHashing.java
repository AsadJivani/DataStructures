/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearhashing;

import java.util.Scanner;

/**
 *
 * @author Omar Faheem
 */
public class LinearHashing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int size, keysPercell, item,n;
        DataItem data;
        
        System.out.println("enter size of hashtable\n");
        size=sc.nextInt();
        
        HashTable hash = new HashTable(size);
        
        wapis:
        for(int i=0; i< 20; i++)
        {
            System.out.println("MENU\n");
            System.out.println("TO :\n 1) INSERT : ENTER i \n 2) DISPLAY : ENTER s \n 3) DELETE : ENETER d \n 4) FIND : ENTER F \n 5) EXIT : ENTER e \n");
            String c;
            c= sc.next();
            
            switch(c)
            {
                case "s":
                {
                    hash.display();
                    continue;
                }
                case "i":
                {
                    System.out.println("ENTER VALUE\n");
                    item=sc.nextInt();
                    data=new DataItem(item);
                    hash.insert(data);
                    continue;
                }
                case "f":
                {
                    System.out.println("ENTER VALUE TO FIND\n");
                    n=sc.nextInt();
                    hash.find(n);
                    continue;
                }
                case "d":
                {
                    System.out.println("ENTER VALUE TO DELETE\n");
                    n=sc.nextInt();
                    hash.delete(n);
                    continue;
                }
                case "e":
                {
                    break wapis;
                }
                
                default:
                    System.out.println("wrong choice");
                    continue;
        }
        
    }
    
}
}