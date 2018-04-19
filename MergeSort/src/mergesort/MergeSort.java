/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

/**
 *
 * @author Omar Faheem
 */
public class MergeSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] array = new int[10];
        array[0]= 8;
        array[1]= 45;
        array[2]= 1;
        array[3]= 14;
        array[4]=24;
        array[5]=54;
        
        array[6]=8;
                array[7]=47;
                        array[8]=124;
                                array[9]=0;
                                
                                
                                merge merger = new merge();
                                merger.display(array);
                                System.out.println("\n");
                                merger.sort(array, 0, 9);
                                merger.display(array);
    }
    
}
