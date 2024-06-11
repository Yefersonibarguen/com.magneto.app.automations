Feature: As a user I want to enter the magneto app and verify that my account is active



  Background:

    Given that I as a user wish to open the app

  @Login
  Scenario: Perform the correct login in the magneto App
    When i enter my email
      | email                         |
      | globalmagnetoprueba@gmail.com |
    Then the user enters the home of the App




