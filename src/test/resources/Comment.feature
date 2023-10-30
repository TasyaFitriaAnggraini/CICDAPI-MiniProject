Feature: [08_Automation] - Comment

  Scenario: TC73 - Get comment products valid endpoints
    Given I GET comment products endpoints
    When I GET HTTP request with valid data for comments products
    Then I receive valid HTTP response 200 for comments products

  Scenario: TC74 - Get comment for products invalid endpoints
    Given I GET comment products endpoints 2
    When I GET HTTP request for comments products using invalid endpoints
    Then I receive valid HTTP response 404 for comments products using invalid endpoints

  Scenario: TC75 - Create a comment for products
    Given I POST create a comment for products endpoints
    When I POST HTTP request create a comment for products
    Then I receive valid HTTP response 200 for create comment products

  Scenario: TC76 - Create a comment product invalid by ID with character symbols
    Given I POST create a comment for products endpoints by ID
    When I POST HTTP request for comment products invalid by ID with character symbols
    Then I receive valid HTTP response 500 for comment products invalid by ID with character symbols

  Scenario: TC77 - Create a comment product invalid by ID with character alphabet
    Given I POST create a comment for products endpoints by ID 2
    When I POST HTTP request for comment products invalid by ID with character alphabet
    Then I receive valid HTTP response 400 for comment products invalid by ID with character alphabet

  Scenario: TC78 - Create a comment for products with body parameter is empty
    Given I POST create a comment for products endpoints 2
    When I POST HTTP request for comment products with body parameter is empty
    Then I receive valid HTTP response 401 for comment products with body parameter is empty


