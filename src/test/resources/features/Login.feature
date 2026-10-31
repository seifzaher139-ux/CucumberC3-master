Feature: Sauce Lab Login
  Background:
    Given I am on the login Page

    Scenario: Successful Login
      When The Standard User Enters Valid Username And Password
      And Clicks Login Button
      Then The user should be redirected to the homepage

#  Scenario: Successful Login 2
#    When The Standard User Enters Valid Username And Password
#    And Clicks Login Button
#    Then The user should be redirected to the homepage