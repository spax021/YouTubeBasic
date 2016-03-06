package graphicalUserInterface;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		Buttons go = new Buttons();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		go.setSize(400, 200);
		go.setVisible(true);
	}

}
