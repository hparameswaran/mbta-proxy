package com.harish.mbta.model;

import java.time.LocalTime;

import com.harish.mbta.model.v3.schedules.Datum;

public class MbtaSchedule {
	private String id;
	private String name;
	private String arrivalTime;
	private String departureTime;
	private String routeName;
	private String tripName;
	
	
	
	
	
	
	public MbtaSchedule() {
		super();
		
	}
	
	public MbtaSchedule(Datum data) {
		this.id = data.getId();
		this.arrivalTime = data.getAttributes().getArrivalTime();
		this.departureTime = data.getAttributes().getDepartureTime();
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getRouteName() {
		return routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	public String getTripName() {
		return tripName;
	}
	public void setTripName(String tripName) {
		this.tripName = tripName;
	}


	@Override
	public String toString() {
		return "MbtaSchedule [id=" + id + ", name=" + name + ", arrivalTime=" + arrivalTime + ", departureTime="
				+ departureTime + ", routeName=" + routeName + ", tripName=" + tripName + "]";
	}
	
	
	
	
	
	
	
}
