package com.Tricentis.TestCases;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import com.Tricentis.Pages.HomePage;

public class HomePageTest extends BaseClass
{
  @Test(priority=1)
  public void validateURL() 
  {
	  
	  String actUrl = hp.getAutomobile();
	  Assert.assertTrue(actUrl.contains(""), "Test Fail: Url not matched");
	  
  }
  
  @Test(priority=2)
  public void validateTitle() 
  {
	  
  }
  
  @Test(priority=1)
  public void signIn() 
  {
	  
  }
  
}
