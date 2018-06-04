package com.chacko.ben.jpatest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JPATestController {
	
	@Autowired 
	JPAUserService userService;
	@Autowired
	JPAVehicleService vehicleService;
	
	@RequestMapping("/hello")
	public String hello() {
		JPAVehicleData vehicle = new JPAVehicleData(null, "Tesla");
		vehicleService.create(vehicle);
		userService.create(new JPAUserData(null, "Ben", vehicle));
		return "Hello World";
	}
	
	@RequestMapping("/list")
	public List<JPAUser> getList() {
		return userService.get();
	}

}
