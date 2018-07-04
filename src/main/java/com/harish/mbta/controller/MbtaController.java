package com.harish.mbta.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;

import com.harish.mbta.model.MbtaInfo;
import com.harish.mbta.service.MbtaService;

@RestController
public class MbtaController {
	
	private static final Logger logger = LoggerFactory.getLogger(MbtaController.class);
	
	@Autowired
	MbtaService mbtaService;
	
	@GetMapping("/mbta-lookup/lat/{latitude}/long/{longitude}")
	public Resource<MbtaInfo> mbtaLookup(@PathVariable String latitude, @PathVariable String longitude) {
		logger.debug("Looking up info :" + latitude + "," + longitude);
		
		//Get the info from business layer
		MbtaInfo mbtaInfo = mbtaService.getMbtaInfo(latitude,longitude);
		
		//HATEOAS
		Resource<MbtaInfo> resource = new Resource<MbtaInfo>(mbtaInfo);
		ControllerLinkBuilder linkSelf = linkTo(methodOn(this.getClass()).mbtaLookup(latitude,longitude));
		resource.add(linkSelf.withRel("self"));
		
		
		return resource;
	}
	
}
