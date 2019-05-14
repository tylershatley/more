import java.util.*;
public class DijkstraAlgo {

	public static final int GRAPH_SIZE = 10;
	public static final int MAX_OB = (GRAPH_SIZE*GRAPH_SIZE)/2;
	
	for(int i = 0; i < graph.length; i++)
		for(int j = 0; j < graph[i].length;j++)
			graph[i][j] = new Vertex(j,i);
	
	public static void setObstacles(Vertex[][] graph, Vertex start, Vertex end)
	{
		if(graph == null)
			return;
		Random r = new Random();
		int obCount = 0;
		while(ob)
	}
	
	public static Vertex dijkstra(Vertex[][] graph,Vertex start, Vertex end)
	{
		PriorityQueue<Vertex> pQ = new PriorityQueue<Vertex>();
		graph[start.y][start.x].dist = 0;
		pQ.add(graph[start.y][start.x]);
		while(pQ.isEmpty())
		{
			Vertex currV = pQ.remove();
			for(int i = currV.y-1; i <= currV.y+1;i++)
			{
				for(int j = currV.x-1; j < currV.x+1;j++)
				{
					if(i == currV.y && j == currV.x)
						continue;
					if(isValid(i) && isValid(j) && graph[i][j] != null)
					{
						//never reached this vertex
						if(graph[i].dist >= Double.MAX_VALUE)
						{
							graph[i][j] = 
									currV.dist + Vertex(currV,graph[i][j]);
							graph[i][j].prev = currV;
							if(pQ.contains(graph[i][j]))
								pQ.remove(graph[i][j]);
							pQ.add(graph[i][j]);
						}
					}
					else//we have been here before
					{
						double newDist =
								currV.dist + Vertex.distance(currV, graph[i][j]);
						if(newDist < graph[i][j].dist)
						{
							//We found a better path
							graph[i][j].dist = newDist;
							graph[i][j].prev = currV;
							if(pQ.contains(graph[i][j]))
								pQ.remove(graph[i][j]);
							pQ.add(graph[i][j]);
						}
					}
				}
			}
		}//end while
		if(graph[end.y][end.x].prev == null)//did not have a path
			return null;
		else
			return graph[end.y][end.x];
	}
}
}
