package edu.itdc.training.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import edu.itdc.training.model.Trip;

public class JdbcTemplateBookingImpl implements BookingDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	private static final String SEARCH_FLIGHT = 
			"SELECT * FROM airlines.schedule WHERE FromCityId=? AND ToCityId=? AND DepartureTime=? AND ArrivalTime=?";

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	@Override
	public boolean bookFlight() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	@Override
	public List<Trip> searchFlight(int fromCityId, int toCityId, Date departureTime, Date arrivalTime) {
		jdbcTemplate = new JdbcTemplate(dataSource);
		List<Trip> tripList = new ArrayList<Trip>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(SEARCH_FLIGHT, new Object[]{fromCityId, toCityId, departureTime, arrivalTime});
		
		if ((rows != null)) {
			for (Map<String, Object> row: rows) {
				Trip trip = new Trip();
				trip.setFromCityId((int)(row.get("FromCityId")));
				trip.setToCityId((int)(row.get("ToCityId")));
				trip.setDepartureTime((Date)(row.get("DepartureTime")));
				trip.setArrivalTime((Date)(row.get("ArrivalTime")));
				tripList.add(trip);
			}
			return tripList;
		}
		else {
			return null;
		}
	}

}
