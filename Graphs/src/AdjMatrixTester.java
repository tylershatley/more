/*
 * Tyler Shatley
 */
public class AdjMatrixTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Making graph");
		AdjacencyMatrixGraph graph = new AdjacencyMatrixGraph(7);
		
		System.out.println("Adding edges");
		/*
		 * graph.addEdge(0,1,1);
		 * graph.addEdge(0,3,1);
		 * 
		 * graph.addEdge(1,3,1);
		 * 
		 * graph.addEdge(2,4,1);
		 * graph.addEdge(2,5,1);
		 * graph.addEdge(2,5,1);
		 * 
		 * graph.addEdge(3,2,1);
		 * graph.addEdge(3,4,1);
		 * 
		 * graph.addEdge(4,5,1);
		 * graph.addEdge(4,6,1);
		 */
		
		graph.addEdge(0, 1, 1);
		graph.addEdge(0, 5, 1);
		
		graph.addEdge(0, 2, 1);
		
		graph.addEdge(2, 3, 1);
		graph.addEdge(2, 4, 1);
		
		graph.addEdge(5, 6, 1);
		
		graph.addEdge(6, 0, 1);
		
		System.out.println("Print adj matrix");
		graph.printAdjMatrix();
		
		System.out.println("Print DFS");
		graph.printDFS();
		
		System.out.println("Print BFS");
		graph.printBFS();
		

	}

}
