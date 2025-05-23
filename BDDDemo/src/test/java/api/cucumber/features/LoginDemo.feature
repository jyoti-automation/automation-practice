

Feature: Test login functionality


  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When user enters "<username>" and "<password>"
    And user clicks on submit
Then user is navigated to the home page

    Examples:
      | username | password   |
      | student  | Password123 |

