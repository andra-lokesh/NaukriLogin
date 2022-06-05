Feature: Login Feature
  Verify if user is able to Login in to the site
@lokesh
Scenario: Login as a authenticated user
    Given user is  on homepage
    When user navigates to Login Page
    And user enters username and Password
    Then success message is displayed
    
  @login  
    Scenario: verify user is able login into application
    Given user is on login page
    Then user enteres  user name
    And user enteres password
    Then user click on login button
  #	Then Clear popup
    When verify status of loggin functionality 