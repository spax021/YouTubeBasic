package files;

import java.io.File;
import java.util.*;

//	File x = new File("c:\\UOOP\\eclipseUOOPWin\\WorkSpaceYouTube\\YouTube\\src\\files\\proba.txt");

public class Main {
	
	public static void main(String[] args){
	
		ReadAfile g = new ReadAfile();
		g.openFile();
		g.readFile();
		g.closeFile();
		
		
	}	
}
