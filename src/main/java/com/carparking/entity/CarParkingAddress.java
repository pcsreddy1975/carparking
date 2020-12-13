package com.carparking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CarParkingAddress")
public class CarParkingAddress {
	
	@Id
	@GeneratedValue
	@Column
	private Integer addressId;
	
	@Column
	private String streetName;
	
	@Column
	private String city;
	
	@Column
	private Integer zipCode;
	
	public CarParkingAddress() {
		
	}
	
	public CarParkingAddress (Integer addressId, String streetName, String city, Integer zipCode) {
		super();
		this.addressId=addressId;
		this.streetName=streetName;
		this.city=city;
		this.zipCode=zipCode;
	}

	public CarParkingAddress (String streetName, String city, Integer zipCode) {
		super();
		this.streetName=streetName;
		this.city=city;
		this.zipCode=zipCode;
	}
	
	public Integer getAddressId() {
		return addressId;
	}
	
	public void setAddressId(Integer addressId) {
		this.addressId=addressId;
	}
	
	public String getName() {
		return streetName;
	}
	
	public void setStreetName(String streetName) {
		this.streetName=streetName;
	}	
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city=city;
	}
	
	public Integer getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(Integer zipCode) {
		this.zipCode=zipCode;
	}
	
}
