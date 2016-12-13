package edu.itdc.training.dao;

import java.util.Date;
import java.util.List;
import edu.itdc.training.model.Trip;

public interface BookingDAO {
	public boolean bookFlight();
	public List<Trip> searchFlight(int fromCityId, int toCityId, Date departureTime, Date arrivalTime);
}
