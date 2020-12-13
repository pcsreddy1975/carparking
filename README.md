# CarParkingSpace
 This application returns avaliability of car parking spaces based on zip code or combination of street name and city name.
 
 Please refer to the application provided zipcodes, streetName and City in data.sql under the path src/main/resources.
 
 This application listens to two end point URL's and returns the avaliablility of car parking spaces. Please find below the end points:
 
  #1
  
    http://localhost:8080/carparking/<zip-code>
 
  #2
  
   http://localhost:8080/carparking/streetAndCity?streetName=<>&city=<>
