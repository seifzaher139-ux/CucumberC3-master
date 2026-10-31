Feature: Login Into OrangeHRM
  In order to access homepage
  as a registered user
  I want to login
maven
  Scenario: valid login1
    Given The regular user is in the login page of orangeHRM
    When The user enter valid credentials
      | username | Admin    |
      | password | admin123 |
    Then The user will be redirected to the homepage

  Scenario: valid login1_1
    Given The regular user is in the login page of orangeHRM
    When The user enter valid credentials
      | username | Admin    |
      | password | admin123 |
    Then The user will be redirected to the homepage

#  Scenario: valid login
#    Given The regular user is in the login page
#    When The user enter valid credentials
#    Then The user will be redirected to the homepage