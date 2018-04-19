/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringreversestack;


import java.util.Scanner;

/**
 *
 * @author Omar Faheem
 */
public class StringReverseStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        reverse reverser = new reverse();
        //System.out.println(reverser.doRev());
        
        System.out.println("PLEASE ENTER NAME:\n");
        Scanner sc = new Scanner(System.in);
        String data;
        data=sc.nextLine();
        System.out.println( reverser.doRev(data));
        
    }
    
}
