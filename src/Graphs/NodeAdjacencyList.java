package Graphs;

import LinearDataStructures.Node;

public class NodeAdjacencyList implements Node{
	
	
	private NodeUndirectedGraph data;
	
	private NodeAdjacencyList next;
	

	public NodeAdjacencyList(NodeUndirectedGraph data) {
		this.data = data;
		this.next = null;
	}
	
	public NodeUndirectedGraph getData () {
		return this.data;
	}

	@Override
	public void setNext(Node node) {
		this.next = (NodeAdjacencyList) node;
		
	}

	@Override
	public Node getNext() {
		return this.next;
	}

	@Override
	public Node clone() {
		return new NodeAdjacencyList(this.data);
	}

	@Override
	public boolean isEqual(Node node) {
		
		NodeAdjacencyList temp = (NodeAdjacencyList) node.clone();
		
		NodeUndirectedGraph tempData = temp.getData();

		return this.data.isEquals(tempData)? true : false;
	}

	@Override
	public boolean isLessThan(Node node) {
		// TODO Auto-generated method stub
		return false;
	}

}
