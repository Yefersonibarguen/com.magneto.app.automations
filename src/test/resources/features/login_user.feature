Feature: As a magneto user I want to enter the application and verify that my account is active



  Scenario: Perform the correct login in the magneto App
    Given that I as a user wish to open the app
    When enter authentication email
      | email                         |
      | globalmagnetoprueba@gmail.com |
    Then verify correct login
