package DSA;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class GBFS1 {

    static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
            this.src = s;
            this.dest =d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1, 0));
       

        graph[2].add(new Edge(2, 1));
       

        
        graph[3].add(new Edge(3, 4));
        

        
        graph[4].add(new Edge(4, 3));
    }

    public static void bfs(ArrayList<Edge> graph[], int st, boolean[] visp){
        Queue<Integer> q = new LinkedList<>();
        
        

        q.add(st);
        
        while(!q.isEmpty()){
            int curr = q.remove();
            if(visp[curr] == false){
                System.out.print(curr+" ");
                visp[curr] = true;
                for(int i=0 ; i<graph[curr].size(); i++){

                    q.add(graph[curr].get(i).dest);
                }
                
            }
        }

    }
    public static void main(String[] args) {
        int V = 5;

        /*
        
            0 ---  1--- 2
            
              3 --- 4
         */

         ArrayList<Edge> graph[] = new ArrayList[V];
         createGraph(graph);

         boolean visp[] = new boolean[V];
         for(int i=0; i<V; i++){
            visp[i] = false;
        }
         for(int i=0; i<V; i++){
            if(visp[i] == false){

                bfs(graph, i, visp);
                System.out.println();
            }
         }
         
    }
    
}
