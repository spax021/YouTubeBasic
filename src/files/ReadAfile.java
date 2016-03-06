package files;

import java.io.*;
import java.util.*;

public class ReadAfile {

	private Scanner x;
	
	public void openFile(){
		try{
			x = new Scanner(new File("Spax.txt"));
		}catch(Exception e){
			System.out.println("Could not find a file.");
		}
	}
	
	public void readFile(){
		while(x.hasNext()){
			String a = x.next();
			String b = x.next();
			String c = x.next();
			
			System.out.printf("%s %s %s", a, b, c);
			System.out.println();
		}
	}
	
	public void closeFile(){
		x.close();
	}
}
