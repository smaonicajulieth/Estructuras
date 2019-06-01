package Graph;

import LinearDataStructures.ExampleNode;
import LinearDataStructures.List;
import LinearDataStructures.Node;

public class GraphNode implements Node{
	public int user;
	public List ConectedNodes;
    public GraphNode next;
    
    
    public GraphNode(int user) {
    	this.user= user;
    	this.ConectedNodes=new List();
    }
    public String toString() {
    	return this.user+" ";
    }
	@Override
	public void setNext(Node node) {
		this.next=(GraphNode)node;

	}

	@Override
	public Node getNext() {
		// TODO Auto-generated method stub
		return next;
	}

	@Override
	public Node clone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEqual(Node node) {
		
		GraphNode temp = (GraphNode)node;
		return this.user == temp.user ? true : false;
	}

	@Override
	public boolean isLessThan(Node node) {
		// TODO Auto-generated method stub
		return false;
	}

}
