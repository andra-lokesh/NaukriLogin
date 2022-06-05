

@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @editProfile
  Scenario: Title of your scenario
  Given user is on login page
    Then user entered"<username>" user name
    And user entered"<password>" password
    Then user click on login button
    Then Clear popup
    Given mouseHover on My Naukri
  	Then Click on edit profile
   
  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
