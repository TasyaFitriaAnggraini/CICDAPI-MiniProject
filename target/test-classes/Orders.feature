Feature: [06_Automation] - Orders

  Scenario: TC56 - Add new orders
    Given I POST add new orders endpoints
    When I POST HTTP request for add new orders with valid data
    Then I receive valid HTTP response 200 for add new orders

  Scenario: TC57 - Add new orders without set the token
    Given I POST add new orders endpoints 2
    When I POST HTTP request for add new orders without set the token
    Then I receive valid HTTP response 401 for add new orders without set the token

#  Scenario: TC58 - Add new orders with invalid quantity data payload
#    Given I POST add new orders endpoints 3
#    When I POST HTTP request for add new orders with invalid quantity data payload
#    Then I receive valid HTTP response 400 for add new orders with invalid quantity data payload

#  Scenario: TC59 - Add new orders with invalid payload format
#    Given I POST add new orders endpoints 4
#    When I POST HTTP request for add new orders with invalid payload format
#    Then I receive valid HTTP response 400 for add new orders with invalid payload format

  Scenario: TC60 - Get all orders
    Given I GET all orders endpoints
    When I GET HTTP request with valid endpoints for get all orders
    Then I receive valid HTTP response 200 for get all orders

  Scenario: TC61 - Get all orders without token
    Given I GET all orders endpoints 2
    When I GET HTTP request for get all orders without token
    Then I receive valid HTTP response 401 for get all orders without token

  Scenario: TC62 - Get order by ID
    Given I GET orders endpoints by ID
    When I GET orders HTTP request with valid ID
    Then I receive valid HTTP response 200 for get order by ID

  Scenario: TC63 - Get orders by invalid ID with character symbols
    Given I GET orders endpoints by ID 2
    When I GET orders HTTP request invalid ID with character symbols
    Then I receive valid HTTP response 401 for get orders by invalid ID with character symbols

  Scenario:TC64 - Get orders by invalid ID with character alphabet
    Given I GET orders endpoints by ID 3
    When I GET orders HTTP request invalid ID with character alphabet
    Then I receive valid HTTP response 401 for get orders by invalid ID with character alphabet