package model;

public class Flight {
	
	String flightnum;
	String time;
	String date;
	int passengers;
	int capacity;
	
	public Flight() {}

	public Flight(String flightnum, String time, String date, int passengers, int capacity) {
		this.flightnum = flightnum;
		this.time = time;
		this.date = date;
		this.passengers = passengers;
		this.capacity = capacity;
	}

	public String getFlightnum() {
		return flightnum;
	}

	public void setFlightnum(String flightnum) {
		this.flightnum = flightnum;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Flight [flightnum=" + flightnum + ", time=" + time + ", date=" + date + ", passengers=" + passengers
				+ ", capacity=" + capacity + "]";
	}
	
	
}
