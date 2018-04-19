/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author asadj
 */
public class LinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Linked Mylinked=new Linked();
        
        Mylinked.insertatFirst(7);
        Mylinked.insertatFirst(9);
        Mylinked.insertatFirst(12);
        Mylinked.insertatFirst(17);
        Mylinked.insertatFirst(13);
        Mylinked.insertafter(4, 13);
        Mylinked.append(18);
        System.out.println(Mylinked.find(12).data);
        Mylinked.deleteat(12);
        System.out.println("done");
        
        
    }
    
}
