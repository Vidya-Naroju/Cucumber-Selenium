package com.Cucumber.AutomationPractice.runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(plugin = {"pretty", "html:target/cucumber"},glue={"stepdefinition"})
@CucumberOptions(
features= {"src\\test\\feature\\register.feature"},
glue = "com.Cucumber.AutomationPractice.stepdefinition",
monochrome = true,
dryRun=false,
plugin = {"pretty", "html:target/cucumber"})
//tags="@Sanity")

public class RegisterRunner {

}
