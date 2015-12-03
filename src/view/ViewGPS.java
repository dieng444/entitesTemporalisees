package view;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ViewGPS extends JFrame {
	private String currentState;
	
	public ViewGPS() { 
		this.currentState = "Début";
		this.setLayout(new GridLayout(200,200));
		this.add(new JLabel(this.currentState));
		this.setVisible(true);
	}
	public void setCurrentState(String state)
	{
		this.currentState = state;
	}
	public String getCurrentState()
	{
		return this.currentState;
	}
}
