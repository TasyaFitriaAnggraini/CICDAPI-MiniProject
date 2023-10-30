Feature: [02_Automation] - Login

  Scenario: TC13 - Login valid account
    Given I POST login endpoints
    When I POST HTTP request for login using valid data
    Then I receive valid HTTP response 200 for login

  Scenario: TC14 - Login using valid account but empty email
    Given I POST login endpoints 2
    When I POST HTTP request for login using valid account but empty email
    Then I receive valid HTTP response 400 for login using valid account but empty email

  Scenario: TC15 - Login using valid account but empty password
    Given I POST login endpoints 3
    When I POST HTTP request for login using valid account but empty password
    Then I receive valid HTTP response 400 for login using valid account but empty password

  Scenario: TC16 - Login with valid account but change email with password and password with email
    Given I POST login endpoints 4
    When I POST HTTP request for login with valid account but change email with password and password with email
    Then I receive valid HTTP response 400 for login with valid account but change email with password and password with email

#  Scenario: TC17 - Login with valid account but change the email payload with fullname
#    Given I POST login endpoints 5
#    When I POST HTTP request for login with valid account but change the email payload with fullname
#    Then I receive valid HTTP response 400 for login with valid account but change the email payload with fullname

  Scenario: TC18 - Login without payload
    Given I POST login endpoints 6
    When I POST HTTP request for login without payload
    Then I receive valid HTTP response 400 for login without payload

  Scenario: TC19 - Login with invalid format payload
    Given I POST login endpoints 7
    When I POST HTTP request for login with invalid format payload
    Then I receive valid HTTP response 400 for login with invalid format payload

  Scenario: TC20 - Login with body parameter is empty
    Given I POST login endpoints 8
    When I POST HTTP request for login with body parameter is empty
    Then I receive valid HTTP response 400 for login with body parameter is empty

  Scenario: TC21 - Login with invalid HTTP method
    Given I PUT login endpoints 9
    When I send request for login with invalid HTTP method
    Then I receive valid HTTP response 405 for login with invalid HTTP method