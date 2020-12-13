package com.carparking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CarParkingLot")
public class CarParkingLot {
	
	@Id
	@GeneratedValue
	@Column
	private Integer carParkingLotId;
	
	@Column
	private Integer addressId;
	
	@Column
	private String carParkingLot;
	
	@Column
	private String carParkingLotType;
	
	@Column
	private String avaliableStatus;
	
	public CarParkingLot(Integer carParkingLotId,Integer addressId,String carParkingLot,String carParkingLotType)
	{
		this.carParkingLotId = carParkingLotId;
		this.addressId = addressId;
		this.carParkingLot=carParkingLot;
		this.carParkingLotType=carParkingLotType;
	}
	
	public Integer getParkingLotId() {
		return carParkingLotId;
	}
	
	public void setParkingLotId(Integer carParkingLotId) {
		this.carParkingLotId=carParkingLotId;
	}
	
	public Integer getAddressId() {
		return addressId;
	}
	
	public void setAddressId(Integer addressId) {
		this.addressId=addressId;
	}
	
	public String getParkingLot() {
		return carParkingLot;
	}
	
	public void setParkingLot(String carParkingLot) {
		this.carParkingLot=carParkingLot;
	}
	
	public String getCarParkingLotType() {
		return carParkingLotType;
	}
	
	public void setCarParkingLotType(String carParkingLotType) {
		this.carParkingLotType=carParkingLotType;
	}
	
	public String getAvaliableStatus() {
		return avaliableStatus;
	}
	
	public void setAvaliableStatus(String avaliableStatus) {
		this.avaliableStatus=avaliableStatus;
	}
	
}
