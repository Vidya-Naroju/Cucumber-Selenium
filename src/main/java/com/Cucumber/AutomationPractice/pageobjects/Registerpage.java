package com.Cucumber.AutomationPractice.pageobjects;

import org.apache.log4j.Logger;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Cucumber.AutomationPractice.testbase.Testbase;
import com.Cucumber.AutomationPractice.utils.TestUtil;

public class Registerpage extends Testbase {

	private final Logger log = Logger.getLogger(Registerpage.class);

	@FindBy(name = "Title")
	WebElement Title;

	@FindBy(id = "FirstName")
	WebElement Firstname;

	@FindBy(id = "LastName")
	WebElement Lastname;

	@FindBy(id = "Email")
	WebElement emailid;

	@FindBy(id = "Password")
	WebElement password;

	@FindBy(id = "PasswordHint")
	WebElement PasswordHint;

	@FindBy(name = "DobDate")
	WebElement DateOfBirth;

	@FindBy(id = "PhoneNumber")
	WebElement ContactTelephone;

	@FindBy(id = "HouseNumberOrName")
	WebElement HouseNumber;

	@FindBy(id = "Postcode")
	WebElement Postcode;
	
	@FindBy(id="SearchPostcode")
	WebElement searchButton;

	@FindBy(id = "")
	WebElement FreeNextDirectory;

	@FindBy(id = "SignupButton")
	WebElement SignupButton;

	public Registerpage() {
		PageFactory.initElements(driver, this);
	}

	public void selectTitle(String title) {
		Select s = new Select(Title);
		s.selectByValue(title);
	}

	public void enterFirstname(String firstname) {
		Firstname.sendKeys(firstname);
	}

	public void enterLastname(String lastname) {
		Lastname.sendKeys(lastname);
	}

	public void enteEmailid(String emailid) {
		this.emailid.sendKeys(emailid);
	}

	public void enterPassword(String password) {
		this.password.sendKeys(password);
	}

	public void enterPasswordHint(String passwordhint) {
		this.password.sendKeys(passwordhint);
	}

	public void enterDateOfBirth(String DOB) {
		this.DateOfBirth.sendKeys(DOB);
	}

	public void enterPhoneNumber(String Phonenumber) {
		this.ContactTelephone.sendKeys(Phonenumber);
	}

	public void enterHousDetails(String HouseName) {
		this.HouseNumber.sendKeys(HouseName);
	}

	public void enterPostcode(String postcode) {
		this.Postcode.sendKeys(postcode);
	}
	
	public void clickonSearchButton() {
		searchButton.click();
	}
	

	public void clickCheckBox() {
		log.info("clickin on :");
		// 	WebElement ele=driver.findElement(By.xpath("//*[contains(text(),'"+data+"')]")).click();
	WebElement ele=	driver.findElement(By.xpath("//input[@id='ChkMarketing']"));
	TestUtil.scrollintoview(ele);
	ele.click();
		TestUtil.scrollintoview(ele);
	}
	
	public void clickonSignMeButton() {
		SignupButton.click();
		TestUtil.scrollintoview(SignupButton);
	}
	
}
