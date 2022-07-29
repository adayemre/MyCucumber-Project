@admin_login @smoke
Feature: admin login feature

  Scenario: User should be able to login with admin credentials

    Given user is on the login page
    And user clicks on login dropdown
    And user clicks on sign in button
    And  user enters admin_id and admin_password
    |admin_username|admin_password|
    |CWoburn       |Cw192837?     |
    And user clicks on the login button
    Then verify the login is successful
    Then capture the screenshot


    # DATA TABLES:
  #Data tables are used for providing data
  #Data tables are similar to Scenario Outline
  #But Data tables can be used in any step to provide data
