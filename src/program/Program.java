package program;
import java.awt.FlowLayout;				//Gives you layout
import java.awt.event.ActionListener;	//waits for user to do something like "press enter"
import java.awt.event.ActionEvent;		//event is passed to every ActionListener
import javax.swing.JFrame;				//frame
import javax.swing.JTextField;			//input field
import javax.swing.JPasswordField;		//similar as input, but with asterisks
import javax.swing.JOptionPane;			//standard dialog box, prompts user for a value or informs them of something

public class Program extends JFrame { //it lets us use a window

	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField pass;
	
	public Program(){
		super("Naslov");
		setLayout(new FlowLayout());
		
		item1 = new JTextField(10);
		add(item1);
		
		item2 = new JTextField("Enter text here");
		add(item2);
		
		item3 = new JTextField("uneditable", 10);
		item3.setEditable(false);
		add(item3);
		
		pass = new JPasswordField("MyPass");
		add(pass);
		
		theHandler handler = new theHandler(); //build an action listener object
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		pass.addActionListener(handler);
	}
	//when you build a class thats inside a class, it inherit everything from it
	private class theHandler implements ActionListener{ //this is going to be a class that handle the events
		
		public void actionPerformed(ActionEvent event){ //what ever hapens, this is going to handle it
			//actionPerformed is build in method that has to do with ActionListener class
			String string = "";
			
			if(event.getSource()==item1)  //event = enter, getSource = where it hapens
				string = String.format("Polje1: %s", event.getActionCommand()); //getActionCommand = get text
			else if(event.getSource()==item2)									//			 	from that location
				string = String.format("Polje2: %s", event.getActionCommand());
			else if(event.getSource()==item3) 
				string = String.format("Polje3: %s", event.getActionCommand());
			else if(event.getSource()==pass) 
				string = String.format("Password: %s", event.getActionCommand());
			
			JOptionPane.showMessageDialog(null, string);
		}
	}

}
