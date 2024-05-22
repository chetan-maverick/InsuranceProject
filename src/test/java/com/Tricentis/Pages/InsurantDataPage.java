package com.Tricentis.Pages;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class InsurantDataPage 
{
	private WebDriver driver; 
	
	private By fnameLocator = By.id("firstname");
	private By lnameLocator = By.id("lastname");
	private By dobLocator = By.id("birthdate");
	private By maleLocator = By.xpath("//div[@class='field']//p//label[1]");
	private By femaleLocator = By.xpath("//div[@class='field']//p//label[2]");
	private By addressLocator = By.id("streetaddress");
	private By countryDopDownLocator = By.id("country");
	private By zipLocator = By.id("zipcode");
	private By cityLocator = By.id("city");
	private By websiteLocator = By.id("website");
	private By nextbuttonLocator = By.xpath("//*[@id=\\\"nextenterproductdata\\\"]");
	Select s;
	
		
	public InsurantDataPage (WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setFirstName(String firstname)
	{
		driver.findElement(fnameLocator).sendKeys(firstname);
		
		
	}
	public void setLastName(String lastname)
	{
		driver.findElement(lnameLocator).sendKeys(lastname);	
		
	}
	public void setDOB(String DOB)
	{
		driver.findElement(dobLocator).sendKeys(DOB);
		
	}
	
	public void setGender(String Gender)
	{
		if(Gender == "Male")
		{
			driver.findElement(maleLocator).click();
		}
		else
		{
			driver.findElement(femaleLocator).click();
		}
	}
	
	public void setAddress(String Address)
	{
		driver.findElement(addressLocator).sendKeys(Address);	
		
	}
	
	public void selectCountry(String CountryName)
	{
		WebElement country = driver.findElement(countryDopDownLocator);
		s = new Select(country);
		s.selectByValue(CountryName);
		
	}
	public void setZip(String zipCode)
	{
		driver.findElement(zipLocator).sendKeys(zipCode);	
		
	}
	public void setCity(String cityName)
	{
		driver.findElement(cityLocator).sendKeys(cityName);	
		
	}
	public void setOccupation(String occupation)
	{
		WebElement country = driver.findElement(By.id("occupation"));
		s = new Select(country);
		s.selectByValue(occupation);
		
	}
	public void setHobbies(String hobby) 
	{
		if(hobby.equalsIgnoreCase("Speeding"))
		{
			driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]")).click();
			
		}
		else if(hobby.equalsIgnoreCase("Bungee Jumping"))
		{
			driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[2]")).click();
			
		}
		else if(hobby.equalsIgnoreCase("Cliff Diving"))
		{
			driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[3]")).click();
			
		}
		else if(hobby.equalsIgnoreCase("Skydiving"))
		{
			driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[4]")).click();
			
		}
		else
		{
			driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[5]")).click();
		}
		
	}
	public void setWebsite(String website)
	{
		driver.findElement(websiteLocator).sendKeys(website);	
		
	}
	
	public void clickNext()
	{
		driver.findElement(nextbuttonLocator).click();
	}

}
