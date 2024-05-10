package com.Tricentis.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.Tricentis.Pages.HomePage;
import com.Tricentis.Pages.InsurantDataPage;
import com.Tricentis.Pages.VehicleDataPage;

public class BaseClass 
{
	public WebDriver driver;
	public HomePage hp;
	public VehicleDataPage vd;
	public InsurantDataPage id;
	
	@BeforeSuite
	public void setupBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sampleapp.tricentis.com/101/index.php#");
		hp=new HomePage(driver);
		vd=new VehicleDataPage(driver);
		id=new InsurantDataPage(driver);
	}

}
