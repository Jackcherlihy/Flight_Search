package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.GetFlight;

public class SearchFlights implements ActionListener {

	private JFrame frame;
	private JPanel panel;
	private JButton searchBtn;
	private JLabel label;
	
	public SearchFlights () {
		
		frame = new JFrame();
		panel = new JPanel();
		
		
		JTextField field = new JTextField("Enter flight number...");
		
		
		//Create search button
		searchBtn = new JButton("Search");
		searchBtn.addActionListener(this);
		
		
		//Add dynamic result label.
		label = new JLabel("Flight Info Displayed Here");
        
		
		//Panel constraints
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 10));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(field);
		panel.add(searchBtn);
		panel.add(label);
	

        //Display the window.
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		GetFlight getFlight = new GetFlight();
		label.setText(getFlight.getInfo());
		
	}
}
