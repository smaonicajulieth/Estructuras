package Graphs;

import LinearDataStructures.List;

/**
 * This class is the represent of a Nodo for a Undirected Graph
 * 
 * @author Juan David Guerrero Pérez , student at Politécnico Grancolombiano
 *
 */

public class NodeUndirectedGraph {
	
	
	private String label;
	
	private List connections;

	public NodeUndirectedGraph(String label) {
		this.label = label;
		this.connections = new List();
	}
	
	public void addConnection(NodeUndirectedGraph node) {	
		NodeAdjacencyList temp = new NodeAdjacencyList(node);
		this.connections.insertAtEnd(temp);
	}
	
	public boolean isEquals(NodeUndirectedGraph node) {
		
		boolean isEquals = false;

		List tempConnections = node.getConnections();
		
		if(tempConnections.isEmpty() && node.getConnections().isEmpty()) {
			if(node.getLabel().equals(this.label)) {
				isEquals = true;
			}
		}else {
			if(!tempConnections.isEmpty() && !node.getConnections().isEmpty()) {
				
				if(tempConnections.isEqual(this.connections)) {
					if(node.getLabel().equals(this.label)) {
						isEquals = true;
					}
				}
			}
		}
		
		return isEquals;
	}

	@Override
	public String toString() {
		return label;
	}


	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public List getConnections() {
		return connections;
	}

	
	
	
	
	
	
	

}
