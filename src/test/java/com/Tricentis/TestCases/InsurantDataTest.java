package com.Tricentis.TestCases;

import org.testng.annotations.Test;

public class InsurantDataTest extends BaseClass
{
  @Test
  public void setInsurantData() 
  {
	  
	  id.setFirstName("Matthews");
	  id.setLastName("Hill");
	  id.setDOB("10/10/1999");
	  id.setGender("Male");
	  id.setAddress("123, Hiltn Rd");
	  id.selectCountry("Brazil");
	  id.setZip("12345");
	  id.setCity("Rio");
	  id.setWebsite("abc@gmail.com");
	  
  }
}
