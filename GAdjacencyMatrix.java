package DSA;


public class GAdjacencyMatrix{
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(int[][] graph){
        

        graph[0][2] = 1;

        graph[1][2] = 1;
        graph[1][3] = 1;

        graph[2][0] = 1;
        graph[2][1] = 1;
        graph[2][3] = 1;

        graph[3][1] = 1;
        graph[3][3] = 1;
    }

    public static void Print(int[][] graph){
        for(int i=0; i<graph.length; i++){
            for(int j=0; j<graph.length; j++){
                if(graph[i][j] == 1){
                    System.out.print(graph[i][j]+" ");
                }
                else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
   


 

  
    public static void main(String[] args) {
        int V = 4;

        int graph[][] = new int[V][V];

        createGraph(graph);

        Print(graph);




     
    }
}
