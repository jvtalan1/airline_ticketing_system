package edu.itdc.training.model;

import java.util.Date;

public class Airline {
	private Date departureTime;
	private Date arrivalTime;
	private String fromCity;
	private String toCity;
	private int numberOfPassenger;
	
	public Airline() {}
	
	public Airline(Date departureTime, Date arrivalTime, String fromCity, String toCity, int numberOfPassenger) {
		super();
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.fromCity = fromCity;
		this.toCity = toCity;
		this.numberOfPassenger = numberOfPassenger;
	}
	public Date getDepartureTime() {
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
	public String getFromCity() {
		return fromCity;
	}
	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}
	public String getToCity() {
		return toCity;
	}
	public void setToCity(String toCity) {
		this.toCity = toCity;
	}
	public int getNumberOfPassenger() {
		return numberOfPassenger;
	}
	public void setNumberOfPassenger(int numberOfPassenger) {
		this.numberOfPassenger = numberOfPassenger;
	}
	
	
}
