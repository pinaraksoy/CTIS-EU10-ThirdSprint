@loginFeature
  @login
  @wip
@CTS10-330 @CRM
Feature: Upload Files Functionality

  Background:
		#@CTS10-328
    Given the user should enter app with valid "https://qa.ctissolutions.com/" "helpdesk1@cybertekschool.com" "UserUser"
    And User clicks to Send Message text under Message menu and see Send button
    And User clicks to Upload files icon
    And Verify user can see Upload files options



  @CTS10-329 @CRM
  Scenario: User should be able to upload multiple files at the same time
    When User should be able to upload three file at same time
    Then Verify users uploaded files