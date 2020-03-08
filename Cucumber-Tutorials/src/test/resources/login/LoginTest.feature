
Feature: User Login
  User should be able to login using valid credentials

  
  Scenario Outline: Testing login with valid credentials
    Given I open login page
    
    When I enter username as "<antonio>" and password "<demo1234>"
    And I submit login page
    
    Then I redirect to user home page
    
  	Examples:
  	|antonio|demo1234|
		|uname|pass|
    |admin|admin|
    
   

  Scenario: Testing login with invalid credentials
    Given I open login page
    
    When I enter username as "invalid" and password "demo1234"
    And I submit login page
    
    Then I am on login page
 
