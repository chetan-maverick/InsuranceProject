package com.Tricentis.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage 
{
	private WebDriver driver; // instance 
	
	public HomePage(WebDriver driver)// base class driver local
	{
		this.driver = driver;
	}
	
	//locators
	private By automobile_link = By.id("nav_automobile");
	
	private By truck_link = By.id("nav_truck");
	
	private By motorcycle_link = By.id("nav_motorcycle");
	
	private By camper_link = By.id("nav_camper");

	public String getAutomobile()
	{
		driver.findElement(automobile_link).click();
		return driver.getCurrentUrl();
		
	}
	
	public String getTruck()
	{
		driver.findElement(truck_link).click();
		return driver.getCurrentUrl();
		
	}
	
	public String getMotorcycle()
	{
		driver.findElement(motorcycle_link).click();
		return driver.getCurrentUrl();
	}
	public String getCamper()
	{
		driver.findElement(camper_link).click();
		return driver.getCurrentUrl();
		
	}
}
