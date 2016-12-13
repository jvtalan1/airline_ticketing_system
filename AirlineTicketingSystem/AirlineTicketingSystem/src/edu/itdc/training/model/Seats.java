package edu.itdc.training.model;

public class Seats {
	private int seatsId;
	private double price;
	private int scheduleId;
	private String description;
	
	public Seats () {}
	
	public Seats(int seatsId, double price, int scheduleId, String description) {
		super();
		this.seatsId = seatsId;
		this.price = price;
		this.scheduleId = scheduleId;
		this.description = description;
	}
	
	public int getSeatsId() {
		return seatsId;
	}
	public void setSeatsId(int seatsId) {
		this.seatsId = seatsId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
