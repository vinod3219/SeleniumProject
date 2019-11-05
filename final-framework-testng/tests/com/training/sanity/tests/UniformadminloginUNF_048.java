package com.training.sanity.tests;

import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AdminloginPOM;
import com.training.pom.CatelogPOM;
import com.training.pom.DashboardPOM;
import com.training.pom.OrdersPOM;
import com.training.pom.ProductsPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class UniformadminloginUNF_048 {
  
	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	public AdminloginPOM adminloginPOM;
	public DashboardPOM dashboardPOM;
	public OrdersPOM ordersPOM;
	public CatelogPOM catelogPOM;
	public ProductsPOM productsPOM;
	
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
	catelogPOM = new CatelogPOM(driver);
	productsPOM = new ProductsPOM(driver);
		
	baseUrl = properties.getProperty("baseURL");
	driver.get(baseUrl);
	
	}
	
	@Test
  public void Adminlogin() {
	
	adminloginPOM.sendUserName("admin");
	adminloginPOM.sendPassword("admin@123");
	adminloginPOM.clickLoginBtn();
	dashboardPOM.catelog();
	dashboardPOM.clickcategories();
	catelogPOM.addnew();
	catelogPOM.CategoryName("Sports Uniform");
	catelogPOM.Cdescrition("Uniform for Sports");
	catelogPOM.MetatagTitle("Sports Uniform");
	catelogPOM.MetatagDesc("Uniform for Sports");
	catelogPOM.csave();
	
	WebElement msg = driver.findElement(By.xpath("//div[@class='alert alert-success']"));
    Assert.assertTrue(msg.isDisplayed());
	
	}
    
	@Test
	  public void Adminlogin1() {
	
	adminloginPOM.sendUserName("admin");
	adminloginPOM.sendPassword("admin@123");
	adminloginPOM.clickLoginBtn();
	dashboardPOM.catelog();
    dashboardPOM.clickproducts();
    productsPOM.addnew();
	productsPOM.productName("Sports Wear");
    productsPOM.Pdescrition("Sports Wear (8-10)");
    productsPOM.Metatagtitle("Sports Wear");
    productsPOM.Datatab();
    productsPOM.model("SPU-03");
    productsPOM.Linkstab();
    productsPOM.PCategories();
    productsPOM.PCategorieselect();
    productsPOM.PSave();
    
    WebElement msg = driver.findElement(By.xpath("//div[@class='alert alert-success']"));
    Assert.assertTrue(msg.isDisplayed());
   //productsPOM.successmsg();
    
  }
	
	@AfterMethod
  public void afterMethod() {
   
  }

  
  @AfterClass
  public void afterClass() {
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  //driver.quit();
  }

}
