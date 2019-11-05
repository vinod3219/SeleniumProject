package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductsPOM {
	private WebDriver driver;
	String msg;
	String msg2 = "You have modified products!";
	
	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement addnew;

	@FindBy(xpath="//input[@id='input-name1']")
	private WebElement ProductName;
	
	@FindBy(xpath="//div[@class='note-editable panel-body']")
	private WebElement Pdescrition;
	
	@FindBy(xpath="//input[@id='input-meta-title1']")
	private WebElement Metatagtitle;
	
	@FindBy(xpath="//a[contains(text(),'Data')]")
	private WebElement Datatab;
	
	@FindBy(xpath="//input[@id='input-model']")
	private WebElement Model;
	
	@FindBy(xpath="//a[contains(text(),'Links')]")
	private WebElement Linkstab;
	
	@FindBy(xpath="//input[@id='input-category']")
	private WebElement PCategories;
	
	@FindBy(xpath="//div[@class='panel-body']//div[2]//div[1]//ul[1]")
	private WebElement PCategorieselect;
	
	@FindBy(xpath="//i[@class='fa fa-save']")
	private WebElement PSave;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement msg1;

	public ProductsPOM(WebDriver driver) {
	this.driver = driver; 
	PageFactory.initElements(driver, this);
	}
	
	public void addnew() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.addnew.click(); 
	}
	
	public void productName(String name) {
		this.ProductName.clear();
		this.ProductName.sendKeys(name);
	}
	
	public void Pdescrition(String desc) {
		this.Pdescrition.clear();
		this.Pdescrition.sendKeys(desc);
	}
	
	public void Metatagtitle(String desc) {
		this.Metatagtitle.clear();
		this.Metatagtitle.sendKeys(desc);
	}
	
	public void Datatab() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.Datatab.click(); 
	}
	
	public void model(String name) {
		this.Model.clear();
		this.Model.sendKeys(name);
	}
	
	public void Linkstab() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.Linkstab.click(); 
	}
	
	public void PCategories() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.PCategories.click(); 
	}
	
	public void PCategorieselect() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.PCategorieselect.click(); 
	}
	
	public void PSave() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.PSave.click(); 
	}
	
	public void successmsg() {
		msg = msg1.getText(); 
		System.out.println(msg);
		Assert.assertEquals(msg2, msg);
	}
	
	
	
	
	
	
}