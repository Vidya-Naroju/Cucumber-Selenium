package com.Cucumber.AutomationPractice.pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Cucumber.AutomationPractice.stepdefinition.Cart_Stepdefnition;
import com.Cucumber.AutomationPractice.stepdefinition.Dresses_Stepdefnition;
import com.Cucumber.AutomationPractice.stepdefinition.SignIn_Stepdefnition;
import com.Cucumber.AutomationPractice.stepdefinition.Women_Stepdefinition;
import com.Cucumber.AutomationPractice.testbase.Testbase;

import junit.framework.Assert;

public class Homepage extends Testbase {

	private final Logger log = Logger.getLogger(Homepage.class);

	@FindBy(className	= "SiteLogo gold")
	WebElement Logo;

	@FindBy(xpath = "//a[@title='Women']")
	WebElement Women;

	@FindBy(xpath = "//a[@title='Men']")
	WebElement Men;

	@FindBy(xpath = "//a[@title='Boys']")
	WebElement Boys;

	@FindBy(xpath = "//a[@title='Sign in to view account details']")
	WebElement Myaccount;

	@FindBy(className = "BagSummary MiniBagNonSecure")
	WebElement Cart;
	
	@FindBy(className = "checkout ")
	WebElement Checkout;
	
	@FindBy(id = "headerFlagSelector")
	WebElement Flagcontainer;
	
	@FindBy(className="view_edit_bag")
	WebElement view_edit_bag;

	@FindBy(linkText = "Help")
	WebElement Help;

	public Homepage() {
		PageFactory.initElements(driver, this);
	}

	public boolean logo() {
		return Logo.isDisplayed();
	}
	
	public Womenpage clickonWomen() {
		Women.click();
		log.info("clicked on women");
		return new Womenpage();
	}
	public Boyspage clickonBoys() {
		Boys.click();
		log.info("clicked on Boy");
		return new Boyspage();
	}

public Menspage clickonMen() {
Men.click();
log.info("clicked on Men");
return new Menspage();
	}
	
public void clickonCart() {
	this.Cart.click();
	log.info("clicked on cart");
}
	public View_Edit_Bagpage clickonViewEditpage() {
		
		log.info("clicked on viewEditPage");
		view_edit_bag.click();
		return new View_Edit_Bagpage();
	}
	public Checkoutpage clickonCheckout() {
		Checkout.click();
		log.info("clicked on checkout");
			return new Checkoutpage();
	}

	public MyAccountpage clickonMyaccount() {
		Myaccount.click();
		return new  MyAccountpage();
	}
	
	public void clickOnFlagContainer() {
	this.Flagcontainer.click();
	}

	public void mouseOver(String data) {
		log.info("doing mouse over on :" + data);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'" + data + "')]"))).build().perform();
	}

	/*
	 * public ProductCategoryPage clickOnIntem(String data){
	 * log.info("clickin on :"+data);
	 * driver.findElement(By.xpath("//*[contains(text(),'"+data+"')]")).click();
	 * return new ProductCategoryPage(driver); }
	 * 
	 * public ProductCategoryPage clickOnMenu(WebElement element){
	 * log.info("clickin on : "+element.getText()); element.click(); return new
	 * ProductCategoryPage(driver); }
	 */


	

}
