Feature: As a user I want to enter the magneto app and register

  Scenario: Make a registration and verify that it progresses until the code is sent
    Given that I as a user wish to open the app
    When enter the registry and enter the data
      | emailNew                       |
      | globalmagnetoprueba@gmail.com |
    Then verify that the registration allows you to advance to the request for the telephone number
