Feature: Login

  Scenario: Successful login
    Given the user open the login page
    When they log in with valid credentials
    Then they should see the inventory page