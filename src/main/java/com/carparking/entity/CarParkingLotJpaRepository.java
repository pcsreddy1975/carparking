package com.carparking.entity;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.carparking.domain.CarParkingLot;

@Repository
@Transactional
public class CarParkingLotJpaRepository {

	// connect to the database
	@PersistenceContext
	EntityManager entityManager;

	/**
	 * Method used to return parking lots information based on zipCode.
	 * @param zipCode
	 * @return list
	 */
	public List<CarParkingLot> getParkingLotsBasedOnZipCode(Integer zipCode) {

		Query query = entityManager.createNativeQuery
				("SELECT CA.CITY as city,CA.STREET_NAME as streetName,CA.ZIP_CODE as zipCode,CL.CAR_PARKING_LOT as CarParkingLot,"+
						" CAR_PARKING_LOT_TYPE as carParkingLotType FROM CAR_PARKING_ADDRESS CA, CAR_PARKING_LOT CL " +
						" WHERE CA.ADDRESS_ID=CL.ADDRESS_ID AND CL.AVALIABLE_STATUS='Y'AND ZIP_CODE=?1");

		List<CarParkingLot> list = query.setParameter(1, zipCode).getResultList();
		return list;
	}
	
	/**
	 * Method used to return parking lots information based on streetName and City
	 * @param streetName
	 * @param city
	 * @return carParkingLotsList
	 */
	public List<CarParkingLot> getParkingLotsBasedOnStreeNameAndCity(String streetName, String city) {
		Query query = entityManager.createNativeQuery
				("SELECT CA.CITY as city,CA.STREET_NAME as streetName,CA.ZIP_CODE as zipCode,CL.CAR_PARKING_LOT as CarParkingLot,"+
						" CAR_PARKING_LOT_TYPE as carParkingLotType FROM CAR_PARKING_ADDRESS CA, CAR_PARKING_LOT CL " +
						" WHERE CA.ADDRESS_ID=CL.ADDRESS_ID AND CL.AVALIABLE_STATUS='Y' AND street_Name=?1 and city=?2");
		
		query.setParameter(1, streetName);
		query.setParameter(2, city);

		List<CarParkingLot> carParkingLotsList = query.getResultList();
		return carParkingLotsList;
	}

}
