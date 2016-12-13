package edu.itdc.training.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtil {
	private DateFormat format;
	
	public Date formatDate(String date) throws ParseException {
		format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date formattedDate = format.parse(date);
		return formattedDate;
	}
}
