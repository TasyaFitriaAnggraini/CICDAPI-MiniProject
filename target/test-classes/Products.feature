Feature: [05_Automation] - Product

  Scenario: TC37 - Get all products
    Given I GET all products endpoints
    When I GET HTTP request with valid endpoints all products
    Then I receive valid HTTP response 200 for get all products

  Scenario: TC38 - Get all products using invalid endpoints
    Given I GET all products endpoints 2
    When I GET HTTP request with invalid endpoints
    Then I receive valid HTTP response 404 for get all products using invalid endpoints

  Scenario: TC39 - Add new products
    Given I POST add new products endpoints
    When I POST HTTP request for add new products
    Then I receive valid HTTP response 200 for add new products

  Scenario: TC40 - Add new products without name payload
    Given I POST add new products endpoints 2
    When I POST HTTP request for add new products without name payload
    Then I receive valid HTTP response 500 for add new products without name payload

#  Scenario: TC41 - Add new products with only space on name payload
#    Given I POST add new products endpoints 3
#    When I POST HTTP request for add new products with only space on name payload
#    Then I receive valid HTTP response 400 for add new products with only space on name payload

  Scenario: TC42 - Add new product with blank name payload
    Given I POST add new products endpoints 4
    When I POST HTTP request for add new products with blank name payload
    Then I receive valid HTTP response 500 for add new products with blank name payload

#  Scenario: TC43 - Add new product without price payload
#    Given I POST add new products endpoints 5
#    When I POST HTTP request for add new products without price payload
#    Then I receive valid HTTP response 500 for add new products without price payload

  Scenario: TC44 - Add new product with blank price payload
    Given I POST add new products endpoints 6
    When I POST HTTP request for add new products with blank price payload
    Then I receive valid HTTP response 400 for add new products with blank price payload

  Scenario: TC45 - Add new product with only space on price payload
    Given I POST add new products endpoints 7
    When I POST HTTP request for add new products with only space on price payload
    Then I receive valid HTTP response 400 for add new products with only space on price payload

#  Scenario: TC46 - Add new product without categories payload
#    Given I POST add new products endpoints 8
#    When I POST HTTP request for add new products without categories payload
#    Then I receive valid HTTP response 400 for add new products without categories payload

#  Scenario: TC47 - Add new product with invalid categories payload
#    Given I POST add new products endpoints 9
#    When I POST HTTP request for add new products with invalid categories payload
#    Then I receive valid HTTP response 200 for add new products with invalid categories payload

  Scenario: TC48 - Add new product with body parameter is empty
    Given I POST add new products endpoints 10
    When I POST HTTP request for add new products with body parameter is empty
    Then I receive valid HTTP response 400 for add new products with body parameter is empty

  Scenario: TC49 - Add new products with invalid HTTP method
    Given I PUT add new products endpoints
    When I send request for add new products with invalid HTTP method
    Then I receive valid HTTP response 405 for for add new products with invalid HTTP method

  Scenario: TC50 - Get products by ID
    Given I GET products endpoints by ID
    When I GET HTTP request for products with valid ID
    Then I receive valid HTTP response 200 for get products by ID

  Scenario: TC51 - Get product using invalid ID with character symbols
    Given I GET products endpoints by ID 2
    When I GET HTTP request for products using invalid ID with character symbols
    Then I receive valid HTTP response 500 for get products using invalid ID with character symbols

  Scenario: TC52 - Get categories by invalid ID with character alphabet
    Given I GET products endpoints by ID 3
    When I GET HTTP request for products using invalid ID with character alphabet
    Then I receive valid HTTP response 400 for get products using invalid ID with character alphabet

  Scenario: TC53 - Delete a products by ID
    Given I DELETE a products endpoints by ID
    When I DELETE HTTP request for a products with valid ID
    Then I receive valid HTTP response 200 for delete a products

  Scenario: TC54 - Delete a products using invalid ID with character symbols
    Given I DELETE a products endpoints by ID 2
    When I DELETE HTTP request for a products using invalid ID with character symbols
    Then I receive valid HTTP response 500 for a products using invalid ID with character symbols

  Scenario: TC55 - Delete a products using invalid ID with character alphabet
    Given I DELETE a products endpoints by ID 3
    When I DELETE HTTP request for a products using invalid ID with character alphabet
    Then I receive valid HTTP response 400 for a products using invalid ID with character alphabet

