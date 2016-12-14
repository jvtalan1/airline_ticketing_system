package edu.itdc.training.model;

import java.util.Date;

public class Trip {
	
	private int fromCityId;
	private int toCityId;
	private Date departureTime;
	private Date arrivalTime;
	private int numberOfPassenger;
	
	
	public Trip() {}
	
	
	public Trip(int fromCityId, int toCityId, Date departureTime, Date arrivalTime, int numberOfPassenger) {
		this.fromCityId = fromCityId;
		this.toCityId = toCityId;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.numberOfPassenger = numberOfPassenger;
	}
	
	
	public Date getDepartureTime () {
		return departureTime;
	}
	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}
	public Date getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public int getFromCityId() {
		return fromCityId;
	}
	public void setFromCityId (int fromCityId) {
		this.fromCityId = fromCityId;
	}
	public int getToCityId () {
		return toCityId;
	}
	public void setToCityId (int toCityId) {
		this.toCityId = toCityId;
	}
	public int getNumberOfPassenger() {
		return numberOfPassenger;
	}
	public void setNumberOfPassenger(int numberOfPassenger) {
		this.numberOfPassenger = numberOfPassenger;
	}
	
	
}
