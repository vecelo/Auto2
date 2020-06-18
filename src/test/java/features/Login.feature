Feature: Application login

  Scenario: Homepage default login

    Given User is on Landing page
    When User login into application with "abc" and password "123"
    Then Home page is displayed
    And Portal text is displayed "true"

  Scenario: Homepage invalid login

    Given User is on Landing page
    When User login into application with "def" and password "456"
    Then Home page is displayed
    And Portal text is displayed "false"