package com.carparking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.carparking.domain.CarParkingLot;
import com.carparking.service.CarParkingService;

@RestController
@RequestMapping("/carparking")
public class CarController{
	
	@Autowired
	CarParkingService carParkingService;
	
	/*
	 * Method used to return parking lots information based on zip code.
	 */
	@GetMapping("/{zipCode}")
	public ResponseEntity<List<CarParkingLot>> getParkingLotsBasedOnZipCode(@PathVariable Integer zipCode) throws Exception{

		List<CarParkingLot> carParkingLotList = carParkingService.getParkingLotsBasedOnZipCode(zipCode);
		return new ResponseEntity<List<CarParkingLot>>(carParkingLotList,HttpStatus.OK);

	}
	
	/*
	 * Method used to return parking lots information based on StreetName and City.
	 */
	@GetMapping("/streetAndCity")
	public ResponseEntity<List<CarParkingLot>> getParkingLotsBasedOnStreeNameAndCity(@RequestParam String streetName, @RequestParam String city) throws Exception{
	
		List<CarParkingLot> carParkingLotList = carParkingService.getParkingLotsBasedOnStreeNameAndCity(streetName, city);
		return new ResponseEntity<List<CarParkingLot>>(carParkingLotList,HttpStatus.OK);
	
	}
	
	
	
}