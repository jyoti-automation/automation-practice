Feature: post feature of facebook
  This will test the post functionality at the user wall
  @smoke
Scenario:
  Scenario: post a message on user wall
    Given user should be logged in and should be present on his wall
    When  I type the message in the box
    And  click on the post button
    Then  The message should get posted

    Scenario: post a video on user wall
      When user supply the youtube link as "https://www.google.com" in the text box
      And Click on post button
      Then The video should get posted on user wall
      And the video should have proper thumbnail