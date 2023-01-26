Feature: HomePage

  Scenario: Verify if the main elements of home page is exist
    Given User navigate to login page
    When User enter valid email
    And User enter valid password
    Then User should see the following elements
      | Home          |
      | My Network    |
      | Jobs          |
      | Messaging     |
      | Notifications |
