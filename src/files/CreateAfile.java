package files;

import java.io.*;
import java.lang.*;
import java.util.*;

public class CreateAfile {

	private Formatter x;

	public void openFile() {

		try {
			x = new Formatter("Spax.txt");
		} catch (Exception e) {
			System.out.println("You have an error");
		}
	}
	
	public void addRecords(){
		x.format("%s%s%s", "26 ", "Spasoje ", "Malbaski ");
	}
	
	public void closeFile(){
		x.close();
	}
}
