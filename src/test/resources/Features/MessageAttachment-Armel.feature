
@messageAttachment


Feature: As a user, I should be able to add link, insert video, mention, quote, add tag in message.

  Background:
    Given user should enter app with valid "https://qa.ctissolutions.com/" "helpdesk1@cybertekschool.com" "UserUser"
    And user should clicks the Activity Stream button
    And user should clicks the message field

    Scenario: user should be able to add mentions
      When user clicks on the add mention icon
      And user add people to mention
      And user should see selected people on the recipient field
      And user clicks on the send button
      Then user sees mentioned people in the message that has been sent

    Scenario: user should be able to attach a link to the specified text
      When user clicks the link icon
      And user fills in the text field
      And user fills in the link field
      And user clicks the save button
      And user clicks on the send button
      Then user sees attached link in the message that has been sent

    Scenario Outline: user should be able to insert YouTube and Vimeo videos
      When user clicks insert video button
      And user inserts "<link>" video to the video source field
      And verify [FVD404] The video was not found; message is not appear
      And user clicks the save button
      And verify video is inserted
      And user clicks on send button
      Then user sees inserted video in the message that has been sent
      Examples:

        | link					                      |
        | https://vimeo.com/49385450                  |
        | https://youtu.be/9U684GbFST4                |

    Scenario: user should be able to cancel links before sending message
      When user clicks the link button
      And user fills in the text field “”
      And user fills in the link field “”
      And user clicks the save button
      And user should see link text appear on the message field
      And user deletes the link before sending
      And user clicks send button
      Then user deleted link is not attached to the message that has been sent

    Scenario:  User should be able to cancel videos before sending the message
      When user clicks insert video button
      And user inserts link video to the video source filed
      And verify [FVD404] The video was not found; message is not appear
      And user clicks the save button
      And verify video is inserted
      And delete the inserted video
      And verify video is deleted
      And user clicks on send button
      Then user deleted video is not attached to the message that has been sent

    Scenario: User should be able to add tags to messages.
      When user clicks tag button
      And user adds tag
      And user clicks on the add button
      And user sees tag added to the tag field
      And user clicks on send button
      Then user sees added tag in the message that has been sent

    Scenario:  User should be able to remove tags before sending the message
      When user clicks tag button
      And user adds tag
      And user clicks on the add button
      And user sees tag added to the tag field
      And user delete added tag
      And verify that the tag field is empty
      And user clicks on send button
      Then user deleted tags is not attached to the message that has been sent

