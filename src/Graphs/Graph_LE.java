import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.Vector;

public class Graph_LE {

	public class GraphNode{
		int data;
		String label;
		Vector<Integer> connections = new Vector<Integer>();
		private GraphNode next;

		public GraphNode(int dta,String label){
			this.data = data;
			this.label = label;
		}
		public void setNext(GraphNode next){
			this.next = next;
		}

		public GraphNode getNext(){
			return this.next;
		}

		public String toString(){
			return ("label: %s \tData: %d",this.label,this.data);
		}

		public boolean isEqual(GraphNode node){
			boolean result = false;
			if(this.data == node.data)
				result = true;
			return result;
		}
	}

	Vector<GraphNode> nodes = new Vector<GraphNode>();

	public Graph_LE(){

	}

	public void insert_node(String label,int data){
		nodes.add( new GraphNode(data,label));
	}

	public void delete_node(int label){
		GraphNode toSearch = new GraphNode(0,label);
		for(int i = 0; i < nodes.size(); i++){
			if(nodes.get(i).equals(toSearch)){
				nodes.remove(i);
				break;
			}
			else
				for(int j = nodes.get(i).edges.size() -1; j>=0; j--){
					if(nodes.get(i).edges.get(j)==label)
						nodes.get(i).edges.remove(j);
				}
			
			public void insert_edge(int label_1, int label_2){
				GraphNode toSearch = new GraphNode(0,label_1);
				for(int i = 0; i < nodes.size(); i++)
					if(nodes.get(i).equals(toSearch)){
						nodes.get(i).edges.add(label_2);
						break;
					}
				toSearch = new GraphNode(0, label_2);
				for(int i = 0; i < nodes.size();i++)
					if(nodes.get(i).equals(toSearch)){
						nodes.get(i).edges.add(label_1);
						break;
					}
			}
			
			public boolean if_exists(int label){
				GraphNode toSearch = new GraphNode(0, label);
				for(int i = 0; i < nodes.size(); i++)
					if(nodes.get(i).equals(toSearch))
						return true;
				return false;
			}
			
			public static void main (String[]args){
				try{
					FileReader fr = new FileReader("data.txt");
					BufferedWriter br = new BufferedWriter( fr );
					
					String line = br.readLine();
					String[] record = null;
					while(line != null){
						record = line.split(" ");
						graph.insert_edge(integer,parseInt(record[0]),)
						Integer.parseInt(record[1]));
						
						
						line = br.readLine();
					}
					
				}
				catch(Exception ex){
					ex.printStackTrace();
				}
			}

			}

		}
