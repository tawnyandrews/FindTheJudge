import java.util.*;

public class FindJudge{

    public static int findJudge(int N, int[][] trust) {
        int[] townPeople = new int[N+1]; //array of town people
        townPeople[0] = -1; //initialize to -1
        int x = 0; //keeps track when incrementing 

        for(int i = 0; i < trust.length; i++)
            townPeople[trust[i][0]] = -1; 
        
        int townPerson = -1;
      
        for(int i = 1; i < N; i++){
            if(townPeople[i] == 0){
                townPerson = i; 
                break;
            }
        }

        if(townPerson == -1)
            return -1; //return -1 if no town judge is found 
       
        for(int i = 0; i < trust.length; i++){ //increment through the town people, see who trusts who
            if(trust[i][1] == townPerson)
                x++; 
        }
        
        if(x == N-1)
            return townPerson; 
        
        return -1; //no town judge found 
    }


    public static void main(String[] args){
	    int N = 8; 
	    JudgeGraph graph = new JudgeGraph(N);
	    int[][] trust =  {{1,2},
	                      {2,4},
	                      {3,4},
	                      {5,4},
	                      {2,1},
	                      {1,3},
	                      {5,4}};


	    for(int row = 0; row<trust.length; row++){
	        graph.addEdge(trust[row][0], trust[row][1]);
    }

    System.out.println("The Town Judge is " + findJudge(5, trust));
    }
    
}
