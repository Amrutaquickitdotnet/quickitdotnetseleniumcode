Feature: I want to perform login functionality
   Scenario: Perform login functionality of orangeHRM
    Given I have valid url to be enter
    When I enters credentials to login Details
    | username | password	|
    | Admin | admin123	|
    And click on login button
   	Then I can able to login successfully
