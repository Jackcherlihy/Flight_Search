package controller;

import model.Flight;

public class GetFlight {
	
	public GetFlight() {}
	
	public String getInfo() {
		
		//Apply Singleton to Flight class
		Flight testFlight = Flight.getFlightInstance();
		
		return testFlight.toString();
	}
}
