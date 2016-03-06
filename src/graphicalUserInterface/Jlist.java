package graphicalUserInterface;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

public class Jlist extends JFrame{

	private JList list;
	private static String[] colornames = {"red", "green", "blue", "black"};
	private static Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.BLACK};
	
	public Jlist(){
		super("D Tajtl");
		setLayout(new FlowLayout());
		
		list = new JList(colornames);
		list.setVisibleRowCount(4);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(list));
			//beside the list, everything else is build in method that you need every time
			//its none of your own custom stuff
			//easier way of adding event handlers
		list.addListSelectionListener(
				new ListSelectionListener(){
					public void valueChanged(ListSelectionEvent event) {
						getContentPane().setBackground(colors[list.getSelectedIndex()]);
						
					}});
		
	}

}
