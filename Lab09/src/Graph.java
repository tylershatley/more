/*
 * Tyler Shatley
 * csce 146
 * lab09
 */
import java.util.*;
public class Graph {
	
	private class Vertex
	{
		String name;//must be unique
		LinkedList<Edge> neighbors;
		public Vertex(String aName)
		{
			name = aName;
			neighbors = new LinkedList<Edge>();
		}
	}
	
	private class Edge
	{
		Vertex toVert;//creates ordered set?
		double weight;//distance is a weight
		
		public Edge(Vertex aV, double aW)
		{
			toVert = aV;
			weight = aW;
		}
	}
	private Vertex origin;//this is where we start from and its arbitrary 
	private LinkedList<Vertex> vertices; //This is the graph
	public Graph()
	{
		origin = null;
		vertices = new LinkedList<Vertex>();
		markedVerts = new LinkedList<Vertex>();
	}
	
	public void addVertex(String aName)
	{
		if(isVertContained(aName))
			return;//found a duplicate
		Vertex v = new Vertex(aName);
		vertices.add(v);
		if(origin == null)
			origin = v;
	}
	
	private boolean isVertContained(String aName)//verify 
	{
		/*for(Vertex v : vertices)
			if(v.name.equals(aName))
				return true;
		return false;
		*/
		return getVert(aName) != null;
	}
	
	public void addEdge(String fromVert, String toVert, double weight)
	{
		Vertex v1 = getVert(fromVert);
		Vertex v2 = getVert(toVert);
		if(v1 == null || v2 == null)
			return; //one or both vertices were not found
		v1.neighbors.add(new Edge(v2,weight));
	}
	
	private Vertex getVert(String aName)
	{
		for(Vertex v: vertices)
			if(v.name.equals(aName))
				return v;
		return null;
	}
	
	private LinkedList<Vertex> markedVerts = new LinkedList<Vertex>();
	
	public void printDFS()
	{
		for(Vertex v : vertices)
		{
			markedVerts.clear();
			printDFS(v,"");
		}
	}
	
	private void printDFS(Vertex v, String str)
	{
		str = str + v.name + " ";
		if(markedVerts.contains(v))
		{
			if(v.name.equalsIgnoreCase(markedVerts.get(0).name))
				System.out.println(str);
			return;
		}

		markedVerts.add(v);
		
		for(Edge e : v.neighbors)
			printDFS(e.toVert,str);
		markedVerts.remove(v);
	}
	private Queue<Vertex> vQ = new LinkedList<Vertex>();
	
	
	public void printBFS()
	{
		markedVerts.clear();
		System.out.println(origin.name);
		vQ.add(origin);
		while(!vQ.isEmpty())
		{
			Vertex v = vQ.remove();
			markedVerts.add(v);
			
			for(Edge e : v.neighbors)
			{
				if(!vQ.contains(e.toVert) && !markedVerts.contains(v))
				{
					System.out.println(e.toVert.name);
					vQ.add(e.toVert);
				}
			}
		}
	}
}