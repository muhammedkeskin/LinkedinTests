Feature: Login

  Scenario: Try to login with valid email and password
    Given User navigate to login page
    When User enter valid email
    And User enter valid password
    Then User should be able to login

  Scenario: Try to login with valid email and invalid password
    Given User navigate to login page
    When User enter valid email
    And User enter invalid password
    Then User should not be able to login

  #Scenario: Try to login with null email
    #Given User navigate to login page
    #And User enter valid password
    #Then User should not be able to login