package program;
import javax.swing.JFrame; //this makes sure that we can use windows in our main method

public class ProgramPokretac {

	public static void main(String[] args) {

		Program spax = new Program();
		spax.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //hit X, close the program
		spax.setSize(350, 100);
		spax.setVisible(true);

	}

}
