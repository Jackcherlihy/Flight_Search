package view;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SearchFlights {

	
	public void searchFlight() {
	 JFrame frame = new JFrame("Search Flights");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Add the Search label.
        JLabel label = new JLabel("Search: ");
        frame.getContentPane().add(label);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
	}
}
