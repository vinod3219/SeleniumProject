package com.training.sanity.tests;

import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AdminloginPOM;
import com.training.pom.DashboardPOM;
import com.training.pom.OrdersPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class UniformadminloginUNF_046 {
  
	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	public AdminloginPOM adminloginPOM;
	public DashboardPOM dashboardPOM;
	public OrdersPOM ordersPOM;
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}
	
	@BeforeMethod
	public void setUp() {
	driver = DriverFactory.getDriver(DriverNames.FIREFOX);
	adminloginPOM = new AdminloginPOM(driver);
	dashboardPOM = new DashboardPOM(driver);
	ordersPOM = new OrdersPOM(driver);
		
	baseUrl = properties.getProperty("baseURL");
	driver.get(baseUrl);
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	@Test
  public void Adminlogin() {
	
	adminloginPOM.sendUserName("admin");
	adminloginPOM.sendPassword("admin@123");
	adminloginPOM.clickLoginBtn();
	dashboardPOM.shoppingcart();
	dashboardPOM.clickorderlink();
	ordersPOM.clickcheckbox();
	ordersPOM.edit();
	ordersPOM.editcuscontinue();
	ordersPOM.editproremove();
	ordersPOM.chooseproduct("Blazer Girls(7-8)"); // receiving an error when adding "SPORTS T-SHIRTS"
	ordersPOM.chooseproduct1();
	ordersPOM.quantity("1");
	ordersPOM.addproduct();
	ordersPOM.addpcontinue();
	ordersPOM.paycontinue();
	ordersPOM.shippingcontinue();
	ordersPOM.shippingmethod();
	ordersPOM.saveorder();
	//ordersPOM.smsg();
	
	WebElement msg = driver.findElement(By.xpath("//div[@class='alert alert-success']"));
    Assert.assertTrue(msg.isDisplayed());
   // Assert.assertFalse(msg.isDisplayed());
	
  }
	
	@AfterMethod
  public void afterMethod() {
      
  }

  @AfterClass
  public void afterClass() {
	 driver.quit();
  }
  
}
