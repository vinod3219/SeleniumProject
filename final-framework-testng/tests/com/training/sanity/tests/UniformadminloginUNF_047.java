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

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class UniformadminloginUNF_047 {
  
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
	
	}
	
	@Test
  public void Adminlogin1() {
	
	adminloginPOM.sendUserName("admin");
	adminloginPOM.sendPassword("admin@123");
	adminloginPOM.clickLoginBtn();
	dashboardPOM.shoppingcart();
	dashboardPOM.clickorderlink();
	ordersPOM.ordersid("7");
	ordersPOM.orderfilter();
  }
	
	@Test
	  public void Adminlogin2() {
		
		adminloginPOM.sendUserName("admin");
		adminloginPOM.sendPassword("admin@123");
		adminloginPOM.clickLoginBtn();
		dashboardPOM.shoppingcart();
		dashboardPOM.clickorderlink();
		ordersPOM.orderstatus();
		ordersPOM.orderstatusp();
		ordersPOM.orderfilter();
  }
	
	@Test
	  public void Adminlogin3() {
		
		adminloginPOM.sendUserName("admin");
		adminloginPOM.sendPassword("admin@123");
		adminloginPOM.clickLoginBtn();
		dashboardPOM.shoppingcart();
		dashboardPOM.clickorderlink();
		ordersPOM.dateadded("2018-02-18");
		ordersPOM.orderfilter();
	  }
	
	@Test
	  public void Adminlogin4() {
		
		adminloginPOM.sendUserName("admin");
		adminloginPOM.sendPassword("admin@123");
		adminloginPOM.clickLoginBtn();
		dashboardPOM.shoppingcart();
		dashboardPOM.clickorderlink();
		ordersPOM.customer("Neha");
		ordersPOM.orderfilter();
	  }
	
	@Test
	  public void Adminlogin5() {
		
		adminloginPOM.sendUserName("admin");
		adminloginPOM.sendPassword("admin@123");
		adminloginPOM.clickLoginBtn();
		dashboardPOM.shoppingcart();
		dashboardPOM.clickorderlink();
		ordersPOM.totalprice("6");
		ordersPOM.orderfilter();
	  }
	
	@Test
	  public void Adminlogin6() {
		
		adminloginPOM.sendUserName("admin");
		adminloginPOM.sendPassword("admin@123");
		adminloginPOM.clickLoginBtn();
		dashboardPOM.shoppingcart();
		dashboardPOM.clickorderlink();
		ordersPOM.datemodified("2018-02-18");
		ordersPOM.orderfilter();
	  }
	
	@AfterMethod
  public void afterMethod() {
   
  }

  
  @AfterClass
  public void afterClass() {
  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
  driver.quit();
  }

}
