
@login

@messageAttachmentArmel
Feature: As a user, I should be able to add link, insert video, mention, quote, add tag in message.

  Background:
    Given the user should enter app with valid "https://qa.ctissolutions.com/" "hr15@cybertekschool.com" "UserUser"
    And user should clicks the Activity Stream button
    And user should clicks the message field

    @this
  Scenario: user should be able to add mentions
    When user clicks on the add mention icon
    And user should see selected people on the recipient field
    And user clicks on the send button
    Then user sees mentioned people in the message that has been sent

  Scenario: user should be able to attach a link to the specified text
    When user clicks the link icon
    And user fills the text and link in the field
    And user clicks on the send button after link added
    Then user sees attached link in the message that has been sent

  Scenario Outline: user should be able to insert YouTube and Vimeo videos
    When user clicks insert video button
    And user inserts "<link>" video to the video source field
    And verify [FVD404] The video was not found; message is not appear
    And user clicks the video save button
    And user clicks on send button
    Then user sees inserted video in the message that has been sent
    Examples:

      | link					                    |
      | https://vimeo.com/49385450                  |
      | https://youtu.be/9U684GbFST4                |

  Scenario: user should be able to cancel links before sending message
    When user clicks the link button
    And user attach link and text
    And user deletes the link before sending
    And user clicks send button after link is deleted
    Then user deleted link is not attached to the message that has been sent

  Scenario:  User should be able to cancel videos before sending the message
    When user insert video
    And user delete added video
    And user clicks on send button after video is deleted
    Then user deleted video is not attached to the message that has been sent

  Scenario: User should be able to add tags to messages.
    When user clicks tag button
    And user adds tag
    And user clicks on the add button
    And user clicks on send button after tags added
    Then user sees added tag in the message that has been sent

  Scenario:  User should be able to remove tags before sending the message
    When user add tags
    And user delete added tag
    And user clicks on send button after added tag deleted
    Then user deleted tags is not attached to the message that has been sent

