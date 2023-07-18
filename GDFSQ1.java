package DSA;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class GDFSQ1 {

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
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

    public static void printAllPath(ArrayList<Edge> graph[], int curr, boolean[] visp, String path, int tar){
               if(curr == tar){
                for(int i=0; i<path.length(); i++){
                    if(i == path.length()-1){
                        System.out.println(path.charAt(i));
                        return;
                    }
                    System.out.print(path.charAt(i)+" -> ");  
                }
             }


               for(int i=0; i<graph[curr].size(); i++){
                if(visp[graph[curr].get(i).dest] == false){

                    visp[curr] = true;
                    printAllPath(graph, graph[curr].get(i).dest, visp, path + graph[curr].get(i).dest, tar);
                    visp[curr] = false;
                }
               }
    }
    public static void main(String[] args) {
        int V = 7;

       /*
        
              1---3
            /     | \
           0      |  5 -- 6
            \     | /
              2--- 4
         */

         ArrayList<Edge> graph[] = new ArrayList[V];
         createGraph(graph);
         int src = 0, tar = 5;

        //  boolean visp[] = new boolean[V];
        //  for(int i=0; i<V; i++){
        //     visp[i] = false;
        // }
         
        printAllPath(graph, 0, new boolean[V], src + "", tar);
        
         
         
    }
    
}