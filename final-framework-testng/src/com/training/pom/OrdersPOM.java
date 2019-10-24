package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrdersPOM {
	private WebDriver driver;
	
	public OrdersPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//tbody//tr[1]//td[1]//input[1]")
	private WebElement checkbox;
	
	@FindBy(xpath="//button[@id='button-delete133']//i[@class='fa fa-trash-o']")
	private WebElement delete;
	
	public void clickcheckbox() {
		this.checkbox.click();
	}
	
	public void delete() {
		this.delete.click();
	}
	
	public void alertaccept(){
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
	
	public void alertdismiss(){
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
	}
	
}
