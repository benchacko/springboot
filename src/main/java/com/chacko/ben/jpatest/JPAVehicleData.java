package com.chacko.ben.jpatest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "JPA_VEHICLE")
public class JPAVehicleData {
	@Id
	@GeneratedValue()
	private long id;
	
	@Column(name = "MODEL", length = 25, nullable = false)
	private String model;

	public JPAVehicleData() {
	}

	public JPAVehicleData(String id, String model) {
		this.model = model;
	}
	
	public JPAVehicle toModel() {
		return new JPAVehicle(model);
	}
	
}
