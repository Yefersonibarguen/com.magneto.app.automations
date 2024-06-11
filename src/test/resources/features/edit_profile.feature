Feature: Log in to an account, edit the profile and verify that it works

  Scenario: Enter the profile and verify the edition
    Given that I as a user wish to open the app
    When enter the profile and see all the data
      | email                         |
      | globalmagnetoprueba@gmail.com |
    Then verify that the profile can be edited