package com.Tricentis.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class VehicleDataPage 
{
	private WebDriver driver; // instance 

	private By automobileLink = By.partialLinkText("Automobile");
	private By truckLink = By.partialLinkText("Truck");
	private By motorcycleLink = By.partialLinkText("Motorcycle");
	private By camperLink = By.partialLinkText("Camper");
	
	private By makedropDownLocator = By.xpath("//*[@id=\"make\"]");
	
	private By modellocator = By.id("model"); // motorcyle
	private By enginePerfomanceLocator = By.id("engineperformance");
	private By cylindercapacityLocator = By.id("cylindercapacity");
	private By dateOfManufactureLocator = By.id("dateofmanufacture");
	private By seatNumberLocator = By.id("numberofseats");
	private By fuelTypeLocator = By.id("fuel");
	private By payloadLocator = By.id("payload");
	private By weightLocator = By.id("totalweight");
	private By listPriceLocator = By.id("listprice");
	private By licenseplateLocator = By.id("licenseplatenumber");
	private By annualmileageLocator = By.id("annualmileage");
	private By nextButtonlocator = By.id("nextenterinsurantdata");
	

	public VehicleDataPage(WebDriver driver)// base class driver local
	{
		this.driver = driver;
	}


	public void selectVehicle(String vehicle)
	{
		switch (vehicle)
		{
		
		case "Automobile":
			driver.findElement(automobileLink).click();
			break;
		case "Truck":
			driver.findElement(truckLink).click();
		    break;
		case "Motorcycle":
			driver.findElement(motorcycleLink).click();
		    break;
		default:
			driver.findElement(camperLink).click();
			break;
		}
		
	}

	public void setMake(String make)
	{

		WebElement make_dropDown = driver.findElement(makedropDownLocator);
		Select select = new Select(make_dropDown);
		select.selectByValue(make);

	}
	public void setModel(String model) //Motorcycle
	{
		WebElement model_dropDrown = driver.findElement(modellocator);
		Select select = new Select(model_dropDrown);
		select.selectByVisibleText(model);
		

	}

	public void cyclinderCapacity(String capacity)
	{
		driver.findElement(cylindercapacityLocator).sendKeys(capacity);
	
	}

	public void enginePerformance(String performance)
	{
		driver.findElement(enginePerfomanceLocator).sendKeys(performance);

	}

	public void dateOfManufacture(String date)
	{
		driver.findElement(dateOfManufactureLocator ).sendKeys(date);

	}
	public void numberOfSeats(int index)
	{
		WebElement num_seats = driver.findElement(seatNumberLocator);
		Select select = new Select(num_seats);
		select.selectByIndex(index);
		
	}
	public void selectDrive(String drive) //right hand drive
	{
		if(drive == "yes")
		{
			driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[5]/p/label[1]")).click();
		}
		else
		{
			driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[5]/p/label[2]")).click();
		}	

	}

	public void fuelType(String fuelType)
	{
		WebElement fueltype = driver.findElement(fuelTypeLocator);
		Select select = new Select(fueltype);
		select.selectByValue(fuelType);

	}

	public void payload(String load) //111
	{
		driver.findElement(payloadLocator).sendKeys(load);

	}
	public void totalWeight(String weight) //111
	{
		driver.findElement(weightLocator).sendKeys(weight);

	}

	public void listPrice(String price) //111
	{
		driver.findElement(listPriceLocator).sendKeys(price);

	}

	public void liscense(String license) //111
	{
		driver.findElement(licenseplateLocator).sendKeys(license);

	}
	public void annuaMileage(String price) //111
	{
		driver.findElement(annualmileageLocator).sendKeys(price);

	}
	public void clickNext() 
	{
		driver.findElement(nextButtonlocator).click();;

	}


}
