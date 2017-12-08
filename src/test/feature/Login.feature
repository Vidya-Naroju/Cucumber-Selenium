#Sample Feature Definition Template
Feature: Login into application valid and invalid user

  Background:
   Given  user navigate to Application "/"
    When user clicks on My Account

  Scenario: Login unsuccesfull
    And user enters invalid emailaddress "abch@ghj.com" and  password "password"
    And user clicks on Signin Button
    Then login should be unsuccesfull

 
  Scenario: Login succesfully
    And user enters valid emailadress "vidya.naroju@gmail.com" and  password "chinna89"
    Then user clicks on sigin Button
    Then login should be succesfull
