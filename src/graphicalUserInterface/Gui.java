package graphicalUserInterface;

import java.awt.FlowLayout;				//Gives you layout
import java.awt.event.ActionListener;	//waits for user to do something like "press enter"
import java.awt.event.ActionEvent;		//event is passed to every ActionListener
import javax.swing.JFrame;				//frame
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Gui extends JFrame{  //JFrame is super class now
	
	private JButton regular;
	private JButton custom;
	
	public Gui(){
		super("The Naslov"); // reserved word super, its how you call methods from super class
		setLayout(new FlowLayout());  //this gives default layout
		
		regular = new JButton("Regular Button");
		add(regular);
		
		Icon b = new ImageIcon(getClass().getResource("reg.png"));
		Icon x = new ImageIcon(getClass().getResource("cus.png"));
		custom = new JButton("Custom", b);
		custom.setRolloverIcon(x);
		add(custom);
		
		HandlerClass handler = new HandlerClass();
		regular.addActionListener(handler);
		custom.addActionListener(handler);
		
	}

	private class HandlerClass implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			
			JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
		}
	}
	
	
	
	
	
}
