package com.chacko.ben.jpatest;

public class JPAUser {
	private String userName;
	private JPAVehicle vehicle;
	
	public JPAUser() {
	}

	public JPAUser(String userName, JPAVehicle vehicle) {
		this.userName = userName;
		this.vehicle = vehicle;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public JPAVehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(JPAVehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	
}
