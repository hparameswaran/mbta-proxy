package com.harish.mbta;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.harish.mbta.model.v3.schedules.Schedule;
import com.harish.mbta.restclient.MbtaV3ApiProxy;
import com.harish.mbta.service.MbtaService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MbtaProxyApplicationTests {
	
	private static final Logger logger = LoggerFactory.getLogger(MbtaProxyApplicationTests.class);
	
	@Autowired
	MbtaV3ApiProxy mbtaV3ApiProxy;
	
	
	@Test
	public void contextLoads() {
		
		
	}
	
	@Test
	public void testLoadSchedule() {
		Schedule sched =  mbtaV3ApiProxy.getScheduleForThisStop("1389");
		logger.debug(sched.toString());
	}
	
	

}
