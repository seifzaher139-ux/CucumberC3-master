Feature: Login Into OrangeHRM
  In order to access homepage
  as a registered user
  I want to login

  @smoke @Login @regression
  Scenario: valid login2
    Given The regular user is in the login page of orangeHRM
    When The user enter valid credentials
      | username | Admin    |
      | password | admin123 |
    Then The user will be redirected to the homepage

  Scenario: valid login 14
    Given The regular user is in the login page of orangeHRM
    When The user enter valid credentials
      | username | Admin    |
      | password | admin123 |
    Then The user will be redirected to the homepage

#  Examples:
#    | username | password   |
#    | "Admin"  | "admin123" |
#    | "Islam"  | "123"      |
#    | "Ahmed"  | "345"      |
#  Scenario: valid login
#    Given The regular user is in the login page
#    When The user enter valid credentials
#    Then The user will be redirected to the homepage