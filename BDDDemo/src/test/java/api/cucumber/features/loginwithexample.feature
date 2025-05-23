Feature: login Action

  Scenario Outline: successful login with valid Credentials
    Given user is on Home page
    When user Navigate to LogIn page
    And user enters"<username>"and"<password>"
    Then Message displayed Login Successfully
    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | error_user              | secret_sauce |
      | visual_user             | secret_sauce |

