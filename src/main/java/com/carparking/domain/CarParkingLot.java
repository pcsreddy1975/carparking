package com.carparking.domain;

import java.io.Serializable;

public class CarParkingLot implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String city;
	private String streetName;
	private String zipCode;
	private String carParkingLot;
	private String carParkingLotType;
	
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city=city;
	}
	
	public String getStreetName() {
		return streetName;
	}
	
	public void setStreetName(String streetName) {
		this.streetName=streetName;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode=zipCode;
	}
	
	public String getCarParkingLot() {
		return carParkingLot;
	}
	
	public void setCarParkingLot(String carParkingLot) {
		this.carParkingLot=carParkingLot;
	}
	
	public String getCarParkingLotType() {
		return carParkingLotType;
	}
	
	public void setCarParkingLotType(String carParkingLotType) {
		this.carParkingLotType=carParkingLotType;
	}

}
