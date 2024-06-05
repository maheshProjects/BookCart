@Run
Feature: Book cart page automation

  Scenario: First page automation
    Given User select to the chrome browser
    When User navigate to the URL
    Then User should verify the message "BOOK CART"

  Scenario: First page automation
    Given User select to the chrome browser
    When User navigate to the URL
    Then User should verify the message  for "Price Filter"

  Scenario: First page automation
    Given User select to the chrome browser
    When User navigate to the URL
    And User click the add cart option
    Then User should verify the message after click addcart option "Your shopping cart is empty"
    When User click the continue option after add cart is empty
