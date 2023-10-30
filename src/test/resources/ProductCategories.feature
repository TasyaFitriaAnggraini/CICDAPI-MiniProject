Feature: [04_Automation] - Product Categories

  Scenario: TC24 - Add new products categories
    Given I POST create product categories endpoints
    When I POST HTTP request with valid data
    And I receive response data for product categories
    Then I receive valid HTTP response 200

  Scenario: TC25 - Add new products categories without description data payload
    Given I POST create product categories endpoints 2
    When I POST HTTP request add new categories without description data payload
    And I receive response data for add new categories without description data payload
    Then I receive valid HTTP response 200 for add new categories without description data payload

  Scenario: TC26 - Add new products categories without name data payload
    Given I POST create products categories endpoints 3
    When I POST HTTP request add new categories without name data payload
    And I receive response data for add new categories without name data payload
    Then I receive valid HTTP response 500 for add new categories without name data payload

  Scenario: TC27 - Add new products categories with invalid payload format
    Given I POST create products categories endpoints 4
    When I POST HTTP request add new categories with invalid payload format
    And I receive response data for add new categories with invalid payload format
    Then I receive valid HTTP response 500 for add new categories with invalid payload format

  Scenario: TC28 -  Add new products categories with body parameter is empty
    Given I POST add new products categories endpoints 5
    When I POST HTTP request for add new products categories with body parameter is empty
    Then I receive valid HTTP response 500 for add new products categories with body parameter is empty

  Scenario: TC29 - Get all products categories
    Given I GET all products categories endpoints
    When I GET HTTP request with valid endpoints all products categories
    Then I receive valid HTTP response 200 for get all products categories

  Scenario: TC30 - Get all products categories with invalid endpoints
    Given I GET all products categories endpoints 2
    When I GET HTTP request with invalid endpoints all products categories
    Then I receive valid HTTP response 404 for all products categories with invalid endpoints

  Scenario: TC31 - Get products categories by ID
    Given I GET products categories endpoints by ID
    When I GET HTTP request with valid ID
    Then I receive valid HTTP response 200 for get by ID

  Scenario: TC32 - Get products categories by invalid ID with character symbols
    Given I GET products categories endpoints by ID 2
    When I GET HTTP request with invalid ID with character symbols
    Then I receive valid HTTP response 500 for get by invalid ID with character symbols

  Scenario: TC33 - Get categories by invalid ID with character alphabet
    Given I GET products categories endpoints by ID 3
    When I GET HTTP request with invalid ID with character alphabet
    Then I receive valid HTTP response 400 for get by invalid ID with character alphabet

  Scenario: TC34 - Delete a products categories
    Given I DELETE a products categories endpoints
    When I DELETE HTTP request with valid ID
    Then I receive valid HTTP response 200 for delete a product categories

  Scenario: TC35 - Delete a products categories by invalid ID with character symbols
    Given I DELETE a product categories endpoints by ID
    When I DELETE HTTP request with invalid ID with character symbols
    Then I receive valid HTTP response 500 for delete a product categories with character symbols

  Scenario: TC36 - Delete a categories by invalid ID with character alphabet
    Given I DELETE a product categories endpoints by ID 2
    When I DELETE HTTP request with invalid ID with character alphabet
    Then I receive valid HTTP response 400 for delete a product categories with character alphabet
