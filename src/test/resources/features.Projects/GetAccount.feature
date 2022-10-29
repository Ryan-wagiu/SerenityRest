Feature: Get Account
  As a admin
  I want to get Account
  So I can see account search

  Scenario: Get Account by valid userid
    Given I set url and valid token to get account
    When I request get Account
    And  I input userid
    Then I will get 200
    And get success message

  Scenario: Get Account by null userid
    Given I set url and valid token to get account
    When I request get Account
    And  I input null userid
    Then I will get 401
    And get forbiden message

  Scenario: Get Account by invalid userid
    Given I set url and invalid token to get account
    When I request get Account
    And  I input null userid
    Then I will get 401
    And get forbiden message
