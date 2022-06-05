Feature: Login functionality validation 

  @Home
  Scenario: Verify the loggin functionality with valid credentials data 
    Given user is on loggin page
    Then user is on loggin button beside register button
    Then  user entered valid email address
    And user entered  valid password
    Then user click on login button
  	Then Verify user is on home page
    Then user  click edit profile
     
  

    