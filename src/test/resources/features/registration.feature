Feature: New Account Registration
  Scenario: To create new account

    Given User is on login page
    And User enter valid email address
    When all information entered
    Then account created

