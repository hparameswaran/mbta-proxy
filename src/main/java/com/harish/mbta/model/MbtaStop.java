package com.harish.mbta.model;

import java.util.List;

import com.harish.mbta.model.v3.stops.Attributes;
import com.harish.mbta.model.v3.stops.Datum;
import com.harish.mbta.model.v3.stops.Stop;

public class MbtaStop {
	private String id;
	private String name;
	private String description;
	private List<MbtaSchedule> schedules;
	
	public MbtaStop() {
		super();
		
	}
	public MbtaStop(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public MbtaStop(Datum data) {
		
		this.id = data.getId();
		this.name = data.getAttributes().getName();
		if(data.getAttributes().getDescription() != null) {
			this.description = data.getAttributes().getDescription().toString();
		}
		
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public List<MbtaSchedule> getSchedules() {
		return schedules;
	}
	public void setSchedules(List<MbtaSchedule> schedules) {
		this.schedules = schedules;
	}
	@Override
	public String toString() {
		return "MbtsStop [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	
	
	
	
}
