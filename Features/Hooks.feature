# Hooks 

Feature: As a valid user when I enter my credentials, I should be to login
 

 
  Scenario: As an editor I should be able to login to the application.
   
    When I go to the application
    And I enter valid username and valid password 
    	|admin|admin|