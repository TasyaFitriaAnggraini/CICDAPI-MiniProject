Feature: [01_Automation] - Register

  Scenario: TC01 - Register using valid format fullname, email and password
    Given I POST register endpoints
    When I POST HTTP request for register using valid data
    Then I receive valid HTTP response 200 for register

  Scenario: TC02 - Register without using fullname
    Given I POST register endpoints 2
    When I POST HTTP request for register without using fullname
    Then I receive valid HTTP response 400 for register without using fullname

  Scenario: TC03 - Register without using email
    Given I POST register endpoints 3
    When I POST HTTP request for register without using email
    Then I receive valid HTTP response 400 for register without using email

  Scenario: TC04 - Register without using password
    Given I POST register endpoints 4
    When I POST HTTP request for register without using password
    Then I receive valid HTTP response 400 for register without using password

#  Scenario: TC05 - Register with invalid format fullname
#    Given I POST register endpoints 5
#    When I POST HTTP request for register with invalid format fullname
#    Then I receive valid HTTP response 400 for register with invalid format fullname
#
#  Scenario: TC06 - Register with invalid format email
#    Given I POST register endpoints 6
#    When I POST HTTP request for register with invalid format email
#    Then I receive valid HTTP response 400 for register with invalid format email
#
#  Scenario: TC07 - Register with invalid format password
#    Given I POST register endpoints 7
#    When I POST HTTP request for register with invalid format password
#    Then I receive valid HTTP response 400 for register with invalid format password

  Scenario: TC08 - Register with existed account
    Given I POST register endpoints 8
    When I POST HTTP request for register with existed account
    Then I receive valid HTTP response 400 for register with existed account

  Scenario: TC09 - Register with invalid payload format
    Given I POST register endpoints 9
    When I POST HTTP request for register with invalid payload format
    Then I receive valid HTTP response 400 for register with invalid payload format

  Scenario: TC10 - Register without any payload
    Given I POST register endpoints 10
    When I POST HTTP request for register without any payload
    Then I receive valid HTTP response 400 for register without any payload

  Scenario: TC11 - Register with body parameter is empty
    Given I POST register endpoints 11
    When I POST HTTP request for register with body parameter is empty
    Then I receive valid HTTP response 400 for register with body parameter is empty

  Scenario: TC12 - Register with invalid HTTP method
    Given I PUT register endpoints
    When I send request for register with invalid HTTP method
    Then I receive valid HTTP response 405 for register with invalid HTTP method