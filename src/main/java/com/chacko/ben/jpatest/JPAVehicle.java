package com.chacko.ben.jpatest;

import lombok.Data;

@Data
public class JPAVehicle {
	private String model;

	public JPAVehicle() {
	}

	public JPAVehicle(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
