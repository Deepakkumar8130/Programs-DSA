package DSA;

import java.util.ArrayList;
public class GAdjacency{
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }

 // public static void printNeighbhour(ArrayList<Edge>[] Node){
    //     for(int i=0; i<Node.length; i++){
    //         for(int j=0; j<Node[i].size(); j++){
    //             System.out.println("EDGE : "+Node[i].get(j).src+" to "+Node[i].get(j).dest);
    //         }
    //         System.out.println();
    //     }
    // }

    // Print neighbhours : 
    public static void printNeighbhour(ArrayList<Edge>[] Node){
        for(int i=0; i<Node.length; i++){
            for(int j=0; j<Node[i].size(); j++){
                Edge ed = Node[i].get(j);
                System.out.println("EDGE : "+ed.src+" to "+ed.dest);
            }
            System.out.println();
        }
    }

  
    public static void main(String[] args) {
        int V = 4;

        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        printNeighbhour(graph);

     
    }
}
