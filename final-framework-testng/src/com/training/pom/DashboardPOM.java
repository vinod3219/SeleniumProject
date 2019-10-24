package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPOM {
	private WebDriver driver;
	
	public DashboardPOM(WebDriver driver) {
	this.driver = driver; 
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//i[@class='fa fa-shopping-cart fa-fw']")
	private WebElement cart;
	
	@FindBy(xpath="//li[@id='sale']/ul/li[1]/a")
    private WebElement Orders;
	
	@FindBy(xpath="//a[contains(text(),'Recurring Orders')]")
    private WebElement RecurringOrders;	
	
	@FindBy(xpath="//li[@id='sale']//ul//li//a[contains(text(),'Returns')]")
    private WebElement Returns;
	
	public void shoppingcart()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions action = new Actions(driver);
		action.moveToElement(cart).build().perform();
	}
	
	public void clickorderlink() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.Orders.click(); 
	}
	
	public void clickrecurringOrderslink() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.RecurringOrders.click(); 
	}
	
	public void clickreturnslink() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.Returns.click(); 
	}
}
