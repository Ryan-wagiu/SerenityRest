Feature: Delete Account
  As a admin
  I want to Delete Account
  So I can Delete a Account

  Scenario: Delete account by valid userid
    Given I set url and valid token to get account
    When I request Delete Account
    And  I input valid userid
    Then I will get 200
    And Delete success message

  Scenario: Delete account by invalid userid
    Given I set url and valid token to get account
    When I request Delete Account
    And  I input invalid userid
    Then I will get 401
    And Delete forbiden message

  Scenario: Delete account by invalid userid
    Given I set url and valid token to get account
    When I request Delete Account
    And  I input invalid userid
    Then I will get 401
    And Delete forbiden message