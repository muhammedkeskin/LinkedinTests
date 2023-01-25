Feature: Login

  Scenario: Try to login with valid email and password
    Given User navigate to login page
    When User enter valid email
    And User enter valid password
    #Then User should be able to login

  Scenario: Try to login with valid email and invalid password
    Given User navigate to login page
    When User enter valid email
    And User enter invalid password
    Then User should not be able to login

  Scenario: Try to login with invalid email and valid password
    Given User navigate to login page
    And User enter invalid email
    And User enter valid password
    Then User should not be able to login

    Scenario: Try to login with valid email and missing password
      Given User navigate to login page
      When User enter valid email
      And User enter missing password
      Then User should see the warning about missing password