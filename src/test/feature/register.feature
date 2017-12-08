#Author: your.email@your.domain.com
Feature: Entering NEXT new customer registration form

  Scenario Outline: Register Form
    Given user navigates to home page
    Then user clickd on my account
    And user clicks on new costumer for registration
    Then user selects Title "<Title>"
    Then user enters First Name "<First Name>"
    Then user enters Last Name "<Last Name>"
    Then user enters Email "<Email>"
    Then user enters PasswordSHOW "<PasswordSHOW>"
    Then user enters Password HintOptional "<Password HintOptional>"
    Then user enters Date Of Birth  in DDMMYY-format "<DDMM YY >"
    Then user enters Contact Telephone "<Contact Telephone>"
    Then user enters House No./ Name "<House No./ Name>"
    Then user enters Postcode "<Postcode>" and click on search
    Then user selects nextdirectory
    Then clicks on do not receive mail check box
    And clicks on SigninButton
    Then user checks status
    And close browser
    

    Examples: 
      | Title | First Name | Last Name | Email            | PasswordSHOW | Password HintOptional | DDMMYY | Contact Telephone | House No./ Name | Postcode |
      | Mr    | asdfgh1    | macky1    | email@gmail.com1 | peter1       | My first dog name     | 200678 |        1234567809 | flat 1          | HA02Qx   |
   #   | Miss  | asdfgh2    | macky2    | email@yahoo.com2   | peter2       | my niece name         | 201289 |        1234567890 | flat2           | ha03qy   |
   #   | Mrs   | asdfgh3    | macky3    | email@hotmail.com | peter3       | my cat name           | 120790 |        1234567867 | flat3           | ha11ap   |
