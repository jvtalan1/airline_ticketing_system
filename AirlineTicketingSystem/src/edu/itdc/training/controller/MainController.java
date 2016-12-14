package edu.itdc.training.controller;

import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import edu.itdc.training.dao.BookingDAO;
import edu.itdc.training.model.Trip;
import edu.itdc.training.util.DateTimeUtil;

@Controller
@SessionAttributes("newSearch")
public class MainController {
	DateTimeUtil dateFormatter;
	@Autowired
	BookingDAO bookingDAO;
	
	
	
	
	@RequestMapping(value="/searchFlight", method = RequestMethod.GET)
	public String searchFlight(@ModelAttribute("flightInfo") Trip trip, BindingResult result,
			@RequestParam int fromCityId, 
			@RequestParam int toCityId, 
			@RequestParam Date departureTime, 
			@RequestParam Date arrivalTime, 
			@RequestParam int numberOfPassenger, HttpSession session) {
	
		session.setAttribute("newSearch", 
		bookingDAO.searchFlight(fromCityId, toCityId, departureTime, arrivalTime, numberOfPassenger));
		return "flights";
		
	}
	
	@RequestMapping("/flights") 
	public ModelAndView searchFlights () {
		
		return new ModelAndView("flights", "flightInfo", new ArrayList<Trip>());
	}
	
	@RequestMapping("/home")
	public ModelAndView directHome () {
		
		return new ModelAndView("home", "flightInfo", new Trip());
	}
	
}
