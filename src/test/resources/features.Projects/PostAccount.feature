Feature: Post
  As a admin
  I want to post accont
  So I can input new accont

  Scenario: Post Account Authorized with valid username and password
    Given I set url and valid token to post account
    When I input valid username and password
    Then I will get 200
    And get success message

  Scenario: Post Account Authorized with null username and password
    Given I set url and valid token to post account
    When I input null username and password
    Then I will get 401
    And get forbiden message message

  Scenario: Post Account Authorized with invalid username and password
    Given I set url and valid token to post account
    When I input invalid username and password
    Then I will get 401
    And get forbiden message message

  Scenario: Post Account GenerateToken with invalid username and password
    Given I set url and valid token to post account
    When I input valid username and password
    Then I will get 200
    And get success message

  Scenario: Post Account GenerateToken with null username and password
    Given I set url and valid token to post account
    When I input null username and password
    Then I will get 401
    And get forbiden message message

  Scenario: Post Account GenerateToken with invalid username and password
    Given I set url and valid token to post account
    When I input invalid username and password
    Then I will get 401
    And get forbiden message message

  Scenario: Post Account Userid with valid username and password
  Post Account GenerateToken with invalid username and password
    Given I set url and valid token to post account
    When I input valid username and password
    Then I will get 200
    And get success message

  Scenario: Post Account Userid with null username and password
    Given I set url and valid token to post account
    When I input invalid username and password
    Then I will get 401
    And get forbiden message message

  Scenario: Post Account Userid with invalid username and password
    Given I set url and valid token to post account
    When I input null username and password
    Then I will get 401
    And get forbiden message message
