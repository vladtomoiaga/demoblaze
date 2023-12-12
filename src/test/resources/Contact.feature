Feature: Login Functionality feature
  In order to do online shopping
  As a valid Demoblaze  customer
  I want to login successfully

  Scenario: Contact Successful

    Given I am in the login page of the Demoblaze
    When I enter valid <username> and <password>
    Then I should be taken to the Overview page