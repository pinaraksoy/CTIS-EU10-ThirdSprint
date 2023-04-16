@loginFeature
@login
Feature: As a user, I should be able to create a poll by clicking on Poll tab under Active Stream

  Scenario: As a user, I should be able to create a poll by clicking on Poll tab under Active Stream
  Given User clicks POLL tab
  When User writes a title in message box
  And User clicks x sign of "All employees" choice to delete it
  And User clicks on "Add persons, groups or department" link
  And User clicks Employees and departments
  And User select multiple contacts
  And User click x sign for closing contacts list
  And User clicks Question and write a question
  And User clicks AnswerFirst and write an answer
  And User clicks AnswerSecond and write an answer
  And User clicks Add question
  And user can delete the added question and its answers
  And User clicks Allow multiple choice  checkbox
  And User clicks SEND button
  And verify user can select multiple choices
  And User clicks More button
  And User clicks Delete  button
  And User clicks OK  button
  Then Verify "The post has been deleted." message is displayed

