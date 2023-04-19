@event

Feature:  Users should be able to create events by clicking on Event tab under Activity Stream.


  Background:
    Given the user should enter app with valid "https://qa.ctissolutions.com/" "helpdesk1@cybertekschool.com" "UserUser"
    Given user click to event button

    @CTS10-344
    Scenario: User should be able to add Event start and ending date and time, select "All day"
      When user add new event start date as "11/04/2023"
      And user add new event start time 2 and 15
      Then user add new event end date "20/04/2023"
      Then user add new event end time 15 and 40
      Then user specify the time zone
      Then user click all day radiobutton

     # Examples:
      #  | Starting date | Ending date | Time Zone                        |
       # | 20/04/2023    | 30/04/2023  | (UTC +03:00) Europe/Istanbul     |
        #| 01/08/2023    | 01/02/2025  | (UTC +08:00) Australia/Perth     |


    @CTS10-345
    Scenario: User should be able to set reminder
       # Given user click set reminder button
        Then user set remind count as "30"
        Then user set remind minutes

    @CTS10-346
    Scenario: User should be able to send message by filling the mandatory fields
          When user click to event name button
          And user write event
          Then click send event button

    @CTS10-347
    Scenario: User should be able to cancel sending event at any time before sending
        When user click to event name button
        And user write event
        Then user cancel event