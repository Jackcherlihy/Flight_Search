package controller;

import model.Flight;

public class GetFlight {
	
	public GetFlight() {}
	
	public String getInfo() {
		
		Flight testFlight = new Flight("F123", "13:50", "5/11/1997", 114, 220);
		
		return testFlight.toString();
	}
}
