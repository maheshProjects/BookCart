Feature: Automation for an login page

  Scenario: Automation of login details
    Given User select to the chrome browser
    When User navigate to the URL
    And User to click the login option
    Then User should verify the success messge after click the login button "New User"
    And User should verify the success messge after click the login button for Registration"Register"

  Scenario: Automation of login details without credential
    Given User select to the chrome browser
    When User navigate to the URL
    And User to click the login option
    And User to click the login button
    Then User should verify the error message after click login button "Username" and "Password"

  @Run
  Scenario Outline: Automation of registration
    Given User select to the chrome browser
    When User navigate to the URL
    And User to click the login option
    And User to click the register option
    And User enter the value of required fields "<fName>","<lName>","<uName>","<passWord>" and "<confirmPass>"
    And User click the register button after enter  all the fields

    Examples: 
      | fName  | lName | uName     | passWord   | confirmPass |
      | Mahesh | P     | mashp1997 | Mashp@1997 | Mashp@1997  |
