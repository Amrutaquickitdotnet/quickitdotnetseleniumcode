Feature: I want to perform login functionality
   Scenario: Perform login functionality of orangeHRM
    Given I have valid url to be enter
    When I enter 'Admin' details And I enter 'admin123' Details
    And click on login button
   	Then I can able to login successfully