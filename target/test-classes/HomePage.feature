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

  Scenario Outline: Verify if the main elements are working as expected
    Given User navigate to login page
    When User enter valid email
    And User enter valid password
    Then User should click every main "<elements>" on Home Page as expected
    Examples:
      | elements      |
      | Home          |
      | My Network    |
      | Jobs          |
      | Messaging     |
      | Notifications |