package graphicalUserInterface;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Mouseadapter extends JFrame{

	private String details;
	private JLabel statusbar;
	
	public Mouseadapter(){
		super("Title");
		
		statusbar = new JLabel("This is default");
		add(statusbar, BorderLayout.NORTH);
		addMouseListener(new Mouseclass());
	}
	
	private class Mouseclass extends MouseAdapter{
		public void mouseClicked(MouseEvent event){
			details = String.format("You clicked %d", event.getClickCount());
			
			if(event.isMetaDown())
				details += " sa desnim klikom";
			else if(event.isAltDown())
				details += " sa tockicem";
			else
				details += " sa levim klikom";
			
			statusbar.setText(details);
		}
	}
	
	
	
	
	
}
