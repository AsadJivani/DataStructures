/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringreversestack;

/**
 *
 * @author Omar Faheem
 */
public class reverse {
    
    private String input;
    private String output;
    
    public String getinput()
    {
        return input;
    }
    public String getoutput()
    {
        return output;
    }
    public void setinput(String input)
    {
     this.input=input;
    }
    public void setoutput(String output)
    {
        this.output=output;
    }
    public reverse()
    {
        this.input=null;
        this.output=null;
    }
    public reverse(String input)
    {
        this.input=input;
        this.output=" ";
    }
    public String doRev(String input)
    {
        stack stackX = new stack(input.length());
        
        for(int i =0; i < input.length();i++)
        {
            stackX.push(input.charAt(i));
        }
        for(int i=0;i<input.length();i++)
        {
            char ch;
            ch= stackX.pop();
        
        output=output+ch;
        }
        return output;
    }
}
