package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductreturnsPOM {
private WebDriver driver;
	
	public ProductreturnsPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//input[@id='input-return-id']")
	private WebElement returnid;
	
	@FindBy(xpath="//input[@id='input-customer']")
	private WebElement customername;
	
	@FindBy(xpath="//button[@id='button-filter']")
	private WebElement prfilter;
	
	public void returnid(CharSequence returnid) {
		this.returnid.clear();
		this.returnid.sendKeys(returnid);
	}
	
	public void customername(String customername) {
		this.customername.clear();
		this.customername.sendKeys(customername);
	}
	
	public void clickfilterBtn() {
		this.prfilter.click(); 
	}
		
}