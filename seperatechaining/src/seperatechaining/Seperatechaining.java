/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seperatechaining;

import java.util.Scanner;

/**
 *
 * @author Omar Faheem
 */
public class Seperatechaining {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
         Scanner sc = new Scanner(System.in);
        int size, aKey, n;
        node data;
        
        System.out.println("Enter size of Hash Table?");
        size = sc.nextInt();
        
        HashTable hash = new HashTable(size);
        
        AGAIN:
        for (int i = 0; i < 20; i++) 
        {  
        
        System.out.println("\nTo INSERT enter i \nTo FIND enter f \nTo DELETE enter d \nTo DISPLAY enter s \nTo EXIT enter e\n");
        String c;
        c = sc.next();
        
        switch(c)
        {
            case "s":
            {
                hash.displayTable();
                continue;
              //  break;
            
            }
            
            case "i":
            {
                System.out.println("Enter value");
                aKey = sc.nextInt();
                data = new node(aKey);
                hash.insert(data);
                continue;
                //break;
            }
            
            case "f":
            {
                System.out.println("Enter value to find");
                n = sc.nextInt();
                hash.find(n);
                continue;
            }
            
            case "d":
            {
                System.out.println("Enter value to delete");
                n = sc.nextInt();
                hash.delete(n);
                continue;
            }
            case "e":
                break AGAIN;
              //  break;
                
            default:
                System.out.println("Wrong choice");
                continue;
               // break;
        
         }
       }
    }
    
    }

