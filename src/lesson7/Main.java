package lesson7;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(11);

        graph.addEdge(1,5);
        graph.addEdge(1,7);
        graph.addEdge(2,3);
        graph.addEdge(2,6);
        graph.addEdge(3,4);
        graph.addEdge(4,6);
        graph.addEdge(5,6);
        graph.addEdge(5,7);
        graph.addEdge(5,10);
        graph.addEdge(6,8);
        graph.addEdge(8,9);
        graph.addEdge(9,10);


//        System.out.println(graph.getAdjList(2));

//        DepthFirstPath dfp = new DepthFirstPath(graph, 2);
//        System.out.println(dfp.hasPathTo(4));
////        System.out.println(dfp.hasPathTo(7));
//        System.out.println(dfp.pathTo(4));

        BreadthFirstPath bfp = new BreadthFirstPath(graph, 10);
        System.out.println(bfp.pathTo(2));
    }
}
