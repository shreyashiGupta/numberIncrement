package com.glaucous.numberIncrement.controller;

import javax.ws.rs.core.Response;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.glaucous.numberIncrement.service.NumberService;

@RestController
@RequestMapping("data")
public class NumberController {
	
	@Autowired
	NumberService numberService;
	
	@RequestMapping("/increment")
	public Response increaseCount()  {
		
		numberService.increaseCountByOne();	
		return Response.noContent().build();

	}


}
