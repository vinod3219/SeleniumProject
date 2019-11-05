package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class OrdersPOM {
	private WebDriver driver;
	
		
	@FindBy(xpath="//tbody//tr[1]//td[1]//input[1]")
	private WebElement checkbox;
	
	@FindBy(xpath="//tr[1]//td[8]//a[2]//i[1]")
	private WebElement edit;
	
	@FindBy(xpath="//button[@id='button-customer']")
	private WebElement editcuscontinue;
	
	@FindBy(xpath="//button[@class='btn btn-danger']")
	private WebElement editproremove;
	
	@FindBy(xpath="//input[@id='input-product']")
	private WebElement chooseproduct;
	
	@FindBy(xpath="//body//div[@class='tab-content']//div[@class='tab-content']//li[1]//a[1]")
	private WebElement chooseproduct1;
	
	@FindBy(xpath="//input[@id='input-quantity']")
	private WebElement quantity;
	
	@FindBy(xpath="//button[@id='button-product-add']")
	private WebElement addproduct;
	
	@FindBy(xpath="//button[@id='button-cart']")
	private WebElement addpcontinue;
	
	@FindBy(xpath="//button[@id='button-payment-address']")
	private WebElement paycontinue;
	
	@FindBy(xpath="//button[@id='button-shipping-address']")
	private WebElement shippingcontinue;
	
	@FindBy(xpath="//button[@id='button-save']")
	private WebElement saveorder;
	
	@FindBy(xpath="//button[@id='button-delete133']//i[@class='fa fa-trash-o']")
	private WebElement delete;
	
	@FindBy(xpath="//select[@id='input-shipping-method']//optgroup")
	private WebElement shipping;
	
	@FindBy(xpath="//option[contains(text(),'Free Shipping -')]")
	private WebElement shippingclick;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement successmsg;
	
	@FindBy(xpath="//input[@id='input-order-id']")
	private WebElement ordersid;
	
	@FindBy(xpath="//button[@id='button-filter']")
	private WebElement orderfilter;
	
	@FindBy(xpath="//select[@id='input-order-status']")
	private WebElement orderstatus;
	
	@FindBy(xpath="//option[contains(text(),'Pending')]")
	private WebElement orderstatusp;
	
	@FindBy(xpath="//input[@id='input-date-added']")
	private WebElement dateadded;
	
	@FindBy(xpath="//input[@id='input-customer']")
	private WebElement customer;
	
	@FindBy(xpath="//input[@id='input-total']")
	private WebElement totalprice;
	
	@FindBy(xpath="//input[@id='input-date-added']")
	private WebElement datemodified;
	
	public OrdersPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	public void smsg() {
		this.successmsg.getText();
		Assert.assertEquals( "Success: You have modified orders!", successmsg.getText(),"Strings are matching");
	}
	
	public void shippingmethod() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.shipping.click();
		this.shippingclick.click();
	}
	
	public void clickcheckbox() {
		this.checkbox.click();
	}
	
	public void edit() {
		this.edit.click();
	}
	
	public void editcuscontinue() {
		//this.editcuscontinue.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", editcuscontinue);
	}
	
	public void editproremove() {
		this.editproremove.click();
	}
	
	public void chooseproduct(String chooseproduct) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.chooseproduct.clear();
		this.chooseproduct.sendKeys(chooseproduct);
	}
	
	public void chooseproduct1() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.chooseproduct1.click();
	}
		
	public void quantity(String quantity) {
		this.quantity.clear();
		this.quantity.sendKeys(quantity);
	}
	
	public void addproduct() {
		this.addproduct.click();
	}	
	
	public void addpcontinue() {
		this.addpcontinue.click();
	}
	
	public void paycontinue() {
		//this.paycontinue.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", paycontinue);
	}
	
	public void shippingcontinue() {
		//this.shippingcontinue.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", shippingcontinue);
	}
	
	public void saveorder() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.saveorder.click();
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
	
	public void ordersid(String id) {
		this.ordersid.clear();
		this.ordersid.sendKeys(id);
	}

	public void orderfilter() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.orderfilter.click();
		this.orderfilter.click();
	}
	
	
	public void orderstatus() {
		this.orderstatus.click();
	}
		
	public void orderstatusp() {
		this.orderstatusp.click();	
	}
		
	public void dateadded(String date) {
		this.dateadded.clear();
		this.dateadded.sendKeys(date);
	}
	
	public void customer(String name) {
		this.customer.clear();
		this.customer.sendKeys(name);
	}
	
	public void totalprice(String num) {
		this.totalprice.clear();
		this.totalprice.sendKeys(num);
	}
	
	public void datemodified(String date) {
		this.datemodified.clear();
		this.datemodified.sendKeys(date);
	}
	
}