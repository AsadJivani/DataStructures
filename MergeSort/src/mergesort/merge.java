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
public class merge {
    public void sort(int[] array,int start, int end)
    {
        mergesortt(array, start,end);
    }

    private void mergesortt(int[] array, int start, int end)
    {
        
        if(end <= start)
            return;
        
        int mid = (start+end)/2;
        mergesortt(array, start, mid);
        mergesortt(array,mid+1,end);
        mergee(array,start,mid,end);
        
    }

    private void mergee(int[] array, int start, int mid, int end) {
        
        int n1= (mid-start)+1;
        int n2= (end-mid);
        
        int[] left= new int[n1];
        int[] right= new int[n2];
        
        for(int i=0; i < n1 ; i++)
        {
            left[i]=array[start+i];
        }
        
        for(int j=0; j < n2; j++)
        {
            right[j]= array[mid+1+j];
        }
        
         int i=0,j=0,k=start;
                
                while(i< n1 && j < n2)
                {
                    if(left[i] <= right[j] )
                    {
                        array[k]= left[i];
                        i++;
                    }
                    else
                    {
                        array[k]= right[j];
                        j++;
                    }
                    k++;
                }
                
                while(i < n1)
                {
                    array[k]=left[i];
                    i++;
                    k++;
                }
                while(j < n2)
                {
                    array[k]= right[j];
                    j++;
                    k++;
                }
    }
    public void display(int array[])
    {
        int n = array.length;
        for(int i=0; i < n; i++)
        {
            System.out.println(array[i]+" ");
            
        }
    }
}
