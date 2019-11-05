package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CatelogPOM {
	private WebDriver driver;
	
	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement addnew;
	
	@FindBy(xpath="//input[@id='input-name1']")
	private WebElement CategoryName;
	
	@FindBy(xpath="//div[@class='note-editable panel-body']")
	private WebElement Cdescrition;
	
	@FindBy(xpath="//input[@id='input-meta-title1']")
	private WebElement MetatagTitle;
	
	@FindBy(xpath="//textarea[@id='input-meta-description1']")
	private WebElement MetatagDesc;
	
	@FindBy(xpath="//i[@class='fa fa-save']")
	private WebElement csave;
	
	public CatelogPOM(WebDriver driver) {
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
	
	public void CategoryName(String name) {
		this.CategoryName.clear();
		this.CategoryName.sendKeys(name);
	}
	
	public void Cdescrition(String desc) {
		this.Cdescrition.clear();
		this.Cdescrition.sendKeys(desc);
	}

	public void MetatagTitle(String title) {
		this.MetatagTitle.clear();
		this.MetatagTitle.sendKeys(title);
	}
	
	public void MetatagDesc(String desc) {
		this.MetatagDesc.clear();
		this.MetatagDesc.sendKeys(desc);
	}
	
	public void csave() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.csave.click(); 
	}
		
}