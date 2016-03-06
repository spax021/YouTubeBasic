package graphicalUserInterface;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Buttons extends JFrame{
	
	private JButton lb;
	private JButton cb;
	private JButton rb;
	private JButton db;
	private FlowLayout layout;
	private Container container;
	
	public Buttons(){
		super("D Tajtl");
		layout = new FlowLayout();
		container = getContentPane();
		setLayout(layout);
		
		lb = new JButton("left");
		add(lb);
		lb.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						layout.setAlignment(FlowLayout.LEFT);
						layout.layoutContainer(container);
					}});
		
		cb = new JButton("center");
		add(cb);
		cb.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						layout.setAlignment(FlowLayout.CENTER);
						layout.layoutContainer(container);
					}});
		
		rb = new JButton("right");
		add(rb);
		rb.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						layout.setAlignment(FlowLayout.RIGHT);
						layout.layoutContainer(container);
					}});
		
	}
	

}
