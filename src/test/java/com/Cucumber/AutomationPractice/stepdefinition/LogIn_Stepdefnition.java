package com.Cucumber.AutomationPractice.stepdefinition;

import org.apache.log4j.Logger;
import org.junit.After;
import org.openqa.selenium.By;

import com.Cucumber.AutomationPractice.pageobjects.Homepage;
import com.Cucumber.AutomationPractice.pageobjects.MyAccountpage;
import com.Cucumber.AutomationPractice.testbase.Testbase;
import com.Cucumber.AutomationPractice.utils.TestUtil;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogIn_Stepdefnition extends Testbase {

	// Loginpage loginpage;
	TestUtil utils;
	Homepage homepage;
	Testbase testbase;
	MyAccountpage myaccount;;
	 private StringBuffer verificationErrors = new StringBuffer();
	private static final Logger log = Logger.getLogger(LogIn_Stepdefnition.class.getName());

	public LogIn_Stepdefnition() {
		super();
	}

	@Given("^user navigate to Application \"([^\"]*)\"$")
	public void user_navigate_to_Application(String arg1) throws Throwable {
		log.info("************given*************");
		initialization();
	}

	@When("^user clicks on My Account$")
	public void user_clicks_on_My_Account() throws Throwable {
		log.info("************when*************");
		utils = new TestUtil();
		// create object of homepages
		homepage = new Homepage();
		myaccount = homepage.clickonMyaccount();
		log.info("clicked on my account");
	}

	@When("^user enters valid emailadress \"([^\"]*)\" and  password \"([^\"]*)\"$")
	public void user_enters_valid_emailadress_and_password(String arg1, String arg2) throws Throwable {
		log.info("user enters email and password");
		myaccount.enterEmailId(arg1);
		myaccount.enterPassword(arg2);
		log.info("entered valid emailid and password");
	}

	@Then("^user clicks on sigin Button$")
	public void user_clicks_on_sigin_Button() throws Throwable {
		myaccount.clickOnSubmit();
		log.info("user clicked on signin button");
	}

	@Then("^login should be succesfull$")
	public void login_should_be_succesfull() throws Throwable {
		myaccount.verifyloginstatus("Account Summary ");
		 String verificationErrorString = verificationErrors.toString();
		
		// myaccount.teardown();
	}

	@When("^user enters invalid emailaddress \"([^\"]*)\" and  password \"([^\"]*)\"$")
	public void user_enters_invalid_emailaddress_and_password(String arg1, String arg2) throws Throwable {
		myaccount.enterEmailId(arg1);
		myaccount.enterPassword(arg2);
		log.info("user entered invalid emailid and password");
	}

	@When("^user clicks on Signin Button$")
	public void user_clicks_on_Signin_Button() throws Throwable {
		myaccount.clickOnSubmit();
		log.info("user again clicked on signin button");
	}

	@Then("^login should be unsuccesfull$")
	public void login_should_be_unsuccesfull() throws Throwable {
		String msg = driver.findElement(By.className("msgContent")).getText();
		myaccount.verifyloginstatus("Account Summary ");
		log.info("msg is not succesfull" + msg);
		// testbase.teardown();
	}

	@After
	public void teardown() {
		driver.quit();
	}

}
