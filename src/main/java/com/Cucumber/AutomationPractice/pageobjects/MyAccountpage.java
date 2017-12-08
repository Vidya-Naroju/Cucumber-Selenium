package com.Cucumber.AutomationPractice.pageobjects;

import org.assertj.core.api.SoftAssertionError;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Cucumber.AutomationPractice.testbase.Testbase;

import junit.framework.Assert;

public class MyAccountpage extends Testbase {

	@FindBy(id = "EmailOrAccountNumber")
	WebElement EmailId;

	@FindBy(id = "Password")
	WebElement Password;

	@FindBy(className = "forgottenPassword")
	WebElement ForgotPassword;

	@FindBy(name= "SignInNow")
	WebElement SignInNow;
	
	@FindBy(linkText="Continue")
	WebElement newCustomer;

	public  MyAccountpage() {
		 
		PageFactory.initElements(driver, this);
	}

	public void enterEmailId(String Emailid) {
		this.EmailId.sendKeys(Emailid);
	}
	
	public void enterPassword(String Password) {
	this.Password.sendKeys(Password);
	}
	
	public Homepage clickOnSubmit() {
		SignInNow.click();
		return new Homepage();
	}
	
	public Registerpage clickonNewCustomer() {
		newCustomer.click();
		return new Registerpage();
	}
	public void verifyloginstatus(String  msg) {
		System.out.println(msg);
		Assert.assertTrue( driver.getTitle().contains(msg));
	
	}
	public void verifyRegisterform(String  msg) {
	Assert.assertTrue( driver.getTitle().contains(msg));
	
	}
	

}
