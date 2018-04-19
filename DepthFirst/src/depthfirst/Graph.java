/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depthfirst;

/**
 *
 * @author asadj
 */
public class Graph {
    
   Vertex vertexList[];
   int adj[][];
   int nVerts;
   stack theStack;
   
   
   
    public Graph(){
    
    vertexList=new Vertex[20];
    adj=new int[20][20];
    nVerts=0;
    
        for (int i = 0; i < 20; i++) {
              for (int j = 0; j < 20; j++) {
                adj[i][j]=0;     
            }
        }
    theStack=new stack(20);
        

    }
    
    public void addvertex(char lable){
    
        vertexList[nVerts++]=new Vertex(lable);
    
    }
    
    public void addEdge(int start,int end){
        
        adj[start][end]=1;
        adj[end][start]=1;
    
    }
    
    public void displayVertex(int v){
    
        System.out.println(vertexList[v].label);
    }
    
    
    
    public int getAdjUnvisitedVertex(int v){
    
        for (int i = 0; i < nVerts; i++) {
            if (adj[v][i]==1 && vertexList[i].wasVisited==false) {
                return i;
            }
        }
         return -1;
    
    }
    public void dfs(){
    
    vertexList[0].wasVisited=true;
    displayVertex(0);
    theStack.push(0);
    
        while (!theStack.isEmpty()) {    
            
            int v=getAdjUnvisitedVertex(theStack.peek());
            if (v == -1) {
                
                theStack.pop();
            }
            
            else{
            
                vertexList[v].wasVisited=true;
                displayVertex(v);
                theStack.push(v);
           
            }
         }
        
            for (int i = 0; i < nVerts; i++) {
                   vertexList[i].wasVisited=false;
          }
        
            
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}

