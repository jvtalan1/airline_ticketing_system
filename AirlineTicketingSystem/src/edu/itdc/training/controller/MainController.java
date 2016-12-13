package edu.itdc.training.controller;

import java.text.ParseException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.itdc.training.dao.BookingDAO;
import edu.itdc.training.model.Trip;
import edu.itdc.training.util.DateTimeUtil;

@Controller
public class MainController {
	DateTimeUtil dateFormatter;
	@Autowired
	BookingDAO bookingDAO;

	@RequestMapping(value="/searchFlight", method = RequestMethod.GET)
	public String searchFlight(@ModelAttribute("flightInfo") Trip flight, HttpServletRequest request) throws ParseException {
		int fromCityId = Integer.parseInt(request.getParameter("FromCityId"));
		int toCityId = Integer.parseInt(request.getParameter("ToCityId"));
		dateFormatter = new DateTimeUtil();
		Date departureTime = dateFormatter.formatDate(request.getParameter("departureTime"));
		Date arrivalTime = dateFormatter.formatDate(request.getParameter("arrivalTime"));
		
		bookingDAO.searchFlight(fromCityId, toCityId, departureTime, arrivalTime);
		return "flights";
		
	}
	
	@RequestMapping("/flights") 
	public ModelAndView showFlights () {
		
		return new ModelAndView("flights", "flightInfo", new Trip());
		
	}
}
