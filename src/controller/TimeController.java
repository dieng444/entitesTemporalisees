package controller;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import model.SimpleChangeListener;
import model.Time;

public class TimeController extends JFrame implements ChangeListener, SimpleChangeListener, ActionListener
{
	private Time time;
	
	public TimeController(String name)
	{
		super(name);
		this.time = time;
		this.setLayout(new BorderLayout());
		JPanel numTime = new JPanel();
		numTime.setLayout(new FlowLayout());
		numTime.add(new JLabel("Start"));
		numTime.add(new JTextField(5));
		numTime.add(new JLabel("Current"));
		numTime.add(new JTextField(5));
		numTime.add(new JLabel("End"));
		numTime.add(new JTextField(5));
		this.add(numTime, BorderLayout.NORTH);
		this.add(new JButton("<<"), BorderLayout.WEST);
		this.add(new JButton(">>"), BorderLayout.EAST);
		JPanel southZone = new JPanel();
		southZone.setLayout(new BoxLayout(southZone, BoxLayout.Y_AXIS));
		JPanel  slideZone = new JPanel();
		slideZone.setLayout(new FlowLayout());
		slideZone.add(new JLabel("Début"));
		slideZone.add(new JSlider());
		slideZone.add(new JLabel("Fin"));
		southZone.add(slideZone);
		southZone.add(new Checkbox("Synchronize"));
		this.add(southZone, BorderLayout.SOUTH);
		pack();
		setVisible(true);
	}
	
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
