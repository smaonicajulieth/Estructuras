

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class GenerateFile {
	
	public static void main (String[]args){
		FileWriter fw;
		try
		{
			fw = new FileWriter("data.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			Random rd = new Random();
			
			int size = 1000000;
			for(int i = 0; i < size; i++){
				bw.write(rd.nextInt(size) + " " + rd.nextInt(size) + "\n");
			}
			bw.flush();
			bw.close();
		}
		catch(IDException e){
			e.printStackTrace();
		}
		
	}

}
