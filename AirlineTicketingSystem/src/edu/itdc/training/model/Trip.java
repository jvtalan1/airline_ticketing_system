package edu.itdc.training.model;

import java.util.Date;

public class Trip {
	private Date departureTime;
	private Date arrivalTime;
	private int fromCityId;
	private int toCityId;
	private int numberOfPassenger;
	private String fromCity;
	private String toCity;
	
	
	public Trip() {}
	
	
	
	public Trip(Date departureTime, Date arrivalTime, int fromCityId, int toCityId, int numberOfPassenger) {
		super();
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.fromCityId = fromCityId;
		this.toCityId = toCityId;
		this.numberOfPassenger = numberOfPassenger;
	}
	
	public Trip(Date departureTime, Date arrivalTime, String fromCity, String toCity, int numberOfPassenger) {
		super();
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.fromCity = fromCity;
		this.toCity = toCity;
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
