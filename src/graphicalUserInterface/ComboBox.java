package graphicalUserInterface;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ComboBox extends JFrame{
	
	private JComboBox box;
	private JLabel picture;
	
	private static String[] filename = {"a.png", "b.png", "c.png"};
	private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])),
							new ImageIcon(getClass().getResource(filename[1])),
							new ImageIcon(getClass().getResource(filename[2]))};
	
	public ComboBox(){
		super("DA Naslov");
		setLayout(new FlowLayout());
		
		box = new JComboBox(filename);
		
		box.addItemListener(
				new ItemListener() {
					
					public void itemStateChanged(ItemEvent event) {
						if(event.getStateChange() == ItemEvent.SELECTED)
							picture.setIcon(pics[box.getSelectedIndex()]);
						}});
		add(box);
		picture = new JLabel(pics[0]);	//this gives a default value
		add(picture);
	}
	
	
	
	
	
	

}
