package graphicalUserInterface;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Mouseevent extends JFrame{

	private JPanel mousepanel;
	private JLabel statusbar;
	
	public Mouseevent(){
		super("Nasloooov");
//		setLayout(new FlowLayout());
		
		mousepanel = new JPanel();
		mousepanel.setBackground(Color.WHITE);
		add(mousepanel, BorderLayout.CENTER);
		
		statusbar = new JLabel("default");
		add(statusbar, BorderLayout.SOUTH);
		
		HandlerClass handler = new HandlerClass();
		mousepanel.addMouseListener(handler);
		mousepanel.addMouseMotionListener(handler);
		
	}
	
	private class HandlerClass implements MouseListener, MouseMotionListener{
		//MouseMotion
		public void mouseDragged(MouseEvent event) {
			statusbar.setText("You are dragging the mouse");
			mousepanel.setBackground(Color.YELLOW);
		}
		public void mouseMoved(MouseEvent event) {
			statusbar.setText("You are moving the mouse");
		}
		//MouseListener
		public void mouseClicked(MouseEvent event) {
			statusbar.setText(String.format("Clicked at %d,%d", event.getX(), event.getY()));
		}
		public void mouseEntered(MouseEvent event) {
			statusbar.setText("You entered the area");
			mousepanel.setBackground(Color.RED);
		}
		public void mouseExited(MouseEvent event) {
			statusbar.setText("The mouse has left the building");
			mousepanel.setBackground(Color.BLUE);
		}
		public void mousePressed(MouseEvent event) {
			statusbar.setText("You pressed down the mouse");
			mousepanel.setBackground(Color.GREEN);
		}
		public void mouseReleased(MouseEvent event) {
			statusbar.setText("You relesed down the mouse");
			mousepanel.setBackground(Color.RED);
		}
	}
}
