package com.carparking.service;

import java.util.List;
import javax.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.carparking.domain.CarParkingLot;
import com.carparking.entity.CarParkingLotJpaRepository;

@Repository
@Transactional
public class CarParkingService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	CarParkingLotJpaRepository repository;

	/**
	 * Method used to return parking lots information based on ZipCode.
	 * @param zipCode
	 * @return carParkingLotsList
	 * @throws Exception
	 */
	public List<CarParkingLot>  getParkingLotsBasedOnZipCode(Integer zipCode) throws Exception {
		
		List<CarParkingLot> carParkingLotsList = repository.getParkingLotsBasedOnZipCode(zipCode);
		return carParkingLotsList;
		
	}
	
	/**
	 * Method used to return parking lots information based on Street Name and City.
	 * @param streetName
	 * @param city
	 * @return
	 * @throws Exception
	 */
	public List<CarParkingLot> getParkingLotsBasedOnStreeNameAndCity(String streetName,String city) throws Exception {
		List<CarParkingLot> carParkingLotList = repository.getParkingLotsBasedOnStreeNameAndCity(streetName,city);
		return carParkingLotList;
		
	}
}
