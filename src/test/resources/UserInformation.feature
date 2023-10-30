Feature: [03_Automation] - User Information

  Scenario: TC22 - Get user information
    Given I GET user information endpoints
    When I GET HTTP request with valid token
    Then I receive valid HTTP response 200 for user information

  Scenario: TC23 - Get user information without token
    Given I GET user information endpoints 2
    When I GET HTTP request for user information without token
    Then I receive valid HTTP response 401 for user information without token