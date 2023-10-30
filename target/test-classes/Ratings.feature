Feature: [07_Automation] - Ratings

  Scenario: TC65 - Give products ratings
    Given I POST give products ratings endpoints
    When I POST HTTP request for give products ratings
    Then I receive valid HTTP response 200 for give products ratings

  Scenario: TC66 - Give product ratings without setting token
    Given I POST give products ratings endpoints 2
    When I POST HTTP request for give products ratings without setting token
    Then I receive valid HTTP response 401 for give products ratings without setting token

#  Scenario: TC67 - Give product ratings with invalid count data payload
#    Given I POST give products ratings endpoints 3
#    When I POST HTTP request for give products ratings with invalid count data payload
#    Then I receive valid HTTP response 400 for give products ratings with invalid count data payload

  Scenario: TC68 - Give products ratings with unavailable
    Given I POST give products ratings endpoints 4
    When I POST HTTP request for give products ratings with unavailable
    Then I receive valid HTTP response 401 for give products ratings with unavailable

  Scenario: TC69 - Give products ratings with invalid HTTP method
    Given I set PUT give products ratings endpoints
    When I send HTTP request for give products ratings with invalid HTTP method
    Then I receive valid HTTP response 405 for give products ratings with invalid HTTP method

  Scenario: TC70 - Get products ratings
    Given I GET products ratings endpoints
    When I GET HTTP request for products ratings
    Then I receive valid HTTP response 200 for get products ratings

  Scenario: TC71 - Get product rating using invalid product ID with character symbols
    Given I GET products ratings endpoints by ID
    When I GET HTTP request for products ratings using invalid products ID with character symbols
    Then I receive valid HTTP response 500 for get products ratings using invalid product ID with character symbols

  Scenario: TC72 - Get product rating using invalid product id with character alphabet
    Given I GET products ratings endpoints by ID 2
    When I GET HTTP request for products ratings using invalid products ID with character alphabet
    Then I receive valid HTTP response 400 for get products ratings using invalid product ID with character alphabet