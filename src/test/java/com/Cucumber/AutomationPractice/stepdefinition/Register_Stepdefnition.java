package com.Cucumber.AutomationPractice.stepdefinition;

import org.apache.log4j.Logger;
import org.junit.After;
import org.openqa.selenium.net.NetworkUtils;
import org.seleniumhq.jetty9.server.HomeBaseWarning;

import com.Cucumber.AutomationPractice.pageobjects.Homepage;
import com.Cucumber.AutomationPractice.pageobjects.MyAccountpage;
import com.Cucumber.AutomationPractice.pageobjects.Registerpage;
import com.Cucumber.AutomationPractice.testbase.Testbase;
import com.Cucumber.AutomationPractice.utils.TestUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class Register_Stepdefnition extends Testbase {
	Homepage homepage;
	Registerpage registerpage;
	Testbase testbase;
	MyAccountpage myaccountpage;
	TestUtil utils;

	private static final Logger log = Logger.getLogger(Register_Stepdefnition.class.getName());

	public Register_Stepdefnition() {
		super();
	}

	@Given("^user navigates to home page$")
	public void user_navigates_to_home_page() throws Throwable {
		initialization();
		homepage = new Homepage();
		utils = new TestUtil();
		log.info("fnished initialisation");
	}

	@Then("^user clickd on my account$")
	public void user_clickd_on_my_account() throws Throwable {
		myaccountpage = homepage.clickonMyaccount();
		log.info("customer clicks on myaccount");
	}

	@Then("^user clicks on new costumer for registration$")
	public void user_clicks_on_new_costumer_for_registration() throws Throwable {
		registerpage = new Registerpage();
		registerpage = myaccountpage.clickonNewCustomer();
		log.info("customer clicks on new customer for registration");
	}

	@Then("^user selects Title \"([^\"]*)\"$")
	public void user_selects_Title(String arg1) throws Throwable {
		registerpage.selectTitle(arg1);
		log.info("customer selects title");
	}

	@Then("^user enters First Name \"([^\"]*)\"$")
	public void user_enters_First_Name(String arg1) throws Throwable {
		registerpage.enterFirstname(arg1);
		log.info("firstname entered");
	}

	@Then("^user enters Last Name \"([^\"]*)\"$")
	public void user_enters_Last_Name(String arg1) throws Throwable {
		registerpage.enterLastname(arg1);
		log.info("lastname entered");
	}

	@Then("^user enters Email \"([^\"]*)\"$")
	public void user_enters_Email(String arg1) throws Throwable {
		registerpage.enteEmailid(arg1);
		log.info("emailid entered");
	}

	@Then("^user enters PasswordSHOW \"([^\"]*)\"$")
	public void user_enters_PasswordSHOW(String arg1) throws Throwable {
		registerpage.enterPassword(arg1);
		log.info("password entered");
	}

	@Then("^user enters Password HintOptional \"([^\"]*)\"$")
	public void user_enters_Password_HintOptional(String arg1) throws Throwable {
		registerpage.enterPasswordHint(arg1);
		log.info("password hint entered");
	}

	@Then("^user enters Date Of Birth  in DDMMYY-format \"([^\"]*)\"$")
	public void user_enters_Date_Of_Birth_in_DDMMYY_format(String arg1) throws Throwable {
		registerpage.enterDateOfBirth(arg1);
		log.info("date of birth entered");
	}

	@Then("^user enters Contact Telephone \"([^\"]*)\"$")
	public void user_enters_Contact_Telephone(String arg1) throws Throwable {
		registerpage.enterPhoneNumber(arg1);
		log.info("contact number entered");
	}

	@Then("^user enters House No\\./ Name \"([^\"]*)\"$")
	public void user_enters_House_No_Name(String arg1) throws Throwable {
		registerpage.enterHousDetails(arg1);
		log.info("house no. entered");
	}

	@Then("^user enters Postcode \"([^\"]*)\" and click on search$")
	public void user_enters_Postcode_and_click_on_search(String arg1) throws Throwable {
		registerpage.enterPostcode(arg1);
		log.info("entered postcode");
		registerpage.clickonSearchButton();
		log.info("clicked on search button");

	}

	@Then("^user selects nextdirectory$")
	public void user_selects_nextdirectory() throws Throwable {
		// utils.scrollintoview(element);
		log.info("clicked on next directory option");
	}

	@Then("^clicks on do not receive mail check box$")
	public void clicks_on_do_not_receive_mail_check_box() throws Throwable {
		registerpage.clickCheckBox();
		log.info("selected check button");
	}

	@Then("^clicks on SigninButton$")
	public void clicks_on_SigninButton() throws Throwable {
		registerpage.clickonSignMeButton();
		log.info("clicked on signin button");
	}

	@Then("^user checks status$")
	public void user_checks_status() throws Throwable {
		Assert.assertEquals("myaccount", driver.getCurrentUrl().contains("myAccount"));
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
		driver.quit();
	}

}
