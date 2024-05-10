package com.Tricentis.TestCases;

import org.testng.annotations.Test;
import com.Utilities.Utility;

public class VehicleDataTest extends BaseClass
{
  @Test(priority = 1)
  public void setVehicleData() 
  {
	  vd.selectVehicle("Truck");
	  vd.setMake("Nissan");
	  vd.enginePerformance("100");
	  vd.dateOfManufacture("10/09/2000");
	  vd.numberOfSeats(2);
	  vd.fuelType("Diesel");
	  vd.listPrice("1000");
	  vd.liscense("24A2345");
	  vd.annuaMileage("1000");
	  Utility.capture(driver);
	  vd.clickNext();
  }
  @Test(priority=2)
  public void setInsurantData() 
  {
	  
	  id.setFirstName("Matthews");
	  id.setLastName("Hill");
	  id.setDOB("10/10/1999");
	  id.setGender("male");
	  id.setAddress("123, Hiltn Rd");
	  id.selectCountry("Brazil");
	  id.setZip("12345");
	  id.setCity("Rio");
	  id.setWebsite("www.abc.com");
	  Utility.capture(driver);
	  
  }
  
}
