package DSA;

import java.util.ArrayList;

public class GWAdjacency {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int wt){
            this.src = s;
            this.dest = d;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2,2));

        graph[1].add(new Edge(1, 2,10));
        graph[1].add(new Edge(1, 3,0));

        graph[2].add(new Edge(2, 0,2));
        graph[2].add(new Edge(2, 1,10));
        graph[2].add(new Edge(2, 3,-1));

        graph[3].add(new Edge(3, 1,0));
        graph[3].add(new Edge(3, 2,-1));
    }

    // public static void printNeighbhour(ArrayList<Edge>[] Node){
    //     for(int i=0; i<Node.length; i++){
    //         for(int j=0; j<Node[i].size(); j++){
    //             System.out.println("EDGE : "+Node[i].get(j).src+" to "+Node[i].get(j).dest+"with weight "+Node[i].get(j).wt);
    //         }
    //         System.out.println();
    //     }
    // }

    // Print neighbhours : 
    public static void printNeighbhour(ArrayList<Edge> Node){
        for(int j=0; j<Node.size(); j++){
            Edge ed = Node.get(j);
            System.out.println("EDGE : "+ed.src+" to "+ed.dest+" with weight "+ed.wt);
        }
        System.out.println();
        
    }

  
    public static void main(String[] args) {
        int V = 4;

        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        for(int i=0; i< graph.length; i++){

            printNeighbhour(graph[i]);
        }

     
    }
}
