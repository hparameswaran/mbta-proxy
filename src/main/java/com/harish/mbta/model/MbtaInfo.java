package com.harish.mbta.model;

import java.util.ArrayList;
import java.util.List;

import com.harish.mbta.model.v3.stops.Datum;
import com.harish.mbta.model.v3.stops.Stop;

public class MbtaInfo {
	
   private List<MbtaStop> mbtaStop;

	

	

	public MbtaInfo() {
		
	}

    public MbtaInfo(Stop stop) {
    	this.mbtaStop = new ArrayList<MbtaStop>();
		for(Datum data:stop.getData()) {
			mbtaStop.add(new MbtaStop(data));
		}
	}

	public List<MbtaStop> getMbtaStop() {
		return mbtaStop;
	}



	public void setMbtaStop(List<MbtaStop> mbtaStop) {
		this.mbtaStop = mbtaStop;
	}


	@Override
	public String toString() {
		return "MbtaInfo [mbtaStop=" + mbtaStop + "]";
	}
	
	

}
