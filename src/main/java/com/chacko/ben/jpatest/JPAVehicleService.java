package com.chacko.ben.jpatest;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class JPAVehicleService {
	
	@Autowired
	JPARepository repository;
	
	public void create(JPAVehicleData vehicle) {
		repository.save(vehicle);
	}
	
	public List<JPAVehicleData> get() {
		List<JPAVehicleData> list = new ArrayList<>();
		repository.findAll().forEach(data -> list.add(data));
		return list;
	}
}
