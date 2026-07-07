Feature: Log out user

  Scenario: the user log out the application
    Given the user open application the login page
    When user log in with valid credentials
    And user log out the application
    Then the user should see login page message