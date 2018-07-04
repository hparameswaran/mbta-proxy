package com.harish.mbta.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harish.mbta.model.MbtaInfo;
import com.harish.mbta.model.MbtaSchedule;
import com.harish.mbta.model.MbtaStop;
import com.harish.mbta.model.v3.schedules.Schedule;
//import com.harish.mbta.model.v3.stops.Datum;
import com.harish.mbta.model.v3.stops.Stop;
import com.harish.mbta.model.v3.trips.Trip;
import com.harish.mbta.restclient.MbtaV3ApiProxy;
import com.harish.mbta.model.v3.schedules.Datum;



@Service
public class MbtaService {
	private static final Logger logger = LoggerFactory.getLogger(MbtaService.class);
	
	@Autowired
	MbtaV3ApiProxy mbtaV3ApiProxy;
	
	public MbtaInfo getMbtaInfo(String latitude,String longitude) {
		logger.debug("Looking up info :" + latitude + "," + longitude);
		
		//Get all MBTA stops within 0.002 radius of the given coordinates
		MbtaInfo mbtaInfo = new MbtaInfo(mbtaV3ApiProxy.getStopsNearBy(latitude, longitude));
		
		//For each Stop
		for (MbtaStop mbtaStop:mbtaInfo.getMbtaStop()) {
			//Get schedule within next 20 minutes
			List<MbtaSchedule> schedules = new ArrayList<MbtaSchedule>();
			mbtaStop.setSchedules(schedules);
			Schedule sched = mbtaV3ApiProxy.getScheduleForThisStop(mbtaStop.getId());
			//Get Route and Trip data associated with the schedule
			for(Datum data:sched.getData()) {
				MbtaSchedule mbtaSched = new MbtaSchedule(data);
		    	mbtaSched.setRouteName(mbtaV3ApiProxy.getRoute(data.getRelationships().getRoute().getData().getId()).getData().getAttributes().getDescription());
		    	Trip trip = mbtaV3ApiProxy.getTrip(data.getRelationships().getTrip().getData().getId());
		    	mbtaSched.setTripName(trip.getData().getId() + " : " + trip.getData().getAttributes().getHeadsign());
				schedules.add(mbtaSched);
			}
			
		}
		
		//Return filtered data from above Rest calls as MbtaInfo object
		return mbtaInfo;
	}
}
