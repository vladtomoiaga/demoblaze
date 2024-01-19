Feature: End to End Test
  In order to do online shopping
  Create a new valid customer
  Log in as a customer with valid credentials
  Pick a product to buy
  Add to the cart that product
  Go to the cart
  Place the Order

  Scenario: End to End Successful

    Given I am in the home page of the Demoblaze
    Then I create a new valid customer
    And I logged in the Demoblaze webpage
    Then I click on Samsung galaxy s6
    And I add to cart
    Then I go to the Cart
    And I place the order