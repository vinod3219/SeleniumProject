package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecurringOrdersPOM {
	private WebDriver driver;
	
	public RecurringOrdersPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//input[@id='input-order-recurring-id']")
	private WebElement recurringid;
	
	@FindBy(xpath="//i[@class='fa fa-search']")
	private WebElement rfilter;
	
	public void recurringid(CharSequence recurringid) {
		this.recurringid.clear();
		this.recurringid.sendKeys(recurringid);
	}
	
	public void clickfilterBtn() {
		this.rfilter.click(); 
	}
}
