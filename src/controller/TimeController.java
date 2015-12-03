package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import model.SimpleChangeListener;
import model.Time;

public class TimeController extends JFrame implements ChangeListener, SimpleChangeListener, ActionListener
{
	private Slider slide;
	private Button bouton;
	private Time time;
	private JLabel label;
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stateChanged(Object source) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
	}

}
