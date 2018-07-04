package com.harish.mbta.restclient;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.harish.mbta.model.v3.stops.Stop;
import com.harish.mbta.model.v3.trips.Trip;
import com.harish.mbta.model.v3.routes.Routes;
import com.harish.mbta.model.v3.schedules.Schedule;

@Component
public class MbtaV3ApiProxy {
	
	private static final Logger logger = LoggerFactory.getLogger(MbtaV3ApiProxy.class);
	
	@Value("${mbta.uri.stop}")
	private String URL_GET_STOPS;
	
	@Value("${mbta.uri.shedule}")
	private String URL_GET_SCHEDULES;
	
	@Value("${mbta.uri.routes}")
	private String URL_GET_ROUTES;
	
	@Value("${mbta.uri.trips}")
	private String URL_GET_TRIPS;
	
	
    
	private Gson gson;
	
	public MbtaV3ApiProxy(){
		gson =  new GsonBuilder().create();
	}
	
	public Stop getStopsNearBy(String latitude, String longitude) {
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("latitude", latitude);
		uriVariables.put("longitude", longitude);
		RestTemplate restTemplate = new RestTemplate();
		//String jsonReply = restTemplate.getForObject(URL_GET_STOPS,	String.class, uriVariables);
		//logger.info(jsonReply);
		
  		Stop stop = restTemplate.getForObject(URL_GET_STOPS,Stop.class, uriVariables);
		return stop;
	}
	
	public Schedule getScheduleForThisStop(String stopId) {
		
		String minTime = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm"));
		String maxTime = LocalTime.now().plusMinutes(20).format(DateTimeFormatter.ofPattern("HH:mm"));
		
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("stop", stopId);
		uriVariables.put("min", minTime);
		uriVariables.put("max", maxTime);
		
		
		RestTemplate restTemplate = new RestTemplate();
		//String jsonReply = restTemplate.getForObject(URL_GET_SCHEDULES,	String.class, uriVariables);
		//logger.info(jsonReply);
		
		Schedule schedule  = restTemplate.getForObject(URL_GET_SCHEDULES,	Schedule.class, uriVariables);
		return schedule;
	}
	
	public Routes getRoute(String routeId) {
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("route_id", routeId);
		RestTemplate restTemplate = new RestTemplate();
		
		Routes routes = restTemplate.getForObject(URL_GET_ROUTES,	Routes.class, uriVariables);
		return routes;
		
	}
	
	public Trip getTrip(String tripId) {
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("trip_id", tripId);
		RestTemplate restTemplate = new RestTemplate();
		
		Trip trip = restTemplate.getForObject(URL_GET_TRIPS,	Trip.class, uriVariables); 
		return trip;
		
	}

}
