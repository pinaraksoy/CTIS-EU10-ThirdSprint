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

  @CTS10-329 @CRM
  Scenario: User should be able to upload multiple files at the same time
    When User should be able to upload three file at same time
    Then Verify users uploaded files

  @CTS10-334 @CRM
  Scenario: User should be able to upload files in pdf, txt, docx formats.
    When user should be able to upload files in pdf txt docx formats
    Then Verify users uploaded files in pdf txt docx formats

  @CTS10-335 @CRM
  Scenario: User should be able to upload files in jpeg, gif ,png formats.
    When user should be able to upload files in jpeg gif png formats
    Then Verify users uploaded files in jpeg gif png formats