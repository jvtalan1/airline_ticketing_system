package edu.itdc.training.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import edu.itdc.training.model.Trip;

@SuppressWarnings("rawtypes")
public class FlightRowMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Trip trip = new Trip();
		trip.setFromCityId(rs.getInt("FromCityId"));
		trip.setToCityId(rs.getInt("ToCityId"));
		trip.setDepartureTime(rs.getDate("DepartureTime"));
		trip.setArrivalTime(rs.getDate("ArrivalTime"));
		return null;
	}

}
