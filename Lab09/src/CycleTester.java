/*
 * Tyler Shatley
 * csce146 
 * lab09
 */
public class CycleTester {

	public static void main(String[] args) {
		
		Graph graph = new Graph();
		
		graph.addVertex("1");
		graph.addVertex("2");
		graph.addVertex("3");
		graph.addVertex("4");
		graph.addVertex("5");
		graph.addVertex("6");
		graph.addVertex("7");
		
		graph.addEdge("1", "5", 1);
		graph.addEdge("5", "2", 1);
		graph.addEdge("5", "3", 1);
		graph.addEdge("5", "7", 1);
		graph.addEdge("7", "6", 1);
		graph.addEdge("7", "4", 1);
		graph.addEdge("2", "1", 1);
		graph.addEdge("6", "3", 1);
		graph.addEdge("3", "1", 1);
		graph.addEdge("4", "2" , 1);
		
		System.out.println("The cycles in this graph are");
		graph.printDFS();


	}

}
