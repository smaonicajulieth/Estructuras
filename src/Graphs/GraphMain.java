package Graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class GraphMain {
	public static void main(String[] args) {
		try {
			File file= new File("input2.txt");
			FileReader fr= new FileReader(file);
			BufferedReader br= new BufferedReader(fr);
		Graph fbGraph= new Graph();
		int count=0;
			 String st; 
			  while ((st = br.readLine()) != null) {
				  count++;
			    String[]input= st.split(" ");
			    
			    GraphNode userNode= new GraphNode(Integer.parseInt(input[1]));
			    KeyNode conectedNode= new KeyNode(Integer.parseInt(input[0]));
			    
			    if(!fbGraph.contains(userNode)) {
			    	fbGraph.insert(userNode);
			    	fbGraph.conect(userNode, conectedNode);
			    	
			    }
			    else {
			    	fbGraph.conect(userNode, conectedNode);
			    }
				 // System.out.println(st); 
			  }
			  System.out.println("Graph print");
			 
			  twitterGraph.print();
			  System.out.println(fbGraph.GraphNodes.length());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
