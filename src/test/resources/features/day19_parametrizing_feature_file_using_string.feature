@parameter_search
Feature: Search_Functionality

  Background: user_is_on_the_page
    Given user is on the google page

    @i_search
    Scenario: TC01_iphone_search
      When user search for "iPhone"
      Then verify the result has "iPhone"
      Then close the application

    Scenario: TC02_teapot_search
      When user search for "Tea pot"
      Then verify the result has "Tea pot"
      Then close the application

    Scenario: TC02_tesla_search
       When user search for "Tesla"
       Then verify the result has "Tesla"
       Then close the application

    Scenario: TC02_honda_search
      When user search for "honda"
      Then verify the result has "honda"
      Then close the application
