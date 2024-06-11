Feature: Filter work by different categories and verify that it works correctly

  Scenario: Enter the categories and verify their operation
    Given that I as a user wish to open the app
    When enter the categories
      | email                         |
      | globalmagnetoprueba@gmail.com |
    Then Check the functionality of the categories

