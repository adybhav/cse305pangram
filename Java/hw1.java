import java.io.BufferedReader;
import java.util.*;
import java.io.FileReader;
import java.io.PrintWriter;

public class hw1 {
	
	public static void hw1(String inFile,String outFile)throws Exception{
		FileReader file=new FileReader(inFile);//"C:/Users/adity/Desktop/test.txt");
		BufferedReader reader=new BufferedReader(file);
		String text="";
		String newline = System.getProperty("line.separator");
		String line=reader.readLine();
		PrintWriter writer = new PrintWriter(outFile, "UTF-8");			
		while(line!=null){
			char cur=97;
			boolean value=true;
			int count=0;//26 total
			text=line;
			for (int i = 0 ; i != text.length() ; i++) {
			    for(int j=0;j!=text.length();j++){
				char c = text.charAt(j);
				if(c==cur){
			    count++;cur+=1;	
			    break;
			    }			    			   
			    }
			}
			if(count==26){value=true;}
			else if (count!=26){value=false;}
			writer.println(value);
			line=reader.readLine();
			}
		writer.close();
	}
}
