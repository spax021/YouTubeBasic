package graphicalUserInterface;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButton extends JFrame{
	
	private JTextField tf;
	
	private Font pf;	//plain
	private Font bf;	//bold
	private Font itf;	//italic
	private Font bif;	//bold and italic
	
	private JRadioButton pb;
	private JRadioButton bb;
	private JRadioButton ib;
	private JRadioButton bib;
	
	private ButtonGroup group;
	
	public RadioButton(){
		super("D Naslov");
		setLayout(new FlowLayout());
		
		tf = new JTextField("I love Alexandra", 25);
		add(tf);
		
		pb = new JRadioButton("Plain", true);
		bb = new JRadioButton("Bold", false);
		ib = new JRadioButton("Italic", false);
		bib = new JRadioButton("Bold & Italic", false);
		add(pb);
		add(bb);
		add(ib);
		add(bib);
		
		group = new ButtonGroup();	//adding buttons to the group
		group.add(pb);				//by grouping them, when one is checked others are unchecked
		group.add(bb);				//its a build in method
		group.add(ib);
		group.add(bib);
		
		pf = new Font("Serif", Font.PLAIN, 14);
		bf = new Font("Serif", Font.BOLD, 14);
		itf = new Font("Serif", Font.ITALIC, 14);
		bif = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
		tf.setFont(pf);
		
		//wait for event to happen, pass in object to constructor
		pb.addItemListener(new HandlerClass(pf)); //that 'pf' needs to be passed in constructor
		bb.addItemListener(new HandlerClass(bf));
		ib.addItemListener(new HandlerClass(itf));
		bib.addItemListener(new HandlerClass(bif));
		
		
		
		
	}
	
	private class HandlerClass implements ItemListener{
		private Font font;
		
		//the font object gets variable font
		public HandlerClass(Font f){	// f is 'pf'
			font = f;
		}
		
		//sets the font to the font object that was passed in
		public void itemStateChanged(ItemEvent event) {
			tf.setFont(font);
			
		}
		
		 
	}
	
}
