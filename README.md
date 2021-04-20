# CucumberBasics
#Feature which is used for BDD framework.Which was step by step execution of actions.We was understandable to both QA and BA as well.Easy to trace the modules.
 #Feature: LoginFeature
  This feature deals with the login functionality of the application
  Scenario: Login with correct username and password
    Given I navigate to the login page
    And I enter the following for Login
      | username | password      |
      | admin    | adminpassword |
    And I click login button
    Then I should see the userform page

  Scenario Outline: Login with correct username and password using Scenario outline
    Given I navigate to the login page
    And I enter <username> and <password>
    And I click login button
    Then I should see the userform page

    Examples:
      | username | password   |
      | execute  | automation |
      | admin    | admin      |
      | testing  | qa         |


