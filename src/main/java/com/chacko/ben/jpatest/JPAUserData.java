package com.chacko.ben.jpatest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "JPA_USER")
public class JPAUserData {
	@Id
	@GeneratedValue()
	private Long id;
	
	@OneToOne
	// @JoinColumn(name = "VEHICLE_ID")
	private JPAVehicleData vehicle;
	
	@Column(name = "USER_NAME", length = 25, nullable = false)
	private String userName;
	
	public JPAUserData() {
	}

	public JPAUserData(String id, String userName, JPAVehicleData vehicle) {
		this.userName = userName;
		this.vehicle = vehicle;
	}
	
	public JPAUser toModel() {
		return new JPAUser(userName, vehicle.toModel());
	}
}
