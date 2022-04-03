Feature: Test Koustuv home page - Verify

  Scenario: Validate Koustuv homepage load
    Given User Loads the proper URL
    When The page is loaded properly
    And User clicks faculty
    Then User is redirected to faculty page
    And HOD name is displayed

