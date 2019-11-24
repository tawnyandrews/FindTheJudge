import java.util.*;

public class JudgeGraph{
  
    private int verticeCount; 
    private int edgeCount; 

    public ArrayList<Integer>[] adjacents; 

    //constructer for initializations
    public JudgeGraph(int verticeCount){
        this.verticeCount = verticeCount;
        this.edgeCount = edgeCount;
        adjacents = new ArrayList [verticeCount];
        
        for(int i = 0; i < verticeCount; i++){
            adjacents[i] = new ArrayList<Integer>();
        }
    }

    public void addEdge(int a, int b){ //adds in edges
        adjacents[a].add(b);
        edgeCount++; 
    }

}
