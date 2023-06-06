Feature: Log In Functionality

  In order to do processes on the QA APP
  As a regular user
  I want to log in succesfully

  Scenario: Log In succesfully

    Given I am in the Log In page of the QA APP
    When I Log In into my account
    Then I should have entered my session
    When I try to log out
    Then I should be able to logout successfully